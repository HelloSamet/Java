public class ContinousFunction extends Fonksiyon {

    @Override
    public double calculate(double net) {
        
        return 1 / (1 + Math.pow(Math.E, -net));
    }

    public double derivateCalculate(double net){
        return Math.pow((Math.E), -net) / (1 + Math.pow(Math.E, -net));
    }
    
}
