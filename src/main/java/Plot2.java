import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.stage.Stage;

import java.util.ArrayList;

public class Plot2 extends Application {

    private Integer min;
    private Integer max;

    @Override
    public void start(Stage primaryStage) throws Exception {

        try {
            ConvModel model = new ConvModel();

            ArrayList<Double> acc = model.getAcc();
            ArrayList<Double> prec = model.getPrec();
            ArrayList<Double> rec = model.getRec();
            ArrayList<Double> f1 = model.getF1();
            ArrayList<Double> far = model.far; // neduoda 5 kreivių atvaizduoti
            ArrayList<Integer> rang = model.getRang();

            min = rang.get(0);
            max = rang.get(rang.size()-1);

            primaryStage.setTitle("Line chart");
            //define axes
            final NumberAxis xAxis = new NumberAxis(min, max, 10);
            final NumberAxis yAxis = new NumberAxis();
            xAxis.setLabel("sample size");
            yAxis.setLabel("model parameters");
            //creatin' chart

            final LineChart<Number, Number> lineChart = new LineChart<Number, Number>(xAxis, yAxis);
            //define series

            XYChart.Series series = new XYChart.Series();
            XYChart.Series series2 = new XYChart.Series();
            XYChart.Series series3 = new XYChart.Series();
            //XYChart.Series series4 = new XYChart.Series();
            XYChart.Series series5 = new XYChart.Series();
            series.setName("acc");
            series2.setName("prec");
            series3.setName("rec");
            //series4.setName("f1");
            series5.setName("far");
            // populatin' series with data

            for (int i = 0; i < acc.size(); i += 1) {

                series.getData().add(new XYChart.Data(rang.get(i), acc.get(i)));
                series2.getData().add(new XYChart.Data(rang.get(i), prec.get(i)));
                series3.getData().add(new XYChart.Data(rang.get(i), rec.get(i)));
                //series4.getData().add(new XYChart.Data(rang.get(i), f1.get(i)));
                series5.getData().add(new XYChart.Data(rang.get(i), far.get(i)));
            }

            lineChart.getData().add(series);
            lineChart.getData().add(series2);
            lineChart.getData().add(series3);
            //lineChart.getData().add(series4);
            lineChart.getData().add(series5);


            Scene scene = new Scene(lineChart, 800, 600);
            primaryStage.setScene(scene);
            primaryStage.show();

        } catch (Exception e) {
            System.out.println("I am catch block, i have been called!!");
            System.out.println(e.getStackTrace());
        }
    }

    private static void start_x(String[] args) { launch(args);
    }
}
