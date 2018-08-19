package com.vcs.ds._10_model.database;

import com.vcs.ds._40_producer.Producer;

import java.util.ArrayList;
import java.util.List;

public class ProducersDatabase {


    private List<Producer> ProducersList;


    public ProducersDatabase() {
        ProducersList = new ArrayList<>();
        ProducersList.add(0, new Producer("P10", "1", "2018-09-10", "2018-09-15", "10"));
        ProducersList.add(1, new Producer("P11", "2", "2018-09-01", "2018-10-15", "20"));
        ProducersList.add(1, new Producer("P12", "1", "2018-09-10", "2018-09-12", "30"));
        ProducersList.add(1, new Producer("P13", "2", "2018-09-20", "2018-10-01", "10"));
    }


//getset
    public  List<Producer> getProducersList() {
        return ProducersList;
    }

}
