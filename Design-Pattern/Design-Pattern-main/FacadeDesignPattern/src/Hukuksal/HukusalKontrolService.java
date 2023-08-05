package Hukuksal;

import java.util.List;

public class HukusalKontrolService {

    private HukuksalSurecEntityService hukuksalSurecEntityService;

    public HukusalKontrolService() {
        this.hukuksalSurecEntityService=new HukuksalSurecEntityService();
    }

    public boolean IsHukuksalIslemde(long borcId){
       List<Long> hukuksalIslemdekiBorcList= hukuksalSurecEntityService.findAllHukuksalIslem();
       boolean isHukuksalIslemde=hukuksalIslemdekiBorcList.contains(borcId);
       if (isHukuksalIslemde){
           System.out.println("Borc Hukuksal İslemde, Tahisl Edilemez.!");
       }

       return isHukuksalIslemde;
    }
}
