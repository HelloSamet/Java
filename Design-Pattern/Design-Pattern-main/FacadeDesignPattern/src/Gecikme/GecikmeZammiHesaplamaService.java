package Gecikme;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Date;

public class GecikmeZammiHesaplamaService {
    private GecikmezammiOraniEntityService gecikmezammiOraniEntityService;

    public GecikmeZammiHesaplamaService( ) {
        this.gecikmezammiOraniEntityService = new GecikmezammiOraniEntityService();
    }

    public BigDecimal GecikmeZammiHesapla(BigDecimal tutar, Date vadeTarihi)
    {
        BigDecimal gecikmezammi=BigDecimal.ZERO;
        if (vadeTarihi.compareTo(new Date())>=0){
            return gecikmezammi;
        }

        gecikmezammi=GecikmeZamminiHesapla(tutar,vadeTarihi);
        return  gecikmezammi;
    }

    private BigDecimal GecikmeZamminiHesapla(BigDecimal tutar, Date vadeTarihi) {
        BigDecimal gecikmeZammiOrani=gecikmezammiOraniEntityService.getGecikmeZammiOran();

         Date gununTarihi = DateUtil.getGununTarihi();

         Long gunFarkiL= DateUtil.GunFarkiHesapla(vadeTarihi,gununTarihi);

         BigDecimal gunFarki=BigDecimal.valueOf(gunFarkiL);

         BigDecimal gecikmezammi=gecikmeZammiOrani.multiply(gunFarki).multiply(tutar);
         gecikmezammi=gecikmezammi.setScale(2, RoundingMode.HALF_DOWN);

         if (gecikmezammi.compareTo(BigDecimal.ZERO)>0){
             System.out.println("Bilgi : Gecikme Zammi Hesaplandi! Gecikme Zammi  Tutari : "+gecikmezammi);
         }

         return gecikmezammi;

    }
}
