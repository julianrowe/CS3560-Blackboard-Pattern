public class DeltaSpeedDataKS extends AbstractKnowledgeSource {

     @Override
     public boolean isInterested(IBlackBoardObject bbo, IBlackBoard bb) {

          if (bbo instanceof DeltaSpeedDataBBO) {
        	  
               this.bbo = (DeltaSpeedDataBBO)bbo;
               this.bb = bb;

               return true;
          }
          return false;
     }

     public IBlackBoardObject process(IBlackBoardObject bbo) {
    	 
          IBlackBoardObject brakePedalBBO = new BrakePedalBBO();
          
          ((BrakePedalBBO)brakePedalBBO).setReady(true);
          
          System.out.println("=>\tDeltaSpeedDataKS processed DeltaSpeedDataBBO");
          return brakePedalBBO;

     }
}
