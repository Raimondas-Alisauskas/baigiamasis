package com.vcs.ds._10_model.data;

import com.vcs.ds._50_request.Request;

import java.util.ArrayList;
import java.util.List;

public class RequestsStaticDASData implements DASData<Request> {


    private List<Request> requestsList = new ArrayList<>();

    /**
     * Use ProducersDBFactory
     */
    RequestsStaticDASData() {
    }

    @Override
    public List<Request> getData() {
        return requestsList;
    }
}







