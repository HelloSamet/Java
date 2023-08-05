public class Home {
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


    public Home() {
    }


    public Home(String il, String ilce, String mahalle, int binaYili, int odaSayisi, int balkonSayisi, int banyoSayisi,
            int tuvaletsayisi, boolean isDublex, boolean isEsyali, boolean hasOtopark, boolean hasHavuz) {
        this.il = il;
        this.ilce = ilce;
        this.mahalle = mahalle;
        this.binaYili = binaYili;
        this.odaSayisi = odaSayisi;
        this.balkonSayisi = balkonSayisi;
        this.banyoSayisi = banyoSayisi;
        this.tuvaletsayisi = tuvaletsayisi;
        this.isDublex = isDublex;
        this.isEsyali = isEsyali;
        this.hasOtopark = hasOtopark;
        this.hasHavuz = hasHavuz;
    }

    


    @Override
    public String toString() {
        return "Home [balkonSayisi=" + balkonSayisi + ", banyoSayisi=" + banyoSayisi + ", binaYili=" + binaYili
                + ", hasHavuz=" + hasHavuz + ", hasOtopark=" + hasOtopark + ", il=" + il + ", ilce=" + ilce
                + ", isDublex=" + isDublex + ", isEsyali=" + isEsyali + ", mahalle=" + mahalle + ", odaSayisi="
                + odaSayisi + ", tuvaletsayisi=" + tuvaletsayisi + "]";
    }


    public String getIl() {
        return il;
    }


    public void setIl(String il) {
        this.il = il;
    }


    public String getIlce() {
        return ilce;
    }


    public void setIlce(String ilce) {
        this.ilce = ilce;
    }


    public String getMahalle() {
        return mahalle;
    }


    public void setMahalle(String mahalle) {
        this.mahalle = mahalle;
    }


    public int getBinaYili() {
        return binaYili;
    }


    public void setBinaYili(int binaYili) {
        this.binaYili = binaYili;
    }


    public int getOdaSayisi() {
        return odaSayisi;
    }


    public void setOdaSayisi(int odaSayisi) {
        this.odaSayisi = odaSayisi;
    }


    public int getBalkonSayisi() {
        return balkonSayisi;
    }


    public void setBalkonSayisi(int balkonSayisi) {
        this.balkonSayisi = balkonSayisi;
    }


    public int getBanyoSayisi() {
        return banyoSayisi;
    }


    public void setBanyoSayisi(int banyoSayisi) {
        this.banyoSayisi = banyoSayisi;
    }


    public int getTuvaletsayisi() {
        return tuvaletsayisi;
    }


    public void setTuvaletsayisi(int tuvaletsayisi) {
        this.tuvaletsayisi = tuvaletsayisi;
    }


    public boolean isDublex() {
        return isDublex;
    }


    public void setDublex(boolean isDublex) {
        this.isDublex = isDublex;
    }


    public boolean isEsyali() {
        return isEsyali;
    }


    public void setEsyali(boolean isEsyali) {
        this.isEsyali = isEsyali;
    }


    public boolean isHasOtopark() {
        return hasOtopark;
    }


    public void setHasOtopark(boolean hasOtopark) {
        this.hasOtopark = hasOtopark;
    }


    public boolean isHasHavuz() {
        return hasHavuz;
    }


    public void setHasHavuz(boolean hasHavuz) {
        this.hasHavuz = hasHavuz;
    }


    

    

    
}
