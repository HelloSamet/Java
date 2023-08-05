import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Paket implements IFiyatlanabilir {
    private String name;
    private List<Urun> urunList;
    public Paket() {
    }
    public Paket(String name) {
        this.name = name;
        this.urunList = new ArrayList<>();
    }
    @Override
    public BigDecimal getFiyat() {
        return FiyatHesaplamaUtil.ToplamUrunFiyati(urunList);
    }


    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public List<Urun> getUrunList() {
        return urunList;
    }
    public void setUrunList(List<Urun> urunList) {
        this.urunList = urunList;
    }

    
    

    
}
