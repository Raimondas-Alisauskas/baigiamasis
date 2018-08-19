package com.vcs.ds;

import com.vcs.ds._10_model.database.ClientsDatabase;
import com.vcs.ds._10_model.database.ProducersDatabase;
import com.vcs.ds._10_model.database.ProposalsDatabase;
import com.vcs.ds._10_model.database.RequestsDatabase;
import com.vcs.ds._10_model.input.RequestInput;
import com.vcs.ds._20_client.Client;
import com.vcs.ds._20_request.Request;
import com.vcs.ds._30_proposal.PropTimeCalculator;
import com.vcs.ds._30_proposal.Proposal;
import com.vcs.ds._40_producer.Producer;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Main {

    public static void main(String[] args) {

//      Create mock initial Databases
//        ClientsDatabase
        ClientsDatabase clientsDatabase = new ClientsDatabase();
//        RequestsDatabase
        RequestsDatabase requestsDatabase = new RequestsDatabase();
//        ProducersDatabase
        ProducersDatabase producersDatabase = new ProducersDatabase();
//        ProposalsDatabase
        ProposalsDatabase proposalsDatabase = new ProposalsDatabase();
//
//
//        Receiving Request for production: Create mock RequestInput
        RequestInput requestInput = new RequestInput();

//        If Client is new, create new Client id, put in to ClientDatabase todo Stage2

//        Create new Request
        Request thisRequest = new Request(requestInput.getClientName(), requestInput.getMaxDimensionMM(), requestInput.getVolumeCM3(), requestInput.getDeadline());// TODO: 18.8.18 Stage 1.1 get from list

//        Put Request in to RequestsDatabase
        requestsDatabase.getRequestsList().add(thisRequest);

//        Create Proposals for all Producers

        for (int i = 0; i < producersDatabase.getProducersList().size(); i++) {
            String requestId = thisRequest.getRequestId();
            String producerName = producersDatabase.getProducersList().get(i).getProducerName();
            // Calculate productionDuration

            //check Produser availability and earlyFinish date
            PropTimeCalculator propTimeCalculator = new PropTimeCalculator(requestId, producerName);
            //           if (propTimeCalculator.isProducerAvailable()) {
            LocalDateTime availableStart = producersDatabase.getProducersList().get(i).getAvailableStart();
            LocalDateTime availableFinish = producersDatabase.getProducersList().get(i).getAvailableFinish();

            //              propTimeCalculator.calculateEarlyFinish();
        }


        //          Proposal proposal = new Proposal(requestId, producerName);
        //          proposalsDatabase.getProposalsList().add(proposal);


//        this.producerIsAvailable = propTimeCalculator.isProducerAvailable();
//        if (producerIsAvailable) {
//
//            availableStart = propTimeCalculator.getAvailableStart();
//            availableFinish = propTimeCalculator.getAvailableFinish();
//
//        } else {
//
//            System.out.println(producerIsAvailable);
//        }


//        Sort ProposalsValid todo
//        Put ProposalsValid to ProposalsDatabase todo
//
//        Create OutputToClient put Producer name, availale time, price todo

        System.out.println("Pabaiga");
//
//       todo Stage3:
//        Receive ProducerInput
//        Check validity
//        Create ProducerId
//        Put to ProducersDatabase
//
//        Active/NotActive Producer, Proposal


    }
}
