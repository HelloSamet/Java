package Yapilandirma;

import Gecikme.DateUtil;

import java.util.Date;

public class YapilandirmaKontrolService {

    public boolean isYapilandirmaBozulmali(Date vadeTarihi){
        Date gununTarihi= DateUtil.getGununTarihi();
        long gunFarki=DateUtil.GunFarkiHesapla(vadeTarihi,gununTarihi);
        boolean isYapilandirmaBozulmali=gunFarki>50;
        if (isYapilandirmaBozulmali){
            System.out.println("Bilgi : Borcun Yapilandirilmasi Bozulmali, tahsil Edilemez.!");
        }
        return isYapilandirmaBozulmali;
    }
}
