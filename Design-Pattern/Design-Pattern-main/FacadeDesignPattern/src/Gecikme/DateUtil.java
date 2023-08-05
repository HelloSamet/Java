package Gecikme;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtil {

    public static Date getGununTarihi() {
        SimpleDateFormat format=new SimpleDateFormat("dd.MM.yyyy");
        String dateStr= format.format(new Date());

        Date date= null;
        try {
            date = format.parse(dateStr);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        return  date;

    }

    public static long GunFarkiHesapla(Date ilkTarih,Date sonTarih){
        long gunKatSayisi=24*60*60*1000;

        long ilk=ilkTarih.getTime();
        long son=sonTarih.getTime();
        long gunFarki=(son/gunKatSayisi)-(ilk/gunKatSayisi);


        return gunFarki;
    }

    public static Long TarihinYili(Date date){
        String yilinStr=new SimpleDateFormat("yyyy").format(date);

        return Long.valueOf(yilinStr) ;
    }
    public static Long TarihinAyi(Date date){
        String ayinStr=new SimpleDateFormat("MM").format(date);

        return Long.valueOf(ayinStr) ;
    }

    public static Date TarihOlustur(String dateStr) {
        SimpleDateFormat format=new SimpleDateFormat("dd.MM.yyyy");
        Date date= null;
        try {
            date = format.parse(dateStr);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return date;
    }
}
