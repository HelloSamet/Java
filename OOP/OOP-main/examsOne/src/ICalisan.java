import java.util.List;

public interface ICalisan {
    public void CalisanAdd(Calisan calisan);
    public void CalisanUpdate(Calisan calisan);
    public void CalisanDelete(Calisan calisan);
    public List<Calisan> CalisanList();
    public Calisan CalisanGetir(int id);
    public void IslemEkle(int calisanId,Islemler islem);
}
