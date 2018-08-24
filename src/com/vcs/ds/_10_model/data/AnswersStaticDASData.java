package com.vcs.ds._10_model.data;

import com.vcs.ds._60_proposal.Proposal;

import java.util.ArrayList;
import java.util.List;

public class AnswersStaticDASData implements DASData<DASData<Proposal>> {


    private  List<DASData<Proposal>> answersList = new ArrayList<>();

    /**
     * Use ProducersDBFactory
     */
     AnswersStaticDASData() {
      }

    @Override
    public List<DASData<Proposal>> getData() { return answersList; }

}
