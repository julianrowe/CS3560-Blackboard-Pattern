public abstract class AbstractBlackBoardObject implements IBlackBoardObject {

     protected boolean isReady;

     public boolean isReady() {
          return isReady;
     }

     public void setReady(boolean isReady) {
          this.isReady = isReady;
     }

}
