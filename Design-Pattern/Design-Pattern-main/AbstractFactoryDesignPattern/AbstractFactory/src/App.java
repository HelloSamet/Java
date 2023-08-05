public class App {
    public static void main(String[] args) throws Exception {
        Telefon telefon =S8Factory.TelefonOlustur("S8", "10000", 5, 4);
        System.out.println(telefon);
        telefon= Note8Factory.TelefonOlustur("Note8", "12000", 10, 8);
        System.out.println(telefon);


        System.out.println("***********************************************");

        
        Note8Factory note8Factory=new Note8Factory();
        telefon = note8Factory.olusturTelefon("Note8", "12000", 10, 8);
        System.out.println(telefon);
        S8Factory s8Factory=new S8Factory();
        telefon=s8Factory.olusturTelefon("S8", "10000", 5, 4);
        System.out.println(telefon);

    }
}
