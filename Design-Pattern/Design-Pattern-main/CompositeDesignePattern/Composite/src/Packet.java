import java.util.ArrayList;
import java.util.List;

public class Packet {
    private String name;
    private List<Urun> uruns;

    public Packet() {
    }

    public Packet(String name) {
        this.name = name;
        this.uruns = new ArrayList<Urun>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Urun> getUruns() {
        return uruns;
    }

    public void setUruns(List<Urun> uruns) {
        this.uruns = uruns;
    }

    

   

    

    
    
}
