public class TelefonElektrikliEvAletiAdapter implements ElektrikliEvAletleri {

    private Telefon telefon;

    public TelefonElektrikliEvAletiAdapter(Telefon _telefon){
        this.telefon=_telefon;
    }

    @Override
    public int PrizeTakVeCalistir() {
        
        return telefon.SarjEt();
    }
    
}
