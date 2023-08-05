import java.math.BigDecimal;

public class Urun implements IFiyatlanabilir {
    private String name;
    private BigDecimal price;
    
    public Urun() {
    }

    public Urun(String name, BigDecimal price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public BigDecimal getFiyat() {
        return this.price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }


    
    
}
