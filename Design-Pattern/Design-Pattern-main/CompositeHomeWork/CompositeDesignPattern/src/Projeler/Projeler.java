package Projeler;

import java.util.ArrayList;
import java.util.List;

import Calisanlar.ICalisanlar;

public abstract class Projeler {
    private String projeName;
    private List<ICalisanlar> calisanlarList;

    public Projeler(String projeName) {
        this.projeName = projeName;
        this.calisanlarList=new ArrayList<>();
    }

    public void CalisanEkle(ICalisanlar calisan) {
        this.calisanlarList.add(calisan);
        System.out.println();
        System.out.println(calisan.getName()+"Adli Calisan "+this.projeName+"ne Eklendi --> " + calisan.getDepertmant());

    }

    public void CalisanSil(ICalisanlar calisan){
         this.calisanlarList.remove(calisan);
         System.out.println();
         System.out.println(calisan.getName()+"Adli Calisan "+this.projeName+"den Silindi --> "+calisan.getDepertmant());
 
     }
}
