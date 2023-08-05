package Tahsilat;

import Borc.*;

import Hukuksal.HukusalKontrolService;
import Yapilandirma.YapilandirmaKontrolService;

public class TahsilatKontrolService {
    private YapilandirmaKontrolService yapilandirmaKontrolService;
    private HukusalKontrolService hukusalKontrolService;

    public TahsilatKontrolService() {
        this.hukusalKontrolService=new HukusalKontrolService();
        this.yapilandirmaKontrolService=new YapilandirmaKontrolService();
    }

    public boolean isTahsilataUygun(Borc borc)
    {
        boolean yapilandirmaBozulmali=false;
        if (EnumBorcType.YAPILANDIRMA.equals(borc))
        {
            yapilandirmaBozulmali= yapilandirmaKontrolService.isYapilandirmaBozulmali(borc.getVadeTarihi());
        }
        boolean hukuksalIslemde= hukusalKontrolService.IsHukuksalIslemde(borc.getId());
        boolean isBorcTahsilataUygun=!(yapilandirmaBozulmali || hukuksalIslemde);

        return isBorcTahsilataUygun;

    }
}
