package com.vcs.ds._10_model.database;

import com.vcs.ds._40_producer.Producer;

import java.util.ArrayList;
import java.util.List;

public class ProducersDatabase {


    private List<Producer> ProducersList;


    public ProducersDatabase() {
        ProducersList = new ArrayList<>();
        ProducersList.add(0, new Producer("P10", "100", "2018-09-10", "2018-09-15", "100"));
        ProducersList.add(1, new Producer("P10", "100", "2018-09-01", "2018-09-15", "100"));


    }


//getset
    public List<Producer> getProducersList() {
        return ProducersList;
    }

}
