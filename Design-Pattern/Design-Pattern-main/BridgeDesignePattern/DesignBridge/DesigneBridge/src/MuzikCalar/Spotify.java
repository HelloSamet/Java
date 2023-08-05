package MuzikCalar;

public class Spotify implements MuzikCalar {

    @Override
    public String MuzikCal(Music music) {
       
        System.out.println("Spotify : "+music+" Şarkisini Caliyor.");
        return music.getName();
    }
    
}
