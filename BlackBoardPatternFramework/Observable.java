import java.util.ArrayList;
import java.util.List;

public class Observable {

    private List<Observer> observers;
    private IBlackBoardObject blackBoardObject;
    private boolean changed;
    private final Object MUTEX = new Object();

    public Observable() {
        this.observers = new ArrayList<>();
    }

    public void register(Observer obj) {
        if (obj == null)
            throw new NullPointerException("Null Observer");
        synchronized (MUTEX) {
            if (!observers.contains(obj))
                observers.add(obj);
        }
    }

    public void unregister(Observer obj) {
        synchronized (MUTEX) {
            observers.remove(obj);
        }
    }

    public void notifyObservers() {
        List<Observer> observersLocal = null;

        // Synchronization is used to make sure any observer registered after message is received is not notified
        synchronized (MUTEX) {
            if (!changed)
                return;
            observersLocal = new ArrayList<>(this.observers);
            this.changed = false;
        }
        for (Observer obj : observersLocal) {
            obj.update();
        }
    }

    public Object getUpdate(Observer obj) {
        return this.blackBoardObject;
    }

    public void setChanged(IBlackBoardObject blackBoardObject) {
        this.blackBoardObject = blackBoardObject;
        this.changed = true;
    }
}