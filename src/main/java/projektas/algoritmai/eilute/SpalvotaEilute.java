package projektas.algoritmai.eilute;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SpalvotaEilute {

    private List<Integer> eilute = new ArrayList<Integer>();

    public List<Integer> getEilute() {
        return eilute;
    }

    public SpalvotaEilute(Integer ... spalvos) {
        eilute.addAll(Arrays.asList(spalvos));
    }
}
