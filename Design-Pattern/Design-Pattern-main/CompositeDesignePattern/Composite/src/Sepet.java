import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Sepet {
    private String name;
    private List<Urun> uruns;
    private List<Packet> packets;
    private List<Kumanya> kumanyas;


    public Sepet(String name) {
        this.name = name;
        this.uruns=new ArrayList<>();
        this.packets=new ArrayList<>();
        this.kumanyas=new ArrayList<>();
    }

    public BigDecimal getToplamTutar(){
        BigDecimal toplamTutar=BigDecimal.ZERO;
        for (Urun urun : uruns) {
            toplamTutar=toplamTutar.add(urun.getPrice());
        }

        for (Packet packet : packets) {
            List<Urun>urunList=packet.getUruns();
            for (Urun urun : urunList) {
                toplamTutar=toplamTutar.add(urun.getPrice());
            }
        }

        for (Kumanya kumanya : kumanyas) {
            List<Packet>packetList=kumanya.getPackets();
            List<Urun>urunList=kumanya.getUruns();
            for (Urun urun : urunList) {
                toplamTutar=toplamTutar.add(urun.getPrice());
            }
            for (Packet packet : packetList) {
                List<Urun>urunList2=packet.getUruns();
                for (Urun urun : urunList) {
                    toplamTutar=toplamTutar.add(urun.getPrice());
                }
            }
            
        }

        return toplamTutar;

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
