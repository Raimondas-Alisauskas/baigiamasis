package com.vcs.ds;

import com.vcs.ds._10_model.data.*;
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
//        ClientsData
        ClientsData clientsDatabase = new ClientsData();
//        RequestsData
        // DataStorage requestsData = new RequestsData();todo trinti
        RequestsData requestsData = new RequestsData();
//        ProducersData
        ProducersData producersData = new ProducersData();
//        ProposalsData
        ProposalsData proposalsData = new ProposalsData();
//
//
//        Receiving Request for production: Create mock RequestInput
        RequestInput requestInput = new RequestInput();

//        If Client is new, create new Client id, put in to ClientDatabase todo Stage2

//        Create the Request
        Request theRequest = new Request(requestInput.getClientName(), requestInput.getMaxDimensionMM(), requestInput.getVolumeCM3(), requestInput.getDeadline());// TODO: 18.8.18 Stage 1.1 get from list

//        Put the Request in to RequestsData
        //RequestsData.dataList.add(theRequest); todo trinti
        requestsData.getRequestsList().add(theRequest);

//        Create Proposals for all suitable Producers to meet the Request
        for (int i = 0; i < producersData.getProducersList().size(); i++) {

            // Calculate productionDuration
            PropTimeCalculator propTimeCalculator = new PropTimeCalculator();
            Duration programingTime = producersData.getProducersList().get(i).getProgramingTimeH();
            long processingSpeedUnitpH = producersData.getProducersList().get(i).getProcessingSpeedCM3pH();
            long volumeUnit = theRequest.getVolumeCM3();
            Duration productionDuration = propTimeCalculator.calculateProductionDuration(programingTime, processingSpeedUnitpH, volumeUnit);

            //check Producer availability (producer availability 24 hours)
            LocalDateTime availableStart = producersData.getProducersList().get(i).getAvailableStart();
            LocalDateTime availableFinish = producersData.getProducersList().get(i).getAvailableFinish();
            boolean available = propTimeCalculator.checkAvailability(availableStart, availableFinish, productionDuration);

            if (available) {

                //calculate earlyFinish date of Proposal
                Duration deliveringTime = producersData.getProducersList().get(i).getDeliveringTimeH();
                LocalDateTime earlyFinish = propTimeCalculator.calculateEarlyFinish(availableStart, productionDuration, deliveringTime);

                //check Request's deadline
                LocalDateTime deadline = theRequest.getDeadline();
                boolean onTime = earlyFinish.isBefore(deadline);

                if (onTime) {

                    //create Proposal
                    String proposalId = new IdGenerator().generateIdKey("Pr ");
                    String requestId = theRequest.getRequestId();
                    String producerName = producersData.getProducersList().get(i).getProducerName();
                    Proposal proposal = new Proposal(proposalId, requestId, producerName, availableStart, availableFinish, earlyFinish);
                    System.out.println();

                    //put Proposal to proposalsList
                    proposalsData.getProposalsList().add(proposal);

                }

            }

        }

//        Put Proposals to ProposalsData
        proposalsData.getProposalsDatalist().add(proposalsData.getProposalsList());

//        Create OutputToClient put Producer name, availale time, earlyFinish todo


        //exeptions todo
        //tests todo


        System.out.println("Pabaiga");

    }
}

// TODO: 18.8.20 Stage2
//       Sort Proposal acording to earlyFinish

//       todo Stage3:
//        Receive ProducerInput
//        Check validity
//        Create ProducerId
//        Put to ProducersData
//
//        Active/NotActive Producer, Proposal