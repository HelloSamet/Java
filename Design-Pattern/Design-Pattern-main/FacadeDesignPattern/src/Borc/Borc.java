package Borc;

import java.math.BigDecimal;
import java.util.Date;

public class Borc {
    private int id;
    private EnumBorcType borcType;
    private BigDecimal borcTutari;
    private Date vadeTarihi;

    public Borc(){}

    public Borc(int id, EnumBorcType borcType, BigDecimal borcTutari, Date vadeTarihi) {
        this.id = id;
        this.borcType = borcType;
        this.borcTutari = borcTutari;
        this.vadeTarihi = vadeTarihi;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public EnumBorcType getBorcType() {
        return borcType;
    }

    public void setBorcType(EnumBorcType borcType) {
        this.borcType = borcType;
    }

    public BigDecimal getBorcTutari() {
        return borcTutari;
    }

    public void setBorcTutari(BigDecimal borcTutari) {
        this.borcTutari = borcTutari;
    }

    public Date getVadeTarihi() {
        return vadeTarihi;
    }

    public void setVadeTarihi(Date vadeTarihi) {
        this.vadeTarihi = vadeTarihi;
    }
}
