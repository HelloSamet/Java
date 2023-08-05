public class BuzDolabi implements ElektrikliEvAletleri {

    
    private int volt;

    public BuzDolabi(){
        this.volt=220;
    }
   
    @Override
    public int PrizeTakVeCalistir() {
        System.out.println("Buzdolabi Calisti..");
        return volt;
    }
    
}
