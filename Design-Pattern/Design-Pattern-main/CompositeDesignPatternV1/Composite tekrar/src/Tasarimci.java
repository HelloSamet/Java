public class Tasarimci implements ICalisan {
    private String isim;
    private int id;

    @Override
    public void BilgiGoster() {
        System.out.println("Tasarımcı "+isim);
        
    }

    public Tasarimci() {
    }

    public Tasarimci(String isim, int id) {
        this.isim = isim;
        this.id = id;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Tasarımcı";
    }
}
