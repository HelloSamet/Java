import java.util.ArrayList;
import java.util.List;

public class Kumanya {
    private String name;
    private List<Urun> uruns;
    private List<Packet> packets;


    public Kumanya(String name) {
        this.name = name;
        this.uruns=new ArrayList<>();
        this.packets=new ArrayList<>();
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


    public List<Packet> getPackets() {
        return packets;
    }


    public void setPackets(List<Packet> packets) {
        this.packets = packets;
    }

    
}
