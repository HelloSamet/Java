package KrediKartı;

import Borc.OdemeBilgileri;

import java.math.BigDecimal;

public class KrediKartiService {
    private KrediKartıKontrolService krediKartıKontrolService;

    public KrediKartiService() {
        this.krediKartıKontrolService=new KrediKartıKontrolService();
    }

    public boolean krediKartindanTahsilDene(OdemeBilgileri odemeBilgileri, BigDecimal odenecekTutar){
       boolean krediKartiGecerli= krediKartıKontrolService.isKredikartiGecerli(odemeBilgileri);
       if (!krediKartiGecerli){
            return false;
       }

       boolean yeterliLimitVar=isYeterliLimitVar(odemeBilgileri,odenecekTutar);
       if (!yeterliLimitVar){
           return false;
       }
        System.out.println("Kredi kartindan Odenecek Tutar : "+odenecekTutar+"TL Tahsil Edilmistir.!");
       return true;
    }

    private boolean isYeterliLimitVar(OdemeBilgileri odemeBilgileri, BigDecimal odenecekTutar) {
        BigDecimal limit=getKrediKartiLimiti(odemeBilgileri);
        boolean isYeterliLimitVar=limit.compareTo(odenecekTutar)>0;

        if (isYeterliLimitVar){
            System.out.println("Bilgi : Kartta Yeterli Limit Bulunmamaktadir.");
        }
        return isYeterliLimitVar;
    }

    private BigDecimal getKrediKartiLimiti(OdemeBilgileri odemeBilgileri) {
        BigDecimal limit=BigDecimal.ZERO;
        String kartUzerindekiIsim=odemeBilgileri.getKartUzerindekiIsim();
        if (kartUzerindekiIsim.contains("Bahadir")){
            limit=new BigDecimal(100);
        }else if (kartUzerindekiIsim.contains("Ayse")){
            limit=new BigDecimal(1000);
        }else if (kartUzerindekiIsim.contains("Yusuf")){
            limit=new BigDecimal(10000);
        }
        return limit;
    }
}
