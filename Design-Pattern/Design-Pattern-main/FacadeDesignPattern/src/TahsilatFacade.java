import Borc.*;
import Gecikme.GecikmeZammiHesaplamaService;
import KrediKartı.KrediKartiService;
import Tahsilat.TahsilatKontrolService;

import java.math.BigDecimal;


public class TahsilatFacade {

    private GecikmeZammiHesaplamaService gecikmeZammiHesaplamaService;
    private TahsilatKontrolService tahsilatKontrolService;
    private KrediKartiService krediKartiService;

    public TahsilatFacade() {
        this.gecikmeZammiHesaplamaService=new GecikmeZammiHesaplamaService();
        this.krediKartiService=new KrediKartiService();
        this.tahsilatKontrolService=new TahsilatKontrolService();
    }

    public boolean TahsilatYap(Borc borc, OdemeBilgileri odemeBilgileri){
            boolean tahsilataUygun=tahsilatKontrolService.isTahsilataUygun(borc);
            if (!tahsilataUygun){
                return false;
            }

            BigDecimal borcTutari=borc.getBorcTutari();
            BigDecimal gecikmeZammi= gecikmeZammiHesaplamaService.GecikmeZammiHesapla(borc.getBorcTutari(),borc.getVadeTarihi());

           BigDecimal odenecekTutar= borcTutari.add(gecikmeZammi);

        System.out.println("Bilgi : Kredi Kartindan Odenecek Tutar : "+odenecekTutar+" TL kadar Tahsilat deneniyor.");

        boolean isSuccess =krediKartiService.krediKartindanTahsilDene(odemeBilgileri,odenecekTutar);

        return isSuccess;


    }
}
