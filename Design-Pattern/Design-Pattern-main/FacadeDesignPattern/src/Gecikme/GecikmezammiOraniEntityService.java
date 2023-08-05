package Gecikme;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class GecikmezammiOraniEntityService {
    public BigDecimal getGecikmeZammiOran() {
       BigDecimal oran=  new BigDecimal("1.6");
       oran =oran.divide(new BigDecimal("100"),4, RoundingMode.HALF_DOWN);

       return oran;
    }
}
