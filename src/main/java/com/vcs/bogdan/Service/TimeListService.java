package com.vcs.bogdan.Service;

import com.vcs.bogdan.Beans.TimeList;

import java.lang.reflect.Field;
import java.util.*;

public class TimeListService {

    private static final String TIME_LIST = "timeList";


    public double getHours(List<TimeList> list, String employeeId, String monthId) {
        double result = 0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getEmployeeId().equals(employeeId) && list.get(i).getDate() / 100 == Integer.valueOf(monthId))
                result = result + list.get(i).getValue();
        }
        return result;
    }

    public double getDays(List<TimeList> list, String employeeId, String monthId) {
        double result = 0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getEmployeeId().equals(employeeId) && list.get(i).getDate() / 100 == Integer.valueOf(monthId))
                result++;
        }
        return result;
    }

}
