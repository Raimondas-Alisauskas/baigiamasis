package convolution;

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
import java.util.List;

public class ConvModel {

    private final List<Double> acc;
    private final List<Double> f1;
    private final List<Double> prec;
    private final List<Double> rec;
    private final List<Double> far;
    private final List<Double> fn;
    private final double toPercent = 100.;

    private MultiLayerNetwork network;
    private CifarDataSetIterator dataSetIterator;
    private int batchSize = 2;

    public ConvModel(List<Integer> samples, List<Double> learningRate, Integer nIn, Integer nOut,Integer pad,
                     Integer kernSize, Integer stride, double moment, Integer builder, boolean pretrain) {

        this.acc = new ArrayList<>();
        this.f1 = new ArrayList<>();
        this.prec = new ArrayList<>();
        this.rec = new ArrayList<>();
        this.far = new ArrayList<>();
        this.fn = new ArrayList<>();

        for (int s = 0; s < samples.size(); s += 1) {
            for (int lr = 0; lr < learningRate.size(); lr += 1) {

                Evaluation evaler = createModel(samples.get(s), learningRate.get(lr), nIn, nOut, pad, kernSize, stride,
                        moment, builder, pretrain);

                this.acc.add(evaler.accuracy() * toPercent);
                this.f1.add(evaler.f1() * toPercent);
                this.prec.add(evaler.precision() * toPercent);
                this.rec.add(evaler.recall() * toPercent);
                this.far.add(evaler.falseAlarmRate() * toPercent);
                this.fn.add(evaler.falseNegativeRate() * toPercent);
            }
        }
    }

    private Evaluation createModel(Integer samplesize, Double lr, Integer nIn, Integer nOut, Integer pad, Integer
                                   kernSize, Integer stride, double moment, Integer builder, boolean pretrain) {

        BasicConfigurator.configure(); // dingsta WARN bekompiliuojant
        dataSetIterator = new CifarDataSetIterator(batchSize, samplesize, true);
        // gauname train dataset////

        ConvolutionLayer lay0 = new ConvolutionLayer.Builder(builder, builder)
                .nIn(nIn).nOut(16).stride(1, 1).padding(pad, pad).weightInit(WeightInit.XAVIER)
                .name("First conv layer").activation(Activation.RELU).build();
        SubsamplingLayer lay1 = new SubsamplingLayer.Builder(SubsamplingLayer.PoolingType.MAX)
                .kernelSize(kernSize, kernSize).stride(stride, stride).name("First subsmpl layer").build();
        ConvolutionLayer lay2 = new ConvolutionLayer.Builder(builder, builder)
                .nOut(nOut).stride(1, 1).padding(pad, pad).weightInit(WeightInit.XAVIER)
                .name("Second conv layer").activation(Activation.RELU).build();
        SubsamplingLayer lay3 = new SubsamplingLayer.Builder(SubsamplingLayer.PoolingType.MAX)
                .kernelSize(kernSize, kernSize).stride(stride, stride).name("Second subsmpl layer").build();
        ConvolutionLayer lay4 = new ConvolutionLayer.Builder(builder, builder)
                .nOut(nOut).stride(1, 1).padding(pad, pad).weightInit(WeightInit.XAVIER)
                .name("Third conv layer").activation(Activation.RELU).build();
        SubsamplingLayer lay5 = new SubsamplingLayer.Builder(SubsamplingLayer.PoolingType.MAX)
                .kernelSize(kernSize, kernSize).stride(stride, stride).name("Third subsmpl layer").build();
        OutputLayer lay6 = new OutputLayer.Builder(LossFunctions.LossFunction.NEGATIVELOGLIKELIHOOD)
                .activation(Activation.SOFTMAX).weightInit(WeightInit.XAVIER)
                .name("Output").nOut(10).build();
        MultiLayerConfiguration configuration = new NeuralNetConfiguration.Builder()
                .seed(12345).iterations(3).optimizationAlgo(OptimizationAlgorithm.STOCHASTIC_GRADIENT_DESCENT)
                .learningRate(lr).regularization(true).l2(lr).updater(Updater.NESTEROVS)
                .momentum(moment).list().layer(0, lay0).layer(1, lay1).layer(2, lay2).layer(3, lay3)
                .layer(4, lay4).layer(5, lay5).layer(6, lay6).pretrain(pretrain).backprop(true)
                .setInputType(InputType.convolutional(32, 32, 3)).backpropType(BackpropType.TruncatedBPTT)
                .tBPTTForwardLength(50).tBPTTBackwardLength(50).build();

        network = new MultiLayerNetwork(configuration);

        network.init();
        network.fit(dataSetIterator); // training of network

        return network.evaluate(new CifarDataSetIterator(batchSize, samplesize / 4, true));
    }

    double[] getAcc() {
        return acc.stream().mapToDouble(Double::doubleValue).toArray();
    }

    double[] getRec() {
        return rec.stream().mapToDouble(Double::doubleValue).toArray();
    }

    double[] getPrec() {
        return prec.stream().mapToDouble(Double::doubleValue).toArray();
    }

    double[] getFar() {
        return far.stream().mapToDouble(Double::doubleValue).toArray();
    }

}