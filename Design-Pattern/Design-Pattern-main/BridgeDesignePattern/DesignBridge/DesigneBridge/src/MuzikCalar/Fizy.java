package MuzikCalar;

public class Fizy implements MuzikCalar {

    @Override
    public String MuzikCal(Music music) {

        System.out.println("Fizy : "+music.getName()+" Sarkisini Caliyor.");
        return music.getName();
    }
    
}
