package Cihaz;

import MuzikCalar.Fizy;
import MuzikCalar.Music;
import SesCihazı.Kulaklik;

public class BilgisayarKulaklFizy extends MusicCalabilenBilgisayar {
    public BilgisayarKulaklFizy(){
        sesCihazi=new Kulaklik();
        muzikCalar=new Fizy();
    }

    @Override
    public void MusicCal(Music music) {
        System.out.println("Bilgisayar Calisti");
        super.MusicCal(music);
    }

    
}
