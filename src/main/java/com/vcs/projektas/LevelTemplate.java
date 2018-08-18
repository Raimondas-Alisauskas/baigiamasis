package com.vcs.projektas;

public class LevelTemplate {

    LygioLogika teisingumoTikrinimas = new LygioLogika();

    public LygioLogika getTeisingumoTikrinimas() {
        return teisingumoTikrinimas;
    }

    public void setTeisingumoTikrinimas(LygioLogika teisingumoTikrinimas) {
        this.teisingumoTikrinimas = teisingumoTikrinimas;
    }


    InputReturn spejimoRezultatas = new InputReturn();

    public InputReturn getSpejimoRezultatas() {
        return spejimoRezultatas;
    }

    public void setSpejimoRezultatas(InputReturn spejimoRezultatas) {
        this.spejimoRezultatas = spejimoRezultatas;
    }
}
