import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public abstract class AbstractBlackBoardController extends Observer implements IBlackBoardController {

     protected List<IKnowledgeSource> ksList = new ArrayList<IKnowledgeSource>();

     protected ExecutorService exsvc;

     @Override
     public void update() {
          if(((IBlackBoardObject)observable.getUpdate(this)).isReady()){
               execOutcome((IBlackBoardObject) observable.getUpdate(this));
          }
          else {
               for (IKnowledgeSource ks : ksList) {
                    if (ks.isInterested((IBlackBoardObject) observable.getUpdate(this), (AbstractBlackBoard) observable)) {
                         enrollKnowledgeSource(ks, exsvc);
                         break;
                    }
               }
          }
     }

     public void setKnowledgeSourceList(List<IKnowledgeSource> ksList) {
          this.ksList = ksList;
     }

     public void enrollKnowledgeSource(IKnowledgeSource ks, ExecutorService exsvc) {
          exsvc = Executors.newFixedThreadPool(1);
          exsvc.submit(ks);
          exsvc.shutdown();
     }
}
