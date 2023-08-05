import java.math.BigDecimal;

public class App {
    
    public static void main(String[] args) {
        Urun domates=new Urun("Domates", BigDecimal.TEN);
        Urun patates=new Urun("Patates", BigDecimal.ONE);
        Urun sogan=new Urun("Sogan", BigDecimal.ONE);

        Packet sebzePacket=new Packet("Sebze Paketi");
        sebzePacket.getUruns().add(domates);
        sebzePacket.getUruns().add(patates);
        sebzePacket.getUruns().add(sogan);

        Urun sesSistemi=new Urun("Ses Sistemi", BigDecimal.valueOf(5000));
        Urun kulaklik=new Urun("Kulaklik", BigDecimal.valueOf(1000));

        Packet teknolojiPacket=new Packet("Teknoloji Paketi");
        teknolojiPacket.getUruns().add(sesSistemi);
        teknolojiPacket.getUruns().add(kulaklik);

        Urun top=new Urun("Futbol Topu", BigDecimal.valueOf(100));

        Sepet sepet=new Sepet("Benim Sepetim");
        sepet.getPackets().add(sebzePacket);
        sepet.getPackets().add(teknolojiPacket);
        sepet.getUruns().add(top);

        BigDecimal toplamTutar=sepet.getToplamTutar();

        System.out.println("Ödenecek toplam Tutar : "+toplamTutar+" TL");

    }
}
