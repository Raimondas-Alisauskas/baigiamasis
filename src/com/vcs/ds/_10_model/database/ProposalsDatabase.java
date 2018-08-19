package com.vcs.ds._10_model.database;

import com.vcs.ds._30_proposal.Proposal;

import java.util.ArrayList;
import java.util.List;

public class ProposalsDatabase {


    private List<Proposal> proposalsList;


    public ProposalsDatabase() {
        proposalsList =  new ArrayList<>();
    }

    //getset
    public List<Proposal> getProposalsList() {
        return proposalsList;
    }

}
