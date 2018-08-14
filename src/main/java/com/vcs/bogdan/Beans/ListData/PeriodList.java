package com.vcs.bogdan.Beans.ListData;

import com.vcs.bogdan.Beans.Insurance;
import com.vcs.bogdan.Beans.Month;
import com.vcs.bogdan.Beans.Period;
import com.vcs.bogdan.Beans.Tax;

import java.util.ArrayList;
import java.util.List;

public class PeriodList {

    private List<Period> periods;

    public PeriodList() {

        Month month = new Month(201701, 18, 143, 400, 2.45, 1.5, 2);
        Month month2 = new Month(201801, 18, 143, 412.14, 2.45, 1.5, 2);
        Month month3 = new Month(201802, 18, 143, 400, 2.45, 1.5, 2);

        Tax tax = new Tax(380, 0.5, 400, 15, 0);
        Tax tax2 = new Tax(380, 0.51, 400, 15.25, 0);
        Tax tax3 = new Tax(400, 0.5, 400, 15, 0);

        Insurance insurance = new Insurance(3, 2, 6, 6, 27.98, 1, 2, 0.80);
        Insurance insurance2 = new Insurance(3, 2, 6, 6, 27.98, 1, 2, 0.80);
        Insurance insurance3 = new Insurance(3, 2, 6, 6, 27.98, 1, 2, 0.80);

        Period period = new Period(month, tax, insurance);
        Period period2 = new Period(month2, tax2, insurance2);
        Period period3 = new Period(month3, tax3, insurance3);

        this.periods = new ArrayList<>();
        this.periods.add(period);
        this.periods.add(period2);
        this.periods.add(period3);
    }

    public List<Period> getPeriods() {
        return periods;
    }

    public void setPeriods(List<Period> periods) {
        this.periods = periods;
    }

    public Period getPeriod(long periodId) {
        for (int i = 0; i < periods.size(); i++) {
            if (periods.get(i).getId() == periodId) {
                return periods.get(i);
            }
        }
        return null;
    }
}
