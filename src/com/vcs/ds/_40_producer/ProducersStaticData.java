package com.vcs.ds._40_producer;

import com.vcs.ds._10_model.data.DataInterface;

import java.util.List;

public class ProducersStaticData implements DataInterface<Producer> {


    private static List<Producer>  producersList;

    /**
     * Use ProducersDBFactory
     */
    ProducersStaticData() {
       }


    @Override
    public List<Producer> getData() {
        return producersList;
    }
}
