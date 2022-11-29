public abstract class AbstractKnowledgeSource implements IKnowledgeSource {

     protected IBlackBoardObject bbo;
     protected IBlackBoard bb;

     public void run() {
          updateBlackBoardObject(process(bbo));
     }

     public void updateBlackBoardObject(IBlackBoardObject bbo) {
          bb.addBlackBoardObject(bbo);
     }

}
