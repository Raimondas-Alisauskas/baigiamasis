package com.vcs.ds.TMP.toDelete;

import com.vcs.ds._30_proposal.ProposalTimeCalculator;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class PropTimeCalculatorTests {


    public static void main(String[] args) {

        ProposalTimeCalculator a = new ProposalTimeCalculator();

        Duration progTime = Duration.ofHours(2);
        Duration prodDur = a.calculateProductionDuration(progTime, 1L, 100L);

        Long prodDurDays = prodDur.toDays();

        LocalDateTime availStart = LocalDateTime.of(LocalDate.parse("2018-09-15"), LocalTime.MIDNIGHT);
        LocalDateTime availFinish = LocalDateTime.of(LocalDate.parse("2018-09-20"), LocalTime.MIDNIGHT);

        boolean availability = a.checkAvailability(availStart, availFinish, prodDur);

        Duration delivering = Duration.ofHours(24);
        LocalDateTime EarlyFinish = a.calculateEarlyFinish(availStart, prodDur, delivering);


    }

}
