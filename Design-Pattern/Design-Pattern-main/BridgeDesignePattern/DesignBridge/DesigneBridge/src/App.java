import Cihaz.BilgisayarKulaklFizy;
import MuzikCalar.Music;

public class App {
    public static void main(String[] args) throws Exception {
        Music music=new Music("Sezen Aksu - Gülümse", "Gülümse Hadi Gülümse");
        BilgisayarKulaklFizy bilgisayarKulaklFizy=new BilgisayarKulaklFizy();
        bilgisayarKulaklFizy.MusicCal(music);
    }
}
