import java.util.List;

public class Market {
    private int id;
    private String name;
    private String address;
    private String phone;
    private String email;
    private String website;
    public List<Urun> urunler;

    public Market(int id, String name, String address, String phone, String email, String website) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.email = email;
        this.website = website;
    }

    public Market() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public List<Urun> getUrunler() {
        return urunler;
    }

    public void setUrunler(List<Urun> urunler) {
        this.urunler = urunler;
    }

    @Override
    public String toString() {
        return "Market [address=" + address + ", email=" + email + ", id=" + id + ", name=" + name + ", phone=" + phone
                + ", urunler=" + urunler + ", website=" + website + "]";
    }

    
    

}
