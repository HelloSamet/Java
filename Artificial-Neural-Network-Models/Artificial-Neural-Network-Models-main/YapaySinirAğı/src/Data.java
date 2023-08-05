public class Data {
    public double[] input;
    public int output;
    public Data(double[] input, int output)//x ler double veri tipinde çünkü matematiksel işlemler var,ağırlıklar vs.|çıkış değeri de int çünkü sınıfların etiket karşılığıdır.0,1,2 gibi 
    {
        this.setInput(input);
        this.setOutput(output);
    }
    public double[] getInput() {
        return input;
    }
    public void setInput(double[] input) {
        this.input = input;
    }
    public int getOutput() {
        return output;
    }
    public void setOutput(int output) {
        this.output = output;
    }
}
