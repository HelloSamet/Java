public class Sistem1Kontrol {
    TcKimlikSistem tcKimlikSistem;

    public Sistem1Kontrol() {
        this.tcKimlikSistem=new TcKimlikSistem();
    }

    boolean KaraListeKontrol(String Tc) {
       if (tcKimlikSistem.Kontrol(Tc))
            return true;
        else
            return false;
    }
}
