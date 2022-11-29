public class FrontVehicleDataKS extends AbstractKnowledgeSource {

     public boolean isInterested(IBlackBoardObject bbo, IBlackBoard bb) {

          if (bbo instanceof FrontVehicleDataBBO) {
               this.bbo = (FrontVehicleDataBBO) bbo;
               this.bb = bb;

               return true;
          }

          return false;
     }

     public IBlackBoardObject process(IBlackBoardObject bbo) {
          IBlackBoardObject deltaSpeedDataBBO = new DeltaSpeedDataBBO();

          try {
               // Test KS
               Thread.sleep(1000);
          } catch (InterruptedException iex) {
               System.out.println(iex.getMessage());
          }

          System.out.println("=>\tFrontVehicleDataKS processed FrontVehicleDataBBO");
          return deltaSpeedDataBBO;

     }
}