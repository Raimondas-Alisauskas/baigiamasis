package com.vcs.ds._10_model.data;

import com.vcs.ds._30_proposal.Proposal;

import java.util.ArrayList;
import java.util.List;

public class ProposalsData {


    private  List<Proposal> proposalsList;
    private  List<List<Proposal>> proposalsDatalist;

    public ProposalsData() {

        proposalsList =  new ArrayList<>();
        proposalsDatalist =  new ArrayList<>();
    }





    //getset
    public List<Proposal> getProposalsList() {
        return proposalsList;
    }

    public List<List<Proposal>> getProposalsDatalist() {
        return proposalsDatalist;
    }
}
