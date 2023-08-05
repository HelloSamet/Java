public class Note8Factory implements IFactory {
    public static Note8 TelefonOlustur(String model,String batarya,int en , int boy){
        return new Note8(model, batarya, en, boy);
    }

    @Override
    public Telefon olusturTelefon(String model, String batarya, int en, int boy) {
        return new Note8(model, batarya, en, boy);
    }
}
