import java.util.List;

public class Musteri {
    private int id;
    private String adi;
    private String soyadi;
    private String tcNo;
    private String telefon;
    private String adres;
    private String email;
    public List<Banka> Bankalar;

    public Musteri() {
    }

    public Musteri(int id, String adi, String soyadi, String tcNo, String telefon, String adres, String email) {
        this.id = id;
        this.adi = adi;
        this.soyadi = soyadi;
        this.tcNo = tcNo;
        this.telefon = telefon;
        this.adres = adres;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAdi() {
        return adi;
    }

    public void setAdi(String adi) {
        this.adi = adi;
    }

    public String getSoyadi() {
        return soyadi;
    }

    public void setSoyadi(String soyadi) {
        this.soyadi = soyadi;
    }

    public String getTcNo() {
        return tcNo;
    }

    public void setTcNo(String tcNo) {
        this.tcNo = tcNo;
    }

    public String getTelefon() {
        return telefon;
    }

    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }

    public String getAdres() {
        return adres;
    }

    public void setAdres(String adres) {
        this.adres = adres;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void BankaEkle(Banka banka){
        Bankalar.add(banka);
    }

    public void BankaSil(Banka banka){
        Bankalar.remove(banka);
    }

    @Override
    public String toString() {
        return "Musteri [Bankalar=" + Bankalar + ", adi=" + adi + ", adres=" + adres + ", email=" + email + ", id=" + id
                + ", soyadi=" + soyadi + ", tcNo=" + tcNo + ", telefon=" + telefon + "]";
    }


    

    
    



}
