package com.vcs.ds._60_proposal;

import com.vcs.ds._10_model.data.DataInterface;
import com.vcs.ds._10_model.data.ProposalsDBFactory;
import com.vcs.ds._20_General.IdGenerator;
import com.vcs.ds._30_producer.Producer;
import com.vcs.ds._50_request.Request;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class ProposalTimeEvaluator {


    private DataInterface<Producer> availableProducers;

    public ProposalTimeEvaluator() {
        this.availableProducers = availableProducers;
    }

    public DataInterface<Producer> availableProducers(Request request, DataInterface<Producer> producersData) {


        for (int i = 0; i < producersData.getData().size(); i++) {

            ProposalTimeCalculator proposalTimeCalculator = new ProposalTimeCalculator();

            // Calculate productionDuration
            Duration programingTime = producersData.getData().get(i).getProgramingTimeH();
            long processingSpeedUnitpH = producersData.getData().get(i).getProcessingSpeedCM3pH();
            long volumeUnit = request.getVolumeCM3();
            Duration productionDuration = proposalTimeCalculator.calculateProductionDuration(programingTime, processingSpeedUnitpH, volumeUnit);

            //check Producer availability (producer availability evaluated for 24 hours availability)
            LocalDateTime availableStart = producersData.getData().get(i).getAvailableStart();
            LocalDateTime availableFinish = producersData.getData().get(i).getAvailableFinish();
            boolean available = proposalTimeCalculator.checkAvailability(availableStart, availableFinish, productionDuration);

            if (available) {

                //calculate earlyFinish date of Proposal
                Duration deliveringTime = producersData.getData().get(i).getDeliveringTimeH();
                LocalDateTime earlyFinish = proposalTimeCalculator.calculateEarlyFinish(availableStart, productionDuration, deliveringTime);

                //check Request's deadline
                LocalDateTime deadline = request.getDeadline();
                boolean onTime = earlyFinish.isBefore(deadline);

                if (onTime) {

                    //create Proposal
                    String proposalId = new IdGenerator().generateIdKey("Pr ");
                    String requestId = request.getRequestId();
                    String producerName = producersData.getData().get(i).getProducerName();
                    Proposal proposal = new Proposal(proposalId, requestId, producerName, availableStart, availableFinish, earlyFinish);

                    //put Proposal to proposalsList
                    availableProducers.getData().add(producersData.getData().get(i));

                }

            }
        }
        return availableProducers;
    }


}

