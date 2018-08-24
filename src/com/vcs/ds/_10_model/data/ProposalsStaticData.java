package com.vcs.ds._10_model.data;

import com.vcs.ds._10_model.data.DataInterface;
import com.vcs.ds._60_proposal.Proposal;

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



