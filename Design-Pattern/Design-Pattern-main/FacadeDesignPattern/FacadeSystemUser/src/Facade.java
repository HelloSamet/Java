public class Facade {
    Sistem1Kontrol sistem1Kontrol;
    Sistem2Operations sistem2Operations;
    TcKimlikSistem tcKimlikSistem;

    public Facade() {
        this.sistem1Kontrol=new Sistem1Kontrol();
        this.tcKimlikSistem=new TcKimlikSistem();
        this.sistem2Operations=new Sistem2Operations();
    }

    public void Sistem2UyeEkle(String Tc){
        if ((tcKimlikSistem.Kontrol(Tc)) && (sistem1Kontrol.KaraListeKontrol(Tc))){
            sistem2Operations.UyeEkle(Tc);
        }else{
            System.out.println("Üye Kara Listede!");
        }
    }
}
