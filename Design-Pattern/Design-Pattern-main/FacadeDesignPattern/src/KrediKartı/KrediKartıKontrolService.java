package KrediKartı;

import Borc.OdemeBilgileri;
import Gecikme.DateUtil;

import java.util.Date;

public class KrediKartıKontrolService {
    public boolean isKredikartiGecerli(OdemeBilgileri odemeBilgileri){
        Long sonKullanimAy=odemeBilgileri.getSonKullanmaAy();
        Long sonKullanimYil=odemeBilgileri.getSonKullanmaYil();

        Date gununTarihi= DateUtil.getGununTarihi();

        Long gununAyi =DateUtil.TarihinAyi(gununTarihi);
        Long gununYili =DateUtil.TarihinYili(gununTarihi);

        boolean isKrediKartiGecerli=false;
        if (sonKullanimYil.compareTo(gununYili)>0){
            isKrediKartiGecerli=true;
        }else if (sonKullanimYil.compareTo(gununYili)==0){
            if (sonKullanimAy.compareTo(gununAyi)>=0){
                isKrediKartiGecerli=true;
            }
        }

        if (!isKrediKartiGecerli){
            System.out.println("Bilgi : Geçersiz Kredi Karti Bilgileri.!");
        }

        return isKrediKartiGecerli;
    }
}
