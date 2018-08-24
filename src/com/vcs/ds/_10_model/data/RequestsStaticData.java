package com.vcs.ds._10_model.data;

import com.vcs.ds._10_model.data.DataInterface;
import com.vcs.ds._50_request.Request;

import java.util.List;

public class RequestsStaticData implements DataInterface<Request> {


    private static List<Request> requestsList;

    /**
     * Use ProducersDBFactory
     */
    RequestsStaticData() {
    }

    @Override
    public List<Request> getData() {
        return requestsList;
    }
}






