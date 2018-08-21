package com.vcs.ds._10_model.database;

import com.vcs.ds._20_request.Request;

import java.util.ArrayList;
import java.util.List;

public class RequestsData implements DataStorage{


    private static List<Request> requestsList;
    private static List<Request> requestsList2;

    public RequestsData() {
        requestsList = new ArrayList<>();
        requestsList.add(0, new Request("C10", "100", "100", "2018-09-15"));
        requestsList.add(1, new Request("C1", "200", "200", "2018-09-10"));
        requestsList.add(2, new Request("C2", "200", "100", "2018-09-20"));
        requestsList.add(3, new Request("C3", "300", "300", "2018-09-10"));

    }

    //get set
    public List<Request> getRequestsList() {
        return requestsList;
    }

}







