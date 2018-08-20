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
    private final ArrayList<Double> far;

    Analitics () {

        ConvModel convModel = new ConvModel();
        this.f1 = convModel.getF1();
        this.acc = convModel.getAcc();
        this.rec = convModel.getRec();
        this.prec = convModel.getPrec();
        this.far = convModel.far;

        double[] f1 = this.f1.stream().mapToDouble(Double::doubleValue).toArray(); //via method reference
        double[] acc = this.acc.stream().mapToDouble(Double::doubleValue).toArray(); //via method reference
        double[] prec = this.prec.stream().mapToDouble(Double::doubleValue).toArray(); //via method reference
        double[] rec = this.prec.stream().mapToDouble(Double::doubleValue).toArray(); //via method reference
        double[] far = this.far.stream().mapToDouble(Double::doubleValue).toArray(); //via method reference

        PlotPanel plot = new Plot2DPanel();
        ((Plot2DPanel) plot).addLinePlot("f1 versus accuracy", Color.BLUE,
                f1, acc);
        plot.setAxisLabel(0, "f1");
        plot.setAxisLabel(1, "acc");

        PlotPanel plot3d = new Plot3DPanel();
        ((Plot3DPanel) plot3d).addLinePlot
                ("f1 versus accuracy versus prec",
                Color.BLUE,
                far, acc, prec);
        plot3d.setAxisLabel(0, "fp");
        plot3d.setAxisLabel(1, "acc");
        plot3d.setAxisLabel(2, "prec");

        JFrame frame = new JFrame("a plot panel");
        frame.setContentPane(plot3d);
        frame.setSize(700,700);
        frame.setVisible(true);
    }

    public static void main(String[] args) {

       new Analitics();

    }
}
