public class App {
    public static void main(String[] args) throws Exception {
        Priz priz=new Priz();

        Utu utu=new Utu();
        BuzDolabi buzDolabi=new BuzDolabi();

        priz.ElektrikVer(utu);
        priz.ElektrikVer(buzDolabi);

        SamsungTelefon samsungTelefon=new SamsungTelefon();
        TelefonElektrikliEvAletiAdapter telefonElektrikliEvAletiAdapter= new  TelefonElektrikliEvAletiAdapter(samsungTelefon);

        priz.ElektrikVer(telefonElektrikliEvAletiAdapter);

    }
}
