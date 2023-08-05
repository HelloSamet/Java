import java.util.Arrays;

public class App {
    public static void main(String[] args) throws Exception {
        
        // Create a new instance of the Banka class
        Banka banka = new Banka();
        banka.setId(1);
        banka.setBankName("Banka1");
        banka.setBankPhone("123456789");
        banka.setBankEmail("Banka1@gmail.com");
        banka.setBankWeb("www.Banka1.com");


        Banka banka2 = new Banka();
        banka2.setId(2);
        banka2.setBankName("Banka2");
        banka2.setBankPhone("123456789");
        banka2.setBankEmail("Banka2@gmail.com");
        banka2.setBankWeb("www.Banka2.com");

        // Create a new instance of the Musteri class
        Musteri musteri = new Musteri();
        musteri.setId(1);
        musteri.setAdi("Musteri1");
        musteri.setSoyadi("Musteri1");
        musteri.setTcNo("123456789");
        musteri.setTelefon("123456789");
        musteri.setAdres("Musteri1");
        musteri.setEmail("Musteri1@gmail.com");

        Musteri musteri2 = new Musteri();
        musteri2.setId(2);
        musteri2.setAdi("Musteri2");
        musteri2.setSoyadi("Musteri2");
        musteri2.setTcNo("123456789");
        musteri2.setTelefon("123456789");
        musteri2.setAdres("Musteri2");
        musteri2.setEmail("Musteri2@gmail.com");


        Calisan calisan = new Calisan();
        calisan.setId(1);
        calisan.setName("Calisan1");
        calisan.setSurname("Calisan1");
        calisan.setPhone("123456789");
        calisan.setEmail("Calisan1@gmail.com");

        Calisan calisan2 = new Calisan();
        calisan2.setId(2);
        calisan2.setName("Calisan2");
        calisan2.setSurname("Calisan2");
        calisan2.setPhone("123456789");
        calisan2.setEmail("Calisan2@gmail.com");
        
    }
}
