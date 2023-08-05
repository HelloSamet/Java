public class S8Factory implements IFactory {
    public static S8 TelefonOlustur(String model,String batarya,int en , int boy){
        return new S8(model, batarya, en, boy);
    }

    @Override
    public Telefon olusturTelefon(String model, String batarya, int en, int boy) {
        return new S8(model, batarya, en, boy);
    }
    

}
