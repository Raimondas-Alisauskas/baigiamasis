import com.vcs.ds._10_model.data.*;
import com.vcs.ds.App;
import com.vcs.ds._30_producer.Producer;
import com.vcs.ds._50_request.Request;
import com.vcs.ds._60_proposal.Proposal;

import java.util.List;

public class TestRun {

    public static void main(String[] args) {

        DASData<Request> requestData = new DASData<Request>() {
            @Override
            public List<Request> getData() {
                return null;
            }
        }
        DASData<Producer> producersData = ProducersDBFactory.getDbInstance();
        DASData<Proposal> proposalsData = ProposalsDBFactory.getDbInstance();
        DASData<DASData<Proposal>> answersData = AnswersDBFactory.getDbInstance();

        TestDataPopulator testDataPopulator = new TestDataPopulator();
//        testDataPopulator.putProducerData(testDataPopulator.producersData);

        App app = new App(requestData, producersData, proposalsData, answersData);
        app.runApp();


    }

}
