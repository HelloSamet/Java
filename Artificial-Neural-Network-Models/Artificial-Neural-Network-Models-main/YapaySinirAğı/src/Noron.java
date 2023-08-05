import java.util.Random;

public class Noron {
    public double bias;
    public double[] w;
    public Fonksiyon fonksiyon;
    public Noron(int dimesion, double bias, Fonksiyon fonksiyon)
    {
        this.w = new double[dimesion];
        for(int i = 0; i< dimesion;i++){
            w[i] = new Random().nextDouble();
        }
        this.bias = bias;
        this.fonksiyon = fonksiyon;
    }

    public String getirW(){
        String data = "";
        for(int i=0; i<w.length;i++){
            data = data + " " + w[i];
        }
        return data;
    }

    public int deneme(int x, int y){
        if (x == y){
            return 1;
        }else{
            return -1;
        }
    }
    public double getBias() {
        return bias;
    }
    public void setBias(double bias) {
        this.bias = bias;
    }
    public double[] getW() {
        return w;
    }
    public void setW(double[] w) {
        this.w = w;
    }
    public Fonksiyon getFonksiyon() {
        return fonksiyon;
    }
    public void setFonksiyon(Fonksiyon fonksiyon) {
        this.fonksiyon = fonksiyon;
    }
    

    
}
