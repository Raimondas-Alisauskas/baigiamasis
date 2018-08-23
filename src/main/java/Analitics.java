import org.math.plot.Plot3DPanel;

import javax.swing.*;
import java.awt.*;
import java.util.List;

public class Analitics {

    private final RangeCustom ran;

    Analitics () {

        ran = new RangeCustom();

        List<Double> lr = ran.range(.01,.02, .01);
        List<Integer> samples = ran.range(80, 3000, 292);

        ConvModel convModel = new ConvModel(samples, lr);

        Plot3DPanel plot3d = new Plot3DPanel();
        plot3d.addLinePlot("rec versus prec versus acc",
                Color.BLUE, convModel.getRec(), convModel.getPrec(), convModel.getAcc());
        plot3d.setAxisLabel(0, "rec");
        plot3d.setAxisLabel(1, "prec");
        plot3d.setAxisLabel(2, "acc");

        JFrame frame = new JFrame("a plot panel");
        frame.setContentPane(plot3d);
        frame.setSize(700,700);
        frame.setVisible(true);
    }
}
