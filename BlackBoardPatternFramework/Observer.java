public class Observer {

    protected Observable observable;

    public void update() {}

    public void setObservable(Observable observable) {
        this.observable = observable;
    }
}