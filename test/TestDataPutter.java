import com.vcs.ds._20_request.Request;
import com.vcs.ds._30_proposal.ProposalsStaticData;
import com.vcs.ds._40_producer.Producer;

import java.util.List;

public class TestDataPutter {


    private List<Producer> producersList;
    private  List<Request> requestsList;
    private  List<ProposalsStaticData> proposalsList;
    private  List<List<ProposalsStaticData>> proposalsDatalist;


    public TestDataPutter() {
        this.producersList = producersList;

//    public ProducersData() {
//        ProducersList = new ArrayList<>();
//        ProducersList.add(0, new Producer("P10", "1", "2018-09-10", "2018-09-15", "1", "24"));
//        ProducersList.add(1, new Producer("P11", "2", "2018-09-01", "2018-10-15", "2", "12"));
//        ProducersList.add(1, new Producer("P12", "1", "2018-09-10", "2018-09-12", "3", "18"));
//        ProducersList.add(1, new Producer("P13", "2", "2018-09-20", "2018-10-01", "1", "24"));
//    }

        this.requestsList = requestsList;
        //    public RequestsStaticData() {
//    requestsList = new ArrayList<>();
//        requestsList.add(0, new Request("C10", "100", "100", "2018-09-15"));
//        requestsList.add(1, new Request("C1", "200", "200", "2018-09-10"));
//        requestsList.add(2, new Request("C2", "200", "100", "2018-09-20"));
//        requestsList.add(3, new Request("C3", "300", "300", "2018-09-10"));
//    }

        this.proposalsList = proposalsList;

        this.proposalsDatalist = proposalsDatalist;
    }
}
