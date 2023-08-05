public class Arac {
    private int aracID;
    private int adressID;



    
    public Arac() {
    }

    
    public Arac(int aracID, int adressID) {
        this.aracID = aracID;
        this.adressID = adressID;
    }


    public int getAracID() {
        return aracID;
    }
    public void setAracID(int aracID) {
        this.aracID = aracID;
    }
    public int getAdressID() {
        return adressID;
    }
    public void setAdressID(int adressID) {
        this.adressID = adressID;
    }
}
