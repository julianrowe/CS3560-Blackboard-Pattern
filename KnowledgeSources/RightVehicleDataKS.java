public class RightVehicleDataKS extends AbstractKnowledgeSource {

     public boolean isInterested(IBlackBoardObject bbo, IBlackBoard bb) {
          if (bbo instanceof RightVehicleDataBBO) {
               this.bbo = (RightVehicleDataBBO) bbo;
               this.bb = bb;

               return true;
          }

          return false;
     }

     public IBlackBoardObject process(IBlackBoardObject bbo) {
          IBlackBoardObject deltaSpeedBBO = new DeltaSpeedDataBBO();

          try {
               Thread.sleep(1200);

          } catch (InterruptedException iex) {
               System.out.println(iex.getMessage());
          }
          System.out.println("=>\tRightVehicleDataKS processed RightVehicleDataBBO");

          return deltaSpeedBBO;
     }
}
