package com.vcs.ds;

import com.vcs.ds._10_model.data.*;
import com.vcs.ds._20_General.App;
import com.vcs.ds._30_producer.Producer;
import com.vcs.ds._50_request.Request;
import com.vcs.ds._60_proposal.Proposal;

public class Run {

    public static void main(String[] args) {

        DataInterface<Request> requestData = RequestsDBFactory.getDbInstance();
        DataInterface<Producer> producersData = ProducersDBFactory.getDbInstance();
        DataInterface<Proposal> proposalsData = ProposalsDBFactory.getDbInstance();
        DataInterface<DataInterface<Proposal>> answersData = AnswersDBFactory.getDbInstance();

        App app = new App();
        app.runApp(requestData, producersData, proposalsData, answersData);


    }
}
