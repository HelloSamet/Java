package SesCihazı;

public class Hoparlor implements SesCihazi {

    @Override
    public void PlayVoice(String ses) {
       System.out.println("Hoparlor Ses Caliyor --> "+ses);
        
    }
    
}
