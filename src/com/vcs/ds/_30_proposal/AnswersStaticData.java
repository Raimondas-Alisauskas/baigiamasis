package com.vcs.ds._30_proposal;

import com.vcs.ds._10_model.data.DataInterface;

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
