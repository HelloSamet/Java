public class BinaryFonksiyon extends Fonksiyon {

    @Override
    public double calculate(double net) {
        
        if(net > 0){
            return 1;
        }else{
            return -1;
        }
        
    }

    

   
}
