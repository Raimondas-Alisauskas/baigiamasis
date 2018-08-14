import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;

/**
 * Created by duser on 18.8.8.
 */
public class SortRange {

    public ArrayList<Integer> swap_sort(ArrayList<Integer> li) {
        Integer iterations = 0;
        ArrayList<Integer> li_it = new ArrayList<Integer>() {
        };
        for (int i = 0; i < li.size() - 1; i++) {
            li_it.add(i, i);
        }
        for (int i = 0; i < li.size(); i += 1) {
            for (Integer k : li_it) {
                if (li.get(k) > li.get(k + 1)) {
                    Integer big = new Integer(li.get(k));
                    Integer small = new Integer(li.get(k + 1));
                    li.set(k, small);
                    li.set(k + 1, big);
                    iterations += 1;
                } else {
                    continue;
                }
            }
        }
        System.out.println(String.format("Sorting completed in %s iterations", iterations));
        return li;
    }

    public ArrayList<Integer> tmp_sort_min(ArrayList<Integer> li) {
        Integer cnt = 0;
        ArrayList<Integer> copy = (ArrayList<Integer>) li.clone();
        ArrayList<Integer> tmp = new ArrayList<Integer>(Collections.nCopies(copy.size(), 0)) {
        };
        Integer min;
        while (copy.size() > 1) {
            min = copy.get(0);
            for (Integer k : copy) {
                cnt += 1;
                if (k < min) {
                    min = k;
                }
            }
            copy.remove(copy.indexOf(min));
            tmp.set(tmp.indexOf(0), min);
        }
        tmp.set(tmp.indexOf(0), copy.get(0));
        System.out.println(String.format("tmp_sort_min: %s in %s iterations", tmp, cnt));
        return tmp;
    }

    public ArrayList<Integer> tmp_sort_max(ArrayList<Integer> li) {
        Integer cnt = 0;
        ArrayList<Integer> copy_ = (ArrayList<Integer>) li.clone();
        ArrayList<Integer> tmp = new ArrayList<Integer>(Collections.nCopies(copy_.size(), 0)) {
        };
        Integer max;
        //min = copy.get(0);
        System.out.println(String.format("copy_.size: %s, tmp.size: %s", copy_.size(), tmp.size()));
        while (copy_.size() > 1) {
            max = copy_.get(0);
            for (Integer k : copy_) {
                cnt += 1;
                if (k > max) {
                    max = k;
                }
            }
            tmp.set(tmp.indexOf(0), max);
            copy_.remove(copy_.indexOf(max));
        }
        tmp.set(tmp.size() - 1, copy_.get(0)); //copy_.remove(copy_.indexOf(0));
        System.out.println(String.format("tmp_sort_max: %s in %s iterations", tmp, cnt));
        return tmp;
    }

    public ArrayList<Integer> tmp_sort_mod(ArrayList<Integer> li) { //TODO
        //ArrayList<Integer> tmp = new ArrayList<Integer>();
        ArrayList<Integer> tmp = new ArrayList<Integer>(Collections.nCopies(li.size(), 0));
        System.out.println(tmp);
        System.out.println(li);
        System.out.println(li.size());
        Integer min, max;
        min = li.get(0);
        max = li.get(1);
        while (li.size() > 2) {
//            min = li.get(0); max = li.get(1);
////            System.out.println(String.format("%s, %s", min,max));
////            li.remove(li.indexOf(max)-1); li.remove(li.indexOf(min)-1);
////            System.out.println(li);
////            tmp.set(tmp.indexOf(0), min);
////            tmp.set(tmp.lastIndexOf(0), max);
//        }
            for (Integer k : li) {
                if (k < min) {
                    min = k;
                }
                if (k > max) {
                    max = k;
                }
            }
            System.out.println(String.format("min: %s, max: %s", min, max));
            //li.remove(li.indexOf(min)); li.remove(li.indexOf(max));
            tmp.set(tmp.indexOf(0), min);
            tmp.set(tmp.lastIndexOf(0), max);
            System.out.println(String.format("tmp: %s", tmp));
            li.remove(li.indexOf(min)); // exception !!!! wrong algo !!!
            li.remove(li.indexOf(max));
        }
        System.out.println(String.format("Result: %s", tmp));
        return tmp;
    }

    public ArrayList<Integer> bogo_sort(ArrayList<Integer> ar) {
        ArrayList<Integer> ar_clone = (ArrayList<Integer>) ar.clone();
        Integer count = 0;
        Integer ctr = 0;
        Collections.shuffle(ar_clone);
        while (count < ar_clone.size() - 1) {
            for (int i = 0; i < ar_clone.size() - 1; i += 1) {
                if (ar_clone.get(i) > ar_clone.get(i + 1)) {
                    Collections.shuffle(ar_clone);
                    count = 0;
                    ctr += 1;
                } else {
                    count += 1;
                    ctr += 1;
                }
                if (ctr % 1000000 == 0) {
                    System.out.println(String.format("counter = %s M", new Double(ctr) / 1000000));
                }
            }
        }
        System.out.println(String.format("\nbogo_sort completed in: %.3fk iterations", new Double(ctr) / 1000));
        return ar_clone;
    }
    public static ArrayList<Double> range(Double start, Double stop, Double step) {
        ArrayList<Double> ar = new ArrayList<Double>();
        for (double i = start; i <= stop; i += step) {
            ar.add(i);
        }
        return ar;
    }
    public ArrayList<Double> range(Integer start, Double stop, Double step) {
        ArrayList<Double> ar = new ArrayList<Double>();
        for (double i = start; i <= stop; i += step) {
            ar.add(i);
        }
        return ar;
    }
    public ArrayList<Double> range(Double start, Integer stop, Double step) {
        ArrayList<Double> ar = new ArrayList<Double>();
        for (double i = start; i <= stop; i += step) {
            ar.add(i);
        }
        return ar;
    }
    public ArrayList<Double> range(Integer start, Integer stop, Double step) {
        ArrayList<Double> ar = new ArrayList<Double>();
        for (double i = start; i <= stop; i += step) {
            ar.add(i);
        }
        return ar;
    }

    public static ArrayList<Integer> range(Integer start, Integer stop, Integer step) {
        ArrayList<Integer> ar = new ArrayList<Integer>();
        for (int i = start; i <= stop; i += step) {
            ar.add(i);
        }
        return ar;
    }

    public static ArrayList<Double> round_(ArrayList<Double> rec) {
        for (int i = 0; i < rec.size(); i += 1) {
            rec.set(i, new BigDecimal(rec.get(i)).setScale(3, RoundingMode.HALF_DOWN).doubleValue());
            }
        return rec;
    }
    public ArrayList<String> str_to_arr() {
        String st = "1 2 3 g 5 6 78 dcv4 5 7a";
        ArrayList<String> arr = new ArrayList<String>(Arrays.asList(st.split(" ")));
        String[] ar = st.split(" ");
        System.out.println(String.format("arr: %s", arr));
        return arr;
    }
}
