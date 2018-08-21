package com.vcs.ds._10_model.data;

import com.vcs.ds._40_producer.Producer;

import java.util.ArrayList;
import java.util.List;

public class ProducersData implements DataStorage{


    private List<Producer> ProducersList;


    public ProducersData() {
        ProducersList = new ArrayList<>();
        ProducersList.add(0, new Producer("P10", "1", "2018-09-10", "2018-09-15", "1", "24"));
        ProducersList.add(1, new Producer("P11", "2", "2018-09-01", "2018-10-15", "2", "12"));
        ProducersList.add(1, new Producer("P12", "1", "2018-09-10", "2018-09-12", "3", "18"));
        ProducersList.add(1, new Producer("P13", "2", "2018-09-20", "2018-10-01", "1", "24"));
    }


//getset
    public  List<Producer> getProducersList() {
        return ProducersList;
    }

}
