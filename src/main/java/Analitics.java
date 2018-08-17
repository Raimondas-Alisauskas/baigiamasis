import org.math.plot.Plot2DPanel;
import org.math.plot.PlotPanel;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class Analitics {

    private final ArrayList<Double> rec;
    private final ArrayList<Double> prec;
    private final ArrayList<Double> f1;
    private final ArrayList<Double> acc;

    Analitics () {

        App app = new App();
        this.f1 = app.getF1();
        this.acc = app.getAcc();
        this.rec = app.getRec();
        this.prec = app.getPrec();

        PlotPanel plot = new Plot2DPanel();
        double[] f1 = this.f1.stream().mapToDouble(Double::doubleValue).toArray(); //via method reference
        double[] acc = this.acc.stream().mapToDouble(Double::doubleValue).toArray(); //via method reference

        ((Plot2DPanel) plot).addLinePlot("f1 versus accuracy", Color.BLUE,
                f1, acc);
        plot.setAxisLabel(0, "f1");
        plot.setAxisLabel(1, "acc");

        JFrame frame = new JFrame("a plot panel");
        frame.setContentPane(plot);
        frame.setVisible(true);
    }

    public static void main(String[] args) {

       new Analitics();

    }
}
