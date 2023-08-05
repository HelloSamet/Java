public class Computer {
    private Spotify spotify;
    private Hoparlör hoparlör;

    public Computer() {
        this.spotify=new Spotify();
        this.hoparlör=new Hoparlör();
    }

    public void PlaySing(Müzik müzik){
        System.out.println("Bilgisayar Calisti...");
       String ses = this.spotify.PlaySing(müzik);
       this.hoparlör.PlayVoice(ses);
    }   

    public Spotify getSpotify() {
        return spotify;
    }

    public void setSpotify(Spotify spotify) {
        this.spotify = spotify;
    }

    public Hoparlör getHoparlör() {
        return hoparlör;
    }

    public void setHoparlör(Hoparlör hoparlör) {
        this.hoparlör = hoparlör;
    }

    

    
}
