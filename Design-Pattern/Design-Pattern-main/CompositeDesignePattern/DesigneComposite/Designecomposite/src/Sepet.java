import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Sepet {
    private String name;
    private List<IFiyatlanabilir> fiyatlanabilirs;

    public Sepet() {
    }

    public Sepet(String name) {
        this.name = name;
        this.fiyatlanabilirs=new ArrayList<>();
    }

    public BigDecimal ToplamOdenecekTutar(){
        BigDecimal toplamTutar=BigDecimal.ZERO;
        for (IFiyatlanabilir iFiyatlanabilir : fiyatlanabilirs) {
            toplamTutar=toplamTutar.add(iFiyatlanabilir.getFiyat());
        }
        return toplamTutar;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<IFiyatlanabilir> getFiyatlanabilirs() {
        return fiyatlanabilirs;
    }

    public void setFiyatlanabilirs(List<IFiyatlanabilir> fiyatlanabilirs) {
        this.fiyatlanabilirs = fiyatlanabilirs;
    }

    

    
}
