public interface IKnowledgeSource extends Runnable {

     public boolean isInterested(IBlackBoardObject bbo, IBlackBoard bb);

     public IBlackBoardObject process(IBlackBoardObject bbo);

     public void updateBlackBoardObject(IBlackBoardObject bbo);
}
