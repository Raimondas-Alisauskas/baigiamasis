package com.vcs.ds._20_General;

import com.vcs.ds._10_model.data.*;
import com.vcs.ds._10_model.input.RequestInput;
import com.vcs.ds._50_request.Request;
import com.vcs.ds._10_model.data.RequestsDBFactory;
import com.vcs.ds._60_proposal.*;
import com.vcs.ds._30_producer.Producer;
import com.vcs.ds._10_model.data.ProducersDBFactory;
import com.vcs.ds._10_model.data.AnswersDBFactory;

import java.util.List;

public class App {

    public void runApp(DataInterface<Request> requestData, DataInterface<Producer> producersData, DataInterface<Proposal> proposalsData, DataInterface<DataInterface<Proposal>> answersData) {

//        Receiving Request for production: Create mock RequestInput
        RequestInput requestInput = new RequestInput();

//        Create the Request
        Request request = new Request(requestInput.getClientName(), requestInput.getMaxDimensionMM(), requestInput.getVolumeCM3(), requestInput.getDeadline());// TODO: 18.8.18 Stage 1.1 get from list

//        Put the Request in to RequestsStaticData
        requestData.getData().add(request);



        //Get availableProducers list which meets Request's time requirements

        ProposalTimeEvaluator proposalTimeEvaluator = new ProposalTimeEvaluator();
        DataInterface<Producer> availableProducers =  proposalTimeEvaluator.availableProducers(request, producersData);

//        Put Proposals to AnswersStaticData
        answersData.getData().add(proposalsData);

//        Create OutputToClient put Producer name, availale time, earlyFinish todo


        //exeptions todo
        //tests todo


        System.out.println("Pabaiga");


    }
}

// TODO: 18.8.20 Stage2
//       Sort ProposalsStaticData acording to earlyFinish
//        If Client is new, create new Client id, put in to ClientDatabase todo Stage2
//       todo Stage3:
//        Receive ProducerInput
//        Check validity
//        Create ProducerId
//        Put to ProducersStaticData
//
//        Active/NotActive Producer, ProposalsStaticData