package com.vcs.ds._30_proposal;

import com.vcs.ds._10_model.input.ProducerInput;

import java.time.DayOfWeek;
import java.time.Duration;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.temporal.Temporal;

public class AvailabilityCalculator {

    
    public AvailabilityCalculator () {

    }

        private long processingTime ( long processingSpeedCM3pHour, long volumeCM3){

            return processingSpeedCM3pHour * volumeCM3;
        }

        public long productionTime ( long programingTime, long processingTime){ // TODO: 18.8.17 private 

            return programingTime + processingTime;
        }

        private long productionDuration ( long processingTime, long productionTime){

            return processingTime + productionTime;
        }



}

