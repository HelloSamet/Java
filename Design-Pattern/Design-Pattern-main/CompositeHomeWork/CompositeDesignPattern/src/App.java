import Calisanlar.Tasarimcilar;
import Calisanlar.Yazilimcilar;
import Calisanlar.Yönetici;
import Projeler.ProjeA;
import Projeler.ProjeB;

public class App {
    public static void main(String[] args) throws Exception {
       Yazilimcilar yazilimci=new Yazilimcilar("ali");
       Yazilimcilar yazilimci2=new Yazilimcilar("Veli");
       Yazilimcilar yazilimci3=new Yazilimcilar("Hasan");
       Yazilimcilar yazilimci4=new Yazilimcilar("Mehmet");
       Tasarimcilar tasarimci=new Tasarimcilar("Veysel");
       Tasarimcilar tasarimci2=new Tasarimcilar("Ahmet");
       Tasarimcilar tasarimci3=new Tasarimcilar("Osman");
       Yönetici yönetici=new Yönetici("Yavuz");
       Yönetici yönetici1=new Yönetici("Selim");

       ProjeA projeA=new ProjeA("Tubitak Projesi");
       projeA.CalisanEkle(yazilimci);
       projeA.CalisanEkle(yazilimci2);
       projeA.CalisanEkle(yazilimci3);
       projeA.CalisanEkle(yazilimci4);
       projeA.CalisanEkle(tasarimci);
       projeA.CalisanEkle(tasarimci2);
       projeA.CalisanEkle(yönetici);
       projeA.CalisanEkle(yönetici1);


       projeA.CalisanSil(yönetici1);
       projeA.CalisanSil(yazilimci4);

       ProjeB projeB=new ProjeB("Banka Projesi");
       projeB.CalisanEkle(yazilimci4);
       projeB.CalisanEkle(tasarimci);
       projeB.CalisanEkle(tasarimci2);
       projeB.CalisanEkle(tasarimci3);
       projeB.CalisanEkle(yönetici);
       projeB.CalisanEkle(yönetici1);

       projeB.CalisanSil(yönetici1);
       projeB.CalisanSil(yazilimci4);



    }
}
