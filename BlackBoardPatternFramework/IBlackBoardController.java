import java.util.List;
import java.util.concurrent.ExecutorService;

public interface IBlackBoardController {

     public void setKnowledgeSourceList(List<IKnowledgeSource> ksList);

     public void enrollKnowledgeSource(IKnowledgeSource ks, ExecutorService exsvc);

     public void execOutcome(IBlackBoardObject bbo);
}
