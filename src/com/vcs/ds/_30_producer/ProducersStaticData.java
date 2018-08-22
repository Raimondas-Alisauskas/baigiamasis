package com.vcs.ds._30_producer;

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
