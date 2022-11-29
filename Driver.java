import java.util.ArrayList;
import java.util.List;

public class Driver {

     private final AutoNavBlackBoard bb = new AutoNavBlackBoard();
     private final AutoNavBBController controller = new AutoNavBBController();

     public static void main(String[] args) {

          Driver feeder = new Driver();

          feeder.addKnowledgeSources();
          feeder.addController();
          feeder.addBlackBoardObjects();
     }

     public void addBlackBoardObjects() {
          int i = 0;
          while (i < 2) {
               bb.addBlackBoardObject(new FrontVehicleDataBBO());
               bb.addBlackBoardObject(new RightVehicleDataBBO());
               try {
                    Thread.sleep(1000);
               } catch (InterruptedException iex) {
                    System.out.println(iex.getMessage());
               }
               i++;
          }
     }

     public void addController() {
          bb.register(controller);
          controller.setObservable(bb);
     }

     public void addKnowledgeSources() {

          List<IKnowledgeSource> ksList = new ArrayList<IKnowledgeSource>();
          ksList.add(new RightVehicleDataKS());
          ksList.add(new FrontVehicleDataKS());
          ksList.add(new DeltaSpeedDataKS());
          controller.setKnowledgeSourceList(ksList);
     }
}