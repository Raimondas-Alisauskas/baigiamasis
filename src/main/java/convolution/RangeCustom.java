package convolution;

import java.util.ArrayList;
import java.util.List;

public class RangeCustom {

    protected List<Double> range(Double start, Double stop, Double step) {

        List<Double> ar = new ArrayList<Double>();
        for (double i = start; i <= stop; i += step) {
            ar.add(i);
        }
        return ar;
    }

    protected List<Integer> range(Integer start, Integer stop, Integer step) {

        List<Integer> ar = new ArrayList<Integer>();
        for (int i = start; i <= stop; i += step) {
            ar.add(i);
        }
        return ar;
    }
}
