package com.vcs.ds._10_model.data;

import com.vcs.ds._60_proposal.Proposal;

import java.util.ArrayList;
import java.util.List;

public class ProposalsStaticDASData implements DASData<Proposal> {

 //   private String requestId;
    private List<Proposal> proposals = new ArrayList<>();

    /**
     * Use ProducersDBFactory
     */
    ProposalsStaticDASData() {
    }

    @Override
    public List<Proposal> getData() {
        return proposals;
    }

}



