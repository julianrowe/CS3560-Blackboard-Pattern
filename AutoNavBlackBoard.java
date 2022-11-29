public class AutoNavBlackBoard extends AbstractBlackBoard { 

     public void addBlackBoardObject(IBlackBoardObject bbo) {
    	 
          System.out.println("=>\tBlackboard received BlackBoardObject "+bbo.getClass().getName());

          super.addBlackBoardObject(bbo);
     }
}
