package com.vcs.hplc;
import java.math.BigDecimal;


public class RoundingNumbers {

    public double roundRT(double valuesToRound) {

        int decimalsRT = 3;
        BigDecimal bigDecimal = new BigDecimal(valuesToRound);
        BigDecimal roundedRT = bigDecimal.setScale(3, BigDecimal.ROUND_HALF_UP);
        return 0;
    }
    public double roundArea(double valuesToRound) {

        int decimalsArea = 0;
        BigDecimal bigDecimal = new BigDecimal(valuesToRound);
        BigDecimal roundedArea = bigDecimal.setScale(0, BigDecimal.ROUND_HALF_UP);
        return 0;

    }
}
