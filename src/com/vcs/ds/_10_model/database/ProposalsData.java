package com.vcs.ds._10_model.database;

import com.vcs.ds._30_proposal.Proposal;

import java.util.ArrayList;
import java.util.List;

public class ProposalsData {


    private static List<Proposal> proposalsList;
    private static List<List<Proposal>> proposalsDatalist;

    public ProposalsData() {

        proposalsList =  new ArrayList<>();
        proposalsDatalist =  new ArrayList<>();
    }





    //getset
    public List<Proposal> getProposalsList() {
        return proposalsList;
    }

}
