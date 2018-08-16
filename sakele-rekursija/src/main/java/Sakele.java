import java.util.ArrayList;
import java.util.List;

public class Sakele {

    private String text;
    private List<Sakele> sakeles = new ArrayList<>();

    public Sakele() {

    }

    public Sakele(String text) {
        this.text = text;
    }

    public List<Sakele> getSakeles() {
        return sakeles;
    }

    public void setSakeles(List<Sakele> sakeles) {
        this.sakeles = sakeles;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
