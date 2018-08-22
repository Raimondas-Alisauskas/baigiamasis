package com.vcs.ds;

import com.vcs.ds._10_model.data.*;
import com.vcs.ds._10_model.input.RequestInput;
import com.vcs.ds._20_request.Request;
import com.vcs.ds._20_request.RequestsDBFactory;
import com.vcs.ds._30_proposal.*;
import com.vcs.ds._40_producer.Producer;
import com.vcs.ds._40_producer.ProducersDBFactory;
import com.vcs.ds._50_General.IdGenerator;

import java.time.Duration;
import java.time.LocalDateTime;

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
        Request theRequest = new Request(requestInput.getClientName(), requestInput.getMaxDimensionMM(), requestInput.getVolumeCM3(), requestInput.getDeadline());// TODO: 18.8.18 Stage 1.1 get from list

//        Put the Request in to RequestsStaticData
          requestData.getData().add(theRequest);

//        Create Proposals for all suitable Producers to meet the Request
        for (int i = 0; i < producersData.getData().size(); i++) {

            // Calculate productionDuration
            ProposalTimeCalculator proposalTimeCalculator = new ProposalTimeCalculator();
            Duration programingTime = producersData.getData().get(i).getProgramingTimeH();
            long processingSpeedUnitpH = producersData.getData().get(i).getProcessingSpeedCM3pH();
            long volumeUnit = theRequest.getVolumeCM3();
            Duration productionDuration = proposalTimeCalculator.calculateProductionDuration(programingTime, processingSpeedUnitpH, volumeUnit);

            //check Producer availability (producer availability is 24 hours)
            LocalDateTime availableStart = producersData.getData().get(i).getAvailableStart();
            LocalDateTime availableFinish = producersData.getData().get(i).getAvailableFinish();
            boolean available = proposalTimeCalculator.checkAvailability(availableStart, availableFinish, productionDuration);

            if (available) {

                //calculate earlyFinish date of Proposal
                Duration deliveringTime = producersData.getData().get(i).getDeliveringTimeH();
                LocalDateTime earlyFinish = proposalTimeCalculator.calculateEarlyFinish(availableStart, productionDuration, deliveringTime);

                //check Request's deadline
                LocalDateTime deadline = theRequest.getDeadline();
                boolean onTime = earlyFinish.isBefore(deadline);

                if (onTime) {

                    //create Proposal
                    String proposalId = new IdGenerator().generateIdKey("Pr ");
                    String requestId = theRequest.getRequestId();
                    String producerName = producersData.getData().get(i).getProducerName();
                    Proposal proposal = new Proposal(proposalId, requestId, producerName, availableStart, availableFinish, earlyFinish);

                    //put ProposalsStaticData to proposalsList
                    proposalsData.getData().add(proposal);
                    System.out.println();// TODO: 18.8.22 trinti


                }

            }

        }

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