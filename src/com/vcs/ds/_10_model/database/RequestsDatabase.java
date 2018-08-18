package com.vcs.ds._10_model.database;

import com.vcs.ds._20_request.Request;

import java.util.ArrayList;
import java.util.List;

public class RequestsDatabase {


    private List<Request> requestsList;


    public RequestsDatabase() {
        requestsList = new ArrayList<>();
        requestsList.add(0, new Request("C10", "100", "10", "2018-09-15"));
        requestsList.add(1, new Request("C1", "200", "20", "2018-09-10"));
        requestsList.add(2, new Request("C2", "200", "10", "2018-09-20"));
        requestsList.add(3, new Request("C3", "300", "30", "2018-09-10"));

    }

    //get set
    public List<Request> getRequestsList() {
        return requestsList;
    }

}







