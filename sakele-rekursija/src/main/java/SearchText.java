import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SearchText {

    public static void main(String[] dsfs) {

        Sakele medis = createMedis();

        SearchText s = new SearchText();


//        System.out.println(s.findTextInTree(medis, "345s"));
        System.out.println(Arrays.toString(s.findPathInTree(medis, "7661").toArray()));

    }

    private static Sakele createMedis() {
        Sakele kamienas = new Sakele();

        kamienas.getSakeles().add(new Sakele("abc"));
        kamienas.getSakeles().add(new Sakele("111"));
        kamienas.getSakeles().add(new Sakele("222"));
        kamienas.getSakeles().add(new Sakele("333"));
        kamienas.getSakeles().add(new Sakele("444"));

        kamienas.getSakeles().get(1).getSakeles().add(new Sakele("43545"));
        kamienas.getSakeles().get(1).getSakeles().add(new Sakele("67"));
        kamienas.getSakeles().get(1).getSakeles().add(new Sakele("567"));
        kamienas.getSakeles().get(1).getSakeles().add(new Sakele("345"));
        kamienas.getSakeles().get(1).getSakeles().add(new Sakele("766"));

        kamienas.getSakeles().get(2).getSakeles().add(new Sakele("413545"));
        kamienas.getSakeles().get(3).getSakeles().add(new Sakele("167"));
        kamienas.getSakeles().get(2).getSakeles().add(new Sakele("1567"));
        kamienas.getSakeles().get(2).getSakeles().add(new Sakele("3145"));
        kamienas.getSakeles().get(2).getSakeles().add(new Sakele("7661"));

        return kamienas;

    }


    public boolean findTextInTree(Sakele tree, String textForSearch) {

        if (textForSearch.equalsIgnoreCase(tree.getText())) {
            return true;
        }

        if (tree.getSakeles().isEmpty()) {
            return false;
        }

        for (Sakele  sakele : tree.getSakeles()) {
            if (findTextInTree(sakele, textForSearch)) {
                return true;
            }
        }

        return false;
    }

    public List<Integer> findPathInTree(Sakele tree, String textForSearch) {

        List<Integer> path = new ArrayList<>();

        if (findPathInTree(tree, textForSearch, path)) {


            Collections.reverse(path);

            return path;
        }

        return new ArrayList<>();
    }

    public boolean findPathInTree(Sakele tree, String textForSearch, List<Integer> path) {

        if (textForSearch.equalsIgnoreCase(tree.getText())) {
//            path.add(Integer.valueOf(index));
            return true;
        }

        if (tree.getSakeles().isEmpty()) {
            return false;
        }

        for (int i = 0; i < tree.getSakeles().size(); i ++){
            if (findPathInTree(tree.getSakeles().get(i), textForSearch, path)) {
                path.add(Integer.valueOf(i));
                return true;
            }
        }

        return false;
    }
}
