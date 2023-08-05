import java.math.BigDecimal;

public class App {
    public static void main(String[] args) throws Exception {
        Urun domates=new Urun("Domates", BigDecimal.TEN);
        Urun patates=new Urun("Patates", BigDecimal.ONE);
        Urun sogan=new Urun("Sogan", BigDecimal.ONE);

        Paket sebzePacket=new Paket("Sebze Paketi");
        sebzePacket.getUrunList().add(domates);
        sebzePacket.getUrunList().add(patates);
        sebzePacket.getUrunList().add(sogan);

        Urun sesSistemi=new Urun("Ses Sistemi", BigDecimal.valueOf(5000));
        Urun kulaklik=new Urun("Kulaklik", BigDecimal.valueOf(1000));

        Paket teknolojiPacket=new Paket("Teknoloji Paketi");
        teknolojiPacket.getUrunList().add(sesSistemi);
        teknolojiPacket.getUrunList().add(kulaklik);

        Urun top=new Urun("Futbol Topu", BigDecimal.valueOf(100));


        Kumanya kumanya=new Kumanya("Ramazan Kumanyasi");

        Urun yag=new Urun("Yag", BigDecimal.valueOf(150));
        kumanya.getPaketList().add(sebzePacket);
        kumanya.getUrunList().add(yag);

        Sepet sepet=new Sepet("Benim Sepetim");
        sepet.getFiyatlanabilirs().add(sebzePacket);
        sepet.getFiyatlanabilirs().add(teknolojiPacket);
        sepet.getFiyatlanabilirs().add(top);
        sepet.getFiyatlanabilirs().add(kumanya);
        
        BigDecimal toplamTutar=sepet.ToplamOdenecekTutar();

        System.out.println("Ödenecek toplam Tutar : "+toplamTutar+" TL");
    }
}
