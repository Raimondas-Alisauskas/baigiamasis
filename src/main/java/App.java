import org.apache.log4j.BasicConfigurator;
import org.deeplearning4j.datasets.iterator.impl.CifarDataSetIterator;
import org.deeplearning4j.eval.Evaluation;
import org.deeplearning4j.nn.api.OptimizationAlgorithm;
import org.deeplearning4j.nn.conf.BackpropType;
import org.deeplearning4j.nn.conf.MultiLayerConfiguration;
import org.deeplearning4j.nn.conf.NeuralNetConfiguration;
import org.deeplearning4j.nn.conf.Updater;
import org.deeplearning4j.nn.conf.inputs.InputType;
import org.deeplearning4j.nn.conf.layers.ConvolutionLayer;
import org.deeplearning4j.nn.conf.layers.OutputLayer;
import org.deeplearning4j.nn.conf.layers.SubsamplingLayer;
import org.deeplearning4j.nn.multilayer.MultiLayerNetwork;
import org.deeplearning4j.nn.weights.WeightInit;
import org.nd4j.linalg.activations.Activation;
import org.nd4j.linalg.lossfunctions.LossFunctions;

import java.util.ArrayList;

/**
 * Created by duser on 18.8.2.
 */

public class App {

    ArrayList<Double> acc = new ArrayList<Double>();
    ArrayList<Double> f1 = new ArrayList<Double>();
    ArrayList<Double> prec = new ArrayList<Double>();
    ArrayList<Double> rec = new ArrayList<Double>();
    public ArrayList<Integer> smp_range;
    public ArrayList<Double> lr_range;

    public App() {
        lr_range= SortRange.range(.0001, .0002, .0001);
        smp_range = SortRange.range(80, 270, 20);

        for (Integer sm : smp_range) {
            for (Double lrate : lr_range) {
                Evaluation evaler = App.createModel(sm, lrate);
                System.out.println(String.format("smp_size: %s, l_rate: %.3f, fp:%.3f, fn: %.3f, posit: %s, rec:%.3f",
                        sm, lrate, evaler.falsePositiveRate(), evaler.falseNegativeRate(),
                        evaler.positive(), evaler.recall()));
                acc.add(evaler.accuracy());
                f1.add(evaler.f1());
                prec.add(evaler.precision());
                rec.add(evaler.recall());
            }
        }
        rec = SortRange.round_(rec);
        f1 = SortRange.round_(f1);
        acc = SortRange.round_(acc);
        prec = SortRange.round_(prec);
    }


    public static Evaluation createModel(Integer samplesize, Double lr) {
        BasicConfigurator.configure(); // dingsta WARN bekompiliuojant
        CifarDataSetIterator dataSetIterator = new CifarDataSetIterator(2, samplesize, true);
        // gauname train dataset////
        //System.out.println(dataSetIterator.getLabels());
        ConvolutionLayer lay0 = new ConvolutionLayer.Builder(5, 5)
                .nIn(3).nOut(16).stride(1, 1).padding(2, 2).weightInit(WeightInit.XAVIER)
                .name("First conv layer").activation(Activation.RELU).build();
        SubsamplingLayer lay1 = new SubsamplingLayer.Builder(SubsamplingLayer.PoolingType.MAX)
                .kernelSize(2, 2).stride(2, 2).name("First subsmpl layer").build();
        ConvolutionLayer lay2 = new ConvolutionLayer.Builder(5, 5)
                .nOut(20).stride(1, 1).padding(2, 2).weightInit(WeightInit.XAVIER)
                .name("Second conv layer").activation(Activation.RELU).build();
        SubsamplingLayer lay3 = new SubsamplingLayer.Builder(SubsamplingLayer.PoolingType.MAX)
                .kernelSize(2, 2).stride(2, 2).name("Second subsmpl layer").build();
        ConvolutionLayer lay4 = new ConvolutionLayer.Builder(5, 5)
                .nOut(20).stride(1, 1).padding(2, 2).weightInit(WeightInit.XAVIER)
                .name("Third conv layer").activation(Activation.RELU).build();
        SubsamplingLayer lay5 = new SubsamplingLayer.Builder(SubsamplingLayer.PoolingType.MAX)
                .kernelSize(2, 2).stride(2, 2).name("Third subsmpl layer").build();
        OutputLayer lay6 = new OutputLayer.Builder(LossFunctions.LossFunction.NEGATIVELOGLIKELIHOOD)
                .activation(Activation.SOFTMAX).weightInit(WeightInit.XAVIER)
                .name("Output").nOut(10).build();
        MultiLayerConfiguration configuration = new NeuralNetConfiguration.Builder()
                .seed(12345).iterations(1).optimizationAlgo(OptimizationAlgorithm.STOCHASTIC_GRADIENT_DESCENT)
                .learningRate(lr).regularization(true).l2(.0004).updater(Updater.NESTEROVS)
                .momentum(.9).list().layer(0, lay0).layer(1, lay1).layer(2, lay2).layer(3, lay3)
                .layer(4, lay4).layer(5, lay5).layer(6, lay6).pretrain(false).backprop(true)
                .setInputType(InputType.convolutional(32, 32, 3)).backpropType(BackpropType.TruncatedBPTT)
                .tBPTTForwardLength(50).tBPTTBackwardLength(50).build();
        MultiLayerNetwork network = new MultiLayerNetwork(configuration);
        network.init();
        network.fit(dataSetIterator); // training of network
        Evaluation evaluation = network.evaluate(new CifarDataSetIterator(2, samplesize / 10, false));
        return evaluation;
    }

    public ArrayList<Double> getAcc() {

        return acc;
    }
    public ArrayList<Double> getRec() {

        return rec;
    }
    public ArrayList<Double> getF1() {

        return f1;
    }
    public ArrayList<Double> getPrec() {

        return prec;
    }
    public ArrayList<Integer> getRang() {
        ArrayList<Integer> sl = new ArrayList<Integer>();
        for (int a = 0; a < smp_range.size(); a+= 1) {

            for (int i = 0; i < lr_range.size(); i++) {

                sl.add(smp_range.get(a));
            }
        }
        System.out.println(String.format("len of sl: %s", sl.size()));
        return sl;
    }
}



