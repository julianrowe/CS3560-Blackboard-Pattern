public abstract class AbstractBlackBoard extends Observable implements IBlackBoard {
     
     public void addBlackBoardObject(IBlackBoardObject bbo) {
          setChanged(bbo);
          notifyController();
     }

     public void notifyController() {
          notifyObservers();
     }
}
