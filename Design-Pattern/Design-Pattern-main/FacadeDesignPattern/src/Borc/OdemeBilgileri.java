package Borc;

public class OdemeBilgileri {
    private String kartUzerindekiIsim;
    private String kartNo;
    private Long sonKullanmaAy;
    private Long sonKullanmaYil;
    private Long cvvNo;

    public OdemeBilgileri(String kartUzerindekiIsim, String kartNo, Long sonKullanmaAy, Long sonKullanmaYil, Long cvvNo) {
        this.setKartUzerindekiIsim(kartUzerindekiIsim);
        this.setKartNo(kartNo);
        this.setSonKullanmaAy(sonKullanmaAy);
        this.setSonKullanmaYil(sonKullanmaYil);
        this.setCvvNo(cvvNo);
    }


    public String getKartUzerindekiIsim() {
        return kartUzerindekiIsim;
    }

    public void setKartUzerindekiIsim(String kartUzerindekiIsim) {
        this.kartUzerindekiIsim = kartUzerindekiIsim;
    }

    public String getKartNo() {
        return kartNo;
    }

    public void setKartNo(String kartNo) {
        this.kartNo = kartNo;
    }

    public Long getSonKullanmaAy() {
        return sonKullanmaAy;
    }

    public void setSonKullanmaAy(Long sonKullanmaAy) {
        this.sonKullanmaAy = sonKullanmaAy;
    }

    public Long getSonKullanmaYil() {
        return sonKullanmaYil;
    }

    public void setSonKullanmaYil(Long sonKullanmaYil) {
        this.sonKullanmaYil = sonKullanmaYil;
    }

    public Long getCvvNo() {
        return cvvNo;
    }

    public void setCvvNo(Long cvvNo) {
        this.cvvNo = cvvNo;
    }
}
