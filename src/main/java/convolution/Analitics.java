package convolution;

import org.math.plot.Plot3DPanel;

import javax.swing.*;
import java.awt.*;
import java.util.List;

public class Analitics {

    private final RangeCustom ran;
    private final Integer width = 700;
    private final JFrame frame;
    private final Plot3DPanel plot3d;

    private final Integer nIn = 3;
    private final Integer nOut = 20;
    private final Integer pad = 2;
    private final Integer kernSize = 2;
    private final Integer stride = 2;
    private final double moment = .5;

    public Analitics() {

        ran = new RangeCustom();

        List<Double> lr = ran.range(.01, .02, .01);
        List<Integer> samples = ran.range(80, 1128, 292);

        ConvModel convModel = new ConvModel(samples, lr, nIn, nOut, pad, kernSize, stride, moment, true);

        plot3d = new Plot3DPanel();
        plot3d.addLinePlot("recall versus precision versus accurat",
                Color.BLUE, convModel.getRec(), convModel.getPrec(), convModel.getAcc());
        plot3d.setAxisLabel(0, "recall");
        plot3d.setAxisLabel(1, "precision");
        plot3d.setAxisLabel(2, "accuracy");

        frame = new JFrame("a plot panel");
        frame.setContentPane(plot3d);
        frame.setSize(width, width);
        frame.setVisible(true);
    }
}
