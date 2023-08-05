public class App {
    public static void main(String[] args) throws Exception {
        InsanKaynaklari ekip1 = new InsanKaynaklari();
        InsanKaynaklari ekip2 = new InsanKaynaklari();
        InsanKaynaklari ekip3 = new InsanKaynaklari();
        InsanKaynaklari ekip4 = new InsanKaynaklari();
        InsanKaynaklari ekip5 = new InsanKaynaklari();

        ICalisan yonetici = new Yonetici();
        ICalisan tasarimci = new Tasarimci();
        ICalisan gelistirici = new Gelistirici();

        ekip1.CalisanEkle(tasarimci);

        ekip2.CalisanEkle(tasarimci);
        ekip2.CalisanEkle(gelistirici);
        ekip2.CalisanEkle(ekip1);

        ekip3.CalisanEkle(tasarimci);

        ekip4.CalisanEkle(yonetici);
        ekip4.CalisanEkle(ekip3);
        ekip4.CalisanEkle(yonetici);
        ekip4.CalisanEkle(yonetici);
        ekip4.CalisanEkle(ekip2);

        ekip5.CalisanEkle(yonetici);
        ekip5.CalisanEkle(ekip4);

        ekip5.BilgiGoster();



    }
}
