import java.util.ArrayList;
import java.util.List;

public class InsanKaynaklari implements ICalisan {

    private List<ICalisan> cList;

    @Override
    public void BilgiGoster() {
        
        System.out.println(cList);
    }
    
    public InsanKaynaklari() {
        cList = new ArrayList<>();
    }

    public void CalisanEkle(ICalisan calisan){
        cList.add(calisan);
    }
    public void CalisanCikar(ICalisan calisan){
        cList.remove(calisan);
    }

    @Override
    public String toString() {
        return "" + cList + "";
    }
    
}
