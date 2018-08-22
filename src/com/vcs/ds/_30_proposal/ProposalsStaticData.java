package com.vcs.ds._30_proposal;

import com.vcs.ds._10_model.data.DataInterface;

import java.util.List;

public class ProposalsStaticData implements DataInterface<Proposal> {

    private String requestId;
    private List<Proposal> proposals;

    /**
     * Use ProducersDBFactory
     */
    ProposalsStaticData() {
    }

    @Override
    public List<Proposal> getData() {
        return proposals;
    }

}



