public class Utu implements ElektrikliEvAletleri {
    private int volt;

    

    public Utu() {
        this.volt=220;
    }



    @Override
    public int PrizeTakVeCalistir() {
       System.out.println("Utu Calisti.");
        return volt;
    }
    
}
