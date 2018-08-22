package com.vcs.ds;

import com.vcs.ds._10_model.data.*;
import com.vcs.ds._10_model.input.RequestInput;
import com.vcs.ds._50_request.Request;
import com.vcs.ds._50_request.RequestsDBFactory;
import com.vcs.ds._60_proposal.*;
import com.vcs.ds._30_producer.Producer;
import com.vcs.ds._30_producer.ProducersDBFactory;
import com.vcs.ds._70_answers.AnswersDBFactory;

import java.util.List;

public class Main {

    public static void main(String[] args) {


//       Create generic request and producers Data's
        DataInterface<Request> requestData = RequestsDBFactory.getDbInstance();
        DataInterface<Producer> producersData = ProducersDBFactory.getDbInstance();
        DataInterface<Proposal> proposalsData = ProposalsDBFactory.getDbInstance();
        DataInterface<DataInterface<Proposal>> answersData = AnswersDBFactory.getDbInstance();
//
//        Receiving Request for production: Create mock RequestInput
        RequestInput requestInput = new RequestInput();

//        Create the Request
        Request request = new Request(requestInput.getClientName(), requestInput.getMaxDimensionMM(), requestInput.getVolumeCM3(), requestInput.getDeadline());// TODO: 18.8.18 Stage 1.1 get from list

//        Put the Request in to RequestsStaticData
        requestData.getData().add(request);

//        Evaluate Proposals for meeting Request's time requirements
        ProposalTimeEvaluator proposalTimeEvaluator = new ProposalTimeEvaluator();
        List<Proposal> a = proposalTimeEvaluator.availableProducers(request, producersData);// TODO ? kaip paversti i  DataInterface<Proposal>




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