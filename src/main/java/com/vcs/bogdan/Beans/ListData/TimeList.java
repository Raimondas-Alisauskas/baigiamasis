package com.vcs.bogdan.Beans.ListData;

import com.vcs.bogdan.Beans.EventData;

import java.util.ArrayList;
import java.util.List;

public class TimeList {

    private List<EventData> data;

    public TimeList() {
        this.data = new ArrayList<>();
        this.data.add(new EventData(20180115, "111", "", 8));
        this.data.add(new EventData(20180111, "112", "", 2));
        this.data.add(new EventData(20180110, "111", "", 8));
        this.data.add(new EventData(20180109, "113", "", 4));
        this.data.add(new EventData(20180124, "113", "", 6));
        this.data.add(new EventData(20180103, "111", "", 8));
    }

    public double getHoursAmount(String employeeId, long monthId) {
        double result = 0;
        for (int i = 0; i < data.size(); i++) {
            if (data.get(i).getEmployeeId().equals(employeeId) && data.get(i).getDate() / 100 == monthId)
                result = result + data.get(i).getValue();
        }
        return result;
    }

    public double getDaysAmount(String employeeId, long monthId) {
        double result = 0;
        for (int i = 0; i < data.size(); i++) {
            if (data.get(i).getEmployeeId().equals(employeeId) && data.get(i).getDate() / 100 == monthId)
                result++;
        }
        return result;
    }

}
