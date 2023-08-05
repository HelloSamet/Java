public class Homebuilder {
    private String il;
    private String ilce;
    private String mahalle;
    private int binaYili;
    private int odaSayisi;
    private int balkonSayisi;
    private int banyoSayisi;
    private int tuvaletsayisi;

    private boolean isDublex;
    private boolean isEsyali;
    private boolean hasOtopark;
    private boolean hasHavuz;

    // Zorunluluk
    public static Homebuilder StartNormalHomeBuilder(String il,String ilce,String mahalle,int binaYili,int odaSayisi) {
        Homebuilder homebuilder=new Homebuilder();
        homebuilder.il=il;
        homebuilder.ilce=ilce;
        homebuilder.mahalle=mahalle;
        homebuilder.binaYili=binaYili;
        homebuilder.odaSayisi=odaSayisi;

        return homebuilder;
    }

    //Opsiyonel...
    public static Homebuilder StartHavuzluHomeBuilder(String il,String ilce,String mahalle,int binaYili,int odaSayisi) {
        Homebuilder havuzlHomebuilder=new Homebuilder();
        havuzlHomebuilder.il=il;
        havuzlHomebuilder.ilce=ilce;
        havuzlHomebuilder.mahalle=mahalle;
        havuzlHomebuilder.binaYili=binaYili;
        havuzlHomebuilder.odaSayisi=odaSayisi;
        havuzlHomebuilder.hasHavuz=true;

        return havuzlHomebuilder;
    }

    public Home Build() {
        Home home = new Home();
        home.setIl(il);
        home.setIlce(ilce);
       home.setMahalle(mahalle);
       home.setBinaYili(binaYili);
       home.setOdaSayisi(odaSayisi);
       home.setBalkonSayisi(balkonSayisi);
       home.setBanyoSayisi(banyoSayisi);
       home.setTuvaletsayisi(tuvaletsayisi);
       home.setDublex(isDublex);
       home.setEsyali(isEsyali);
       home.setHasOtopark(hasOtopark);
       home.setHasHavuz(hasHavuz);
       
       return home;
    }

    public Homebuilder setBalkonSayisi(int balkonSayisi) {
        this.balkonSayisi = balkonSayisi;
        return this;
    }

    public Homebuilder setBanyoSayisi(int banyoSayisi) {
        this.banyoSayisi = banyoSayisi;
        return this;
    }

    public Homebuilder setTuvaletsayisi(int tuvaletsayisi) {
        this.tuvaletsayisi = tuvaletsayisi;
        return this;
    }

    public Homebuilder setDublex(boolean isDublex) {
        this.isDublex = isDublex;
        return this;
    }

    public Homebuilder setEsyali(boolean isEsyali) {
        this.isEsyali = isEsyali;
        return this;
    }

    public Homebuilder setHasOtopark(boolean hasOtopark) {
        this.hasOtopark = hasOtopark;
        return this;
    }

    public Homebuilder setHasHavuz(boolean hasHavuz) {
        this.hasHavuz = hasHavuz;
        return this;
    }

}
