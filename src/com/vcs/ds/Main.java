package com.vcs.ds;

import com.vcs.ds._10_model.database.ClientsDatabase;
import com.vcs.ds._10_model.database.ProducersDatabase;
import com.vcs.ds._10_model.database.ProposalsDatabase;
import com.vcs.ds._10_model.database.RequestsDatabase;
import com.vcs.ds._10_model.input.RequestInput;
import com.vcs.ds._20_request.Request;
import com.vcs.ds._30_proposal.PropTimeCalculator;
import com.vcs.ds._30_proposal.Proposal;
import com.vcs.ds._50_General.IdGenerator;

import java.time.Duration;
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

//        Create the Request to answer
        Request theRequest = new Request(requestInput.getClientName(), requestInput.getMaxDimensionMM(), requestInput.getVolumeCM3(), requestInput.getDeadline());// TODO: 18.8.18 Stage 1.1 get from list

//        Put the Request in to RequestsDatabase
        requestsDatabase.getRequestsList().add(theRequest);

//        Create Proposals for all suitable Producers to meet the Request
        for (int i = 0; i < producersDatabase.getProducersList().size(); i++) {

            // Calculate productionDuration
            PropTimeCalculator propTimeCalculator = new PropTimeCalculator();
            Duration programingTime = producersDatabase.getProducersList().get(i).getProgramingTimeH();
            long processingSpeedUnitpH = producersDatabase.getProducersList().get(i).getProcessingSpeedCM3pH();
            long volumeUnit = theRequest.getVolumeCM3();
            Duration productionDuration = propTimeCalculator.calculateProductionDuration(programingTime, processingSpeedUnitpH, volumeUnit);

            //check Producer availability
            LocalDateTime availableStart = producersDatabase.getProducersList().get(i).getAvailableStart();
            LocalDateTime availableFinish = producersDatabase.getProducersList().get(i).getAvailableFinish();
            boolean available =propTimeCalculator.checkAvailability(availableStart, availableFinish, productionDuration);

            if (available) {

                //calculate earlyFinish date of Proposal
                Duration deliveringTime = producersDatabase.getProducersList().get(i).getDeliveringTimeH();
                LocalDateTime earlyFinish = propTimeCalculator.calculateEarlyFinish(availableStart, productionDuration, deliveringTime);

                //check Request's deadline
                LocalDateTime deadline = theRequest.getDeadline();
                boolean onTime = earlyFinish.isBefore(deadline);

                if (onTime) {

                    //create Proposal
                    String proposalId = new IdGenerator().generateIdKey("Pr ");
                    String requestId = theRequest.getRequestId();
                    String producerName = producersDatabase.getProducersList().get(i).getProducerName();
                    Proposal proposal = new Proposal(proposalId, requestId, producerName, availableStart, availableFinish, earlyFinish);
                    System.out.println();

                    //put Proposal to proposalsList

                    //put proposalsList to ProposalsDetabase



                }

            }

        }

//        Put Proposals to ProposalsDatabase todo
        //          proposalsDatabase.getProposalsList().add(proposal);

//        Create OutputToClient put Producer name, availale time, price todo

        // Tests todo



        System.out.println("Pabaiga");

    }
}

// TODO: 18.8.20 Stage2
//       Sort Proposal acording to earlyFinish

//       todo Stage3:
//        Receive ProducerInput
//        Check validity
//        Create ProducerId
//        Put to ProducersDatabase
//
//        Active/NotActive Producer, Proposal