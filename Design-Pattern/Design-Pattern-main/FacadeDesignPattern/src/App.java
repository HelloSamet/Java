import Borc.*;
import Gecikme.DateUtil;

import java.math.BigDecimal;
import java.util.Date;

public class App {
    public static void main(String[] args) {
        TahsilatFacade tahsilatFacade=new TahsilatFacade();
        Date vadeTarihi= DateUtil.TarihOlustur("01.01.2021");
        Borc borc=new Borc(10,EnumBorcType.NORMAL,new BigDecimal(10),vadeTarihi);

        OdemeBilgileri odemeBilgileri=new OdemeBilgileri("Bahadir Gul","12345654213",01L,2022L,654L);

        boolean isSuccess=tahsilatFacade.TahsilatYap(borc,odemeBilgileri);

        if (isSuccess){
            System.out.println("Tahsilat Yapildi.");
        }else{
            System.out.println("Tahsilat Yapilamadi.");
        }

    }
}
