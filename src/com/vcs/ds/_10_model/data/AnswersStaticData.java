package com.vcs.ds._10_model.data;

import com.vcs.ds._10_model.data.DataInterface;
import com.vcs.ds._60_proposal.Proposal;

import java.util.List;

public class AnswersStaticData implements DataInterface<DataInterface<Proposal>> {


    private  static List<DataInterface<Proposal>> answersList;

    /**
     * Use ProducersDBFactory
     */
     AnswersStaticData() {
      }

    @Override
    public List<DataInterface<Proposal>> getData() { return answersList; }

}
