import java.util.List;

public class CalisanBusiness implements ICalisan {

    public List<Calisan> calisanlar;
    public List<Islemler> islemler;

    @Override
    public void CalisanAdd(Calisan calisan) {
        calisanlar.add(calisan);

    }

    @Override
    public void CalisanUpdate(Calisan calisan) {
        // write your code here

    }

    @Override
    public void CalisanDelete(Calisan calisan) {
        calisanlar.remove(calisan);

    }

    @Override
    public List<Calisan> CalisanList() {
        // TODO Auto-generated method stub
        return calisanlar;
    }

    @Override
    public Calisan CalisanGetir(int id) {
        // TODO Auto-generated method stub
        return calisanlar.get(id);
    }

    @Override
    public void IslemEkle(int CalisanId, Islemler islem) {
        // TODO Auto-generated method stub
        islemler.add(islem);

    }
}
