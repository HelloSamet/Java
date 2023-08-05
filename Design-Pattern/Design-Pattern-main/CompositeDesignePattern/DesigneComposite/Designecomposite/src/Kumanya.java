import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Kumanya implements IFiyatlanabilir {
    private String name;
    private List<Urun> urunList;
    private List<Paket> paketList;
    
    public Kumanya() {
    }

    public Kumanya(String name) {
        this.name = name;
        this.urunList=new ArrayList<>();
        this.paketList=new ArrayList<>();
    }

    @Override
    public BigDecimal getFiyat() {
        BigDecimal toplamUrunFiyati=FiyatHesaplamaUtil.ToplamUrunFiyati(urunList);
        BigDecimal toplamPaketFiyati=FiyatHesaplamaUtil.ToplamPaketFiyati(paketList);
        return toplamUrunFiyati.add(toplamPaketFiyati);
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

    public List<Paket> getPaketList() {
        return paketList;
    }

    public void setPaketList(List<Paket> paketList) {
        this.paketList = paketList;
    }

    
    

    
}
