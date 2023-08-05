package Cihaz;

import MuzikCalar.Music;
import MuzikCalar.MuzikCalar;
import SesCihazı.SesCihazi;

public abstract class MusicCalabilenBilgisayar {
    protected SesCihazi sesCihazi;
    protected MuzikCalar muzikCalar;


    public MusicCalabilenBilgisayar() {
    }


    public MusicCalabilenBilgisayar(SesCihazi sesCihazi, MuzikCalar muzikCalar) {
        this.sesCihazi = sesCihazi;
        this.muzikCalar = muzikCalar;
    }

    void MusicCal(Music music){
       String ses= this.muzikCalar.MuzikCal(music);
       this.sesCihazi.PlayVoice(ses);
    }

    

    

    
}
