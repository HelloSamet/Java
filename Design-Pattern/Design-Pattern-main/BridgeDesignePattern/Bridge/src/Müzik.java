public class Müzik {
    private String name;
    private String voice;

    
    public Müzik() {
    }


    public Müzik(String name, String voice) {
        this.name = name;
        this.voice = voice;
    }


    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }


    public String getVoice() {
        return voice;
    }


    public void setVoice(String voice) {
        this.voice = voice;
    }


    @Override
    public String toString() {
        return "Müzik [name=" + name + " ]";
    }

    

    

    
}
