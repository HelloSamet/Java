import java.math.BigDecimal;
import java.util.List;

public class FiyatHesaplamaUtil {
    public static BigDecimal ToplamUrunFiyati(List<Urun> uruns){
        BigDecimal toplamTutar=BigDecimal.ZERO;

        for (Urun urun : uruns) {
            toplamTutar=toplamTutar.add(urun.getFiyat());
        }
        return toplamTutar;
    }

    public static BigDecimal ToplamPaketFiyati(List<Paket> pakets){
        BigDecimal toplamTutar=BigDecimal.ZERO;

        for (Paket paket : pakets) {
            toplamTutar=toplamTutar.add(paket.getFiyat());
        }
        return toplamTutar;
    }
}
