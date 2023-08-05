public class SamsungTelefon implements Telefon {

    private int volt;

    public SamsungTelefon(){
        this.volt=5;
    }

    @Override
    public int SarjEt() {
        System.out.println("Samsung Telefon Sarj Oluyor..");
        return volt;
    }
    
}
