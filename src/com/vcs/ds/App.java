package com.vcs.ds;

import com.vcs.ds._10_model.data.*;
import com.vcs.ds._10_model.input.RequestInput;
import com.vcs.ds._50_request.Request;
import com.vcs.ds._60_proposal.*;
import com.vcs.ds._30_producer.Producer;

public class App {

    DASData<Request> requestData;
    DASData<Producer> producersData;
    DASData<Proposal> proposalsData;
    DASData<DASData<Proposal>> answersData;

    public App(DASData<Request> requestData, DASData<Producer> producersData, DASData<Proposal> proposalsData, DASData<DASData<Proposal>> answersData) {

        this.producersData = producersData;
        this.proposalsData = proposalsData;
        this.answersData = answersData;
    }

    public App() {

        requestData = RequestsDBFactory.getDASInstance();
        producersData = ProducersDBFactory.getDbInstance();
        proposalsData = ProposalsDBFactory.getDbInstance();
        answersData = AnswersDBFactory.getDbInstance();
    }

    public void runApp() {

//        Receiving Request for production: Create mock RequestInput
        RequestInput requestInput = new RequestInput();

//        Create the Request
        Request request = new Request(requestInput.getClientName(), requestInput.getMaxDimensionMM(), requestInput.getVolumeCM3(), requestInput.getDeadline());// TODO: 18.8.18 Stage 1.1 get from list

//        Put the Request in to RequestsStaticDASData
        requestData.getData().add(request);


        //Get availableProposals list which meets Request's time requirements

        ProposalTimeEvaluator proposalTimeEvaluator = new ProposalTimeEvaluator();
        DASData<Proposal> answer = proposalTimeEvaluator.availableProposals(request, producersData);

//        Put Proposals to AnswersStaticDASData
        answersData.getData().add(answer);


        //exeptions todo
        //tests todo


        System.out.println("Pabaiga");


    }
}

// TODO: 18.8.20 Stage2
//       Sort ProposalsStaticDASData acording to earlyFinish
//        If Client is new, create new Client id, put in to ClientDatabase todo Stage2
//        Create OutputToClient put Producer name, availale time, earlyFinish todo
//Give id to Answer
//       todo Stage3:
//        Receive ProducerInput
//        Check validity
//        Create ProducerId
//        Put to ProducersStaticDASData
//
//        Active/NotActive Producer, ProposalsStaticDASData