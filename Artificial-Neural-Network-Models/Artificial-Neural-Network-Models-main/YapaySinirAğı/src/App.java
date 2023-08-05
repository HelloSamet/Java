import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class App {
    public static List<Data> dataList = new ArrayList<Data>();
    public static int classCount = 0;

    public static void main(String[] args) throws Exception {

        double d1[] = { 1, 2 };
        double d2[] = { 2, 3 };
        double d3[] = { -1, 0 };
        double d4[] = { -1, -2 };
        double d5[] = { 1, 0 };
        double d6[] = { -1, 1 };

        dataList.add(new Data(d1, 1));
        dataList.add(new Data(d2, 1));
        dataList.add(new Data(d3, -1));
        dataList.add(new Data(d4, -1));
        dataList.add(new Data(d5, 1));
        dataList.add(new Data(d6, 1));

        int x = dataList.get(0).input.length + 1;
        HashSet<Integer> classArray = new HashSet<Integer>();
        for (int i = 0; i < dataList.size(); i++) {
            classArray.add(dataList.get(i).output);
        }
        classCount = classArray.size();

        SingleLayerSingleNoron(0.1, x, 1.0);

    }

    private static void SingleLayerSingleNoron(double c, int dimesion, double bias) {
        Noron noron = new Noron(dimesion, bias, new BinaryFonksiyon());

        double error = 0;
        while (true) {
            for (int i = 0; i < dataList.size(); i++) {
                double net = noron.fonksiyon.net(dataList.get(i).input, noron.w, noron.bias);
                double fnet = noron.fonksiyon.calculate(net);
                for (int j = 0; j < (dimesion - 1); j++) {
                    noron.w[j] = noron.w[j] + c * (dataList.get(i).output - fnet) * dataList.get(i).input[j];
                }
                noron.w[dimesion - 1] = noron.w[dimesion - 1] + c * (dataList.get(i).output - fnet) * noron.bias;
                error = error + Math.pow(dataList.get(i).output - fnet, 2);
                // error = error + Math.abs(dataList.get(i).output - fnet);
                if (error < 0.1) {
                    break;
                }

            }
            System.out.println(
                    "w: " + noron.getirW() +
                            " bias: " + noron.getBias() +
                            " error: " + error);

        }
    }

    public static void SingleLayerMultiNoron(double c, int dimesion, double bias) {
        List<Noron> noronList = new ArrayList<Noron>();
        for (int i = 0; i < classCount; i++) {
            noronList.add(new Noron(dimesion, bias, new BinaryFonksiyon()));
        }

        while (true) {
            double error = 0;
            for (int i = 0; i < dataList.size(); i++) {
                for (int j = 0; j < classCount; j++) {
                    Noron noron = noronList.get(j);
                    double net = noron.fonksiyon.net(dataList.get(i).input, noron.w, noron.bias);
                    double fnet = noron.fonksiyon.calculate(net);

                    for (int k = 0; k < (dimesion - 1); k++) {
                        noron.w[k] = noron.w[k]
                                + c * (noron.deneme(dataList.get(i).output, j) - fnet) * dataList.get(i).input[j];
                    }
                    noron.w[dimesion - 1] = noron.w[dimesion - 1] + c * (dataList.get(i).output - fnet) * noron.bias;
                    error = error + Math.pow(noron.deneme(dataList.get(i).output, j) - fnet, 2);
                }

            }
            if (error < 0.1 * classCount) {
                break;
            }
            
        }
    }

    static int maxIteration = 1000;
    public static void MultiLayerMultiNoron(double c, int dimension, double bias, int noronSize){
        List<Noron> inputNoronList = new ArrayList<Noron>();
        List<Noron> hiddenNoronList = new ArrayList<Noron>();
        double[] fnetV = new double[noronSize];
        for(int i = 0; i< classCount; i++){
            inputNoronList.add(new Noron(dimension, bias, new ContinousFunction()));
        }
        for(int i = 0; i< noronSize; i++){
            hiddenNoronList.add(new Noron(dimension, bias, new ContinousFunction()));
        }
        int iteration = 0;
        while(true){
           iteration = iteration + 1;
           if (iteration > maxIteration) {
               break;
           }
            for(int i = 0; i< dataList.size();i++){

                for(int j =0; j< classCount; j++){
                    Noron hiddenNoron = hiddenNoronList.get(j);
                    for(int k=0;k<noronSize;k++){
                        
                        Noron inputNoron = inputNoronList.get(k);
                        double netV = inputNoron.fonksiyon.net(dataList.get(i).input, inputNoron.w, inputNoron.bias);
                        fnetV[k] = inputNoron.fonksiyon.calculate(netV);
                    }
                    double netW = hiddenNoron.fonksiyon.net(fnetV, hiddenNoron.w, hiddenNoron.bias);
                    double fnetW = hiddenNoron.fonksiyon.calculate(netW);
                    for (int k=0; k<noronSize;k++){
                        hiddenNoron.w[k]=hiddenNoron.w[k] + c * (hiddenNoron.deneme(dataList.get(i).output, j) - fnetW) * fnetV[k];
                    }
                    hiddenNoron.w[noronSize]=hiddenNoron.w[noronSize] + c * (hiddenNoron.deneme(dataList.get(i).output,j) - fnetW) * hiddenNoron.bias;

                    ContinousFunction cont = (ContinousFunction)hiddenNoron.fonksiyon;

                    for(int k=0; k<noronSize;k++){
                       Noron inputNoron = inputNoronList.get(k);
                       for(int m = 0;m<dimension;m++){
                           inputNoron.w[m] = inputNoron.w[m] + c * (hiddenNoron.deneme(dataList.get(i).output, j) - fnetW) * cont.derivateCalculate(fnetV[k]) * dataList.get(i).input[m];
                       }
                       inputNoron.w[dimension] = inputNoron.w[dimension] + c * (hiddenNoron.deneme(dataList.get(i).output, j) - fnetW) * cont.derivateCalculate(fnetV[k]) * inputNoron.bias;
                    }
                    
                    
                        
                }
            }
        }
    }
}
