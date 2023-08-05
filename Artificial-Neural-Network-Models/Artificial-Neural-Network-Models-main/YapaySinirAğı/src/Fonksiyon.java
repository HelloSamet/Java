public abstract class Fonksiyon{
    
    public double net(double[] input, double[] w, double bias)
    {
        double sum =0;
        for(int i =0; i< input.length;i++){
            sum += input[i] * w[i];
        }
        return sum + w[w.length-1]*bias;
    }
    
    public abstract double calculate(double net);
}
