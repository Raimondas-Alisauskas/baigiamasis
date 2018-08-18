package com.vcs.ds._10_model.database;

import com.vcs.ds._10_model.input.RequestInput;
import com.vcs.ds._20_request.Request;

import java.util.ArrayList;
import java.util.List;

public class RequestsDatabase {

    public RequestsDatabase() {
        requestsList = new ArrayList<>();
//        requestsList.add(0,new Request(RequestInput()));
    }

    public List<Request> getRequestsList() {
        return requestsList;
    }

    public void setRequestsList(List<Request> requestsList) {
        this.requestsList = requestsList;
    }

    private List<Request> requestsList;







  //get set

    public List<Request> getRequestsDatabase() {
        return requestsDatabase;
    }

    public void setRequestsDatabase(List<Request> requestsDatabase) {
        this.requestsDatabase = requestsDatabase;
    }
}
