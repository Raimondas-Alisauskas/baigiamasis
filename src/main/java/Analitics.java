import org.math.plot.Plot2DPanel;
import org.math.plot.Plot3DPanel;
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
        double[] prec = this.prec.stream().mapToDouble(Double::doubleValue).toArray(); //via method reference

        ((Plot2DPanel) plot).addLinePlot("f1 versus accuracy", Color.BLUE,
                f1, acc);
        plot.setAxisLabel(0, "f1");
        plot.setAxisLabel(1, "acc");

        PlotPanel plot3d = new Plot3DPanel();
        ((Plot3DPanel) plot3d).addLinePlot("f1 versus accuracy versus prec",
                Color.BLUE,
                f1, acc, prec);
        plot3d.setAxisLabel(0, "f1");
        plot3d.setAxisLabel(1, "acc");
        plot3d.setAxisLabel(2, "prec");

        JFrame frame = new JFrame("a plot panel");
        frame.setContentPane(plot3d);
        frame.setVisible(true);
    }

    public static void main(String[] args) {

       new Analitics();

    }
}
