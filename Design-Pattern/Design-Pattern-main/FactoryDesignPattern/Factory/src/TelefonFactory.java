public class TelefonFactory {
    public static Telefon getTelefon(String model,String Batarya,int en,int boy){

    Telefon telefon;
    
        switch (model) {
            case "S8":
                    telefon=new S8(model,Batarya,en,boy);
                break;
            case "Note8":
                    telefon=new Note8(model, Batarya, en, boy);
                    break;
            default:
                telefon=new S8(model, Batarya, en, boy);
                break;
        }

        return telefon;
    }
}
