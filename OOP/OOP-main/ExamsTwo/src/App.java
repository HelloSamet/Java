import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        Urun urun = new Urun();
        urun.setId(1);
        urun.setName("Samsung S8");
        urun.setDescription("Samsung S8");
        urun.setPrice(1000);
        urun.setStock(10);

        Urun urun2 = new Urun();
        urun2.setId(2);
        urun2.setName("Samsung S9");
        urun2.setDescription("Samsung S9");
        urun2.setPrice(2000);
        urun2.setStock(20);

        Urun urun3 = new Urun();
        urun3.setId(3);
        urun3.setName("Samsung S10");
        urun3.setDescription("Samsung S10");
        urun3.setPrice(3000);
        urun3.setStock(30);

        List<Urun> urunler = new ArrayList<>();
        urunler.add(urun);
        urunler.add(urun2);
        urunler.add(urun3);

        Market market = new Market();
        market.setId(1);
        market.setName("Samsung");
        market.setAddress("Istanbul");
        market.setPhone("05555555555");
        market.setEmail("Samsung@gmail.com");
        market.setWebsite("www.samsung.com");
        market.setUrunler(urunler);

        System.out.println(market.toString());
    }
}
