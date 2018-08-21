package com.vcs.bogdan.Service;

import com.mysql.jdbc.StringUtils;
import com.vcs.bogdan.Beans.Insurance;
import com.vcs.bogdan.Beans.Month;
import com.vcs.bogdan.Beans.Period;
import com.vcs.bogdan.Beans.Tax;

import java.util.ArrayList;
import java.util.List;


public class PeriodService {

    public void add() {
        //TODO
    }

    public void remove(String id) {
        //TODO
    }

    public List<Period> getAll() {

        List<Period> result = new ArrayList<>();
        MonthService monthService = new MonthService();
        TaxService taxService = new TaxService();
        InsuranceService insuranceService = new InsuranceService();

        List<Month> months = monthService.getAll();
        for (int i = 0; i < months.size(); i++) {
            String id = months.get(i).getId();
            Month month = months.get(i);
            Tax tax = StringUtils.isNullOrEmpty(taxService.get(id).getId()) ? new Tax() : taxService.get(id);
            Insurance insurance = StringUtils.isNullOrEmpty(insuranceService.get(id).getId()) ? new Insurance() : insuranceService.get(id);;
            result.add(new Period(month, tax, insurance));
        }
        return result;
    }

    public Period get(String id) {
        return new Period(new MonthService().get(id),new TaxService().get(id),new InsuranceService().get(id));
    }
}
