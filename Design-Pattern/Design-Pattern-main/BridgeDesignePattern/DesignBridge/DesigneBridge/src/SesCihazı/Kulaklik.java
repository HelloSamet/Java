package SesCihazı;

public class Kulaklik implements SesCihazi {

    @Override
    public void PlayVoice(String ses) {
        System.out.println("Kulaklik Ses Caliyor --> "+ses);
    }
    
}
