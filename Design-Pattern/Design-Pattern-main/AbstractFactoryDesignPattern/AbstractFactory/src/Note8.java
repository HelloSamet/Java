public class Note8 implements Telefon{
    private String model;
    private String batarya;
    private int en;
    private int boy;

    
    

    public Note8() {
    }
    public Note8(String model, String batarya, int en, int boy) {
        this.model = model;
        this.batarya = batarya;
        this.en = en;
        this.boy = boy;
    }
    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public String getBatarya() {
        return batarya;
    }
    public void setBatarya(String batarya) {
        this.batarya = batarya;
    }
    public int getEn() {
        return en;
    }
    public void setEn(int en) {
        this.en = en;
    }
    public int getBoy() {
        return boy;
    }
    public void setBoy(int boy) {
        this.boy = boy;
    }
    @Override
    public String toString() {
        return "Note8 [batarya=" + batarya + ", boy=" + boy + ", en=" + en + ", model=" + model + "]";
    }
}
