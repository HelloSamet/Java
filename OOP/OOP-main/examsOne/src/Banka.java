import java.util.List;

public class Banka {
    private int id;
    private String BankName;
    private String BankPhone;
    private String BankEmail;
    private String BankWeb;
    public List<Calisan> calisans;
    public Banka() {
    }

    public Banka(int id, String BankName, String BankPhone, String BankEmail, String BankWeb) {
        this.id = id;
        this.BankName = BankName;
        this.BankPhone = BankPhone;
        this.BankEmail = BankEmail;
        this.BankWeb = BankWeb;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBankName() {
        return BankName;
    }

    public void setBankName(String bankName) {
        BankName = bankName;
    }

    public String getBankPhone() {
        return BankPhone;
    }

    public void setBankPhone(String bankPhone) {
        BankPhone = bankPhone;
    }

    public String getBankEmail() {
        return BankEmail;
    }

    public void setBankEmail(String bankEmail) {
        BankEmail = bankEmail;
    }

    public String getBankWeb() {
        return BankWeb;
    }

    public void setBankWeb(String bankWeb) {
        BankWeb = bankWeb;
    }

    public void CalisanEkle(Calisan calisan){
        calisans.add(calisan);
    }

    public void CalisanSil(Calisan calisan){
        calisans.remove(calisan);
    }

    
    

}
