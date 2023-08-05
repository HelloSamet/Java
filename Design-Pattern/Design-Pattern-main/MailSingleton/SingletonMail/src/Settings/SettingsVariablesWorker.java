package Settings;

public class SettingsVariablesWorker implements ISettingsVariables {
    SettingsVariables sv1= SettingsVariables.SettingsVariablesGetir();
    @Override
    public void SelectMailWindowsType(int _id) {
        if (_id >= 1 && _id <= 3) {
            switch (_id) {
            case 1:
                SelectVariablesTypeOne();
                ShowInformationsVariablesType(sv1);
                break;
            case 2:
                SelectVariablesTypeTwo();
                ShowInformationsVariablesType(sv1);
                break;
            case 3:
                SelectVariablesTypeThree();
                ShowInformationsVariablesType(sv1);
                break;
            default:
                SelectVariablesTypeThree();
                ShowInformationsVariablesType(sv1);
                break;
            }
        } else
            System.out.println("Please Enter a valid preference !");

    }

    public void ShowInformationsVariablesType(SettingsVariables settingsVariables) {
        System.out.println("Mail Box Location :   " + settingsVariables.getMailBoxLocation() + "   Mail Box Size : "
                + settingsVariables.getMailBoxSize() + "\nHeader Location : " + settingsVariables.getHeaderLocation()
                + "   Header Size : " + settingsVariables.getHeaderSize() + "\nMail Contents Location : "
                + settingsVariables.getMailContentsLocation() + "    Mail Contents Size : "
                + settingsVariables.getMailContentsSize());
    }

    public SettingsVariables SelectVariablesTypeOne() {
        System.out.println("----------------------Type One --------------------");
        sv1.setMailBoxLocation("Sol");
        sv1.setMailBoxSize("300");
        sv1.setHeaderLocation("Sag_Ust");
        sv1.setHeaderSize("300");
        sv1.setMailContentsLocation("Sag_Alt");
        sv1.setMailContentsSize("600");
        return this.sv1;
    }

    public SettingsVariables SelectVariablesTypeTwo() {
        System.out.println("----------------------Type Two --------------------");
        sv1.setMailBoxLocation("Sol");
        sv1.setMailBoxSize("200");
        sv1.setHeaderLocation("Orta");
        sv1.setHeaderSize("600");
        sv1.setMailContentsLocation("Sag");
        sv1.setMailContentsSize("900");
        return this.sv1;
    }

    public SettingsVariables SelectVariablesTypeThree() {
        System.out.println("----------------------Type Three --------------------");
        sv1.setMailBoxLocation("Sol_Ust");
        sv1.setMailBoxSize("200");
        sv1.setHeaderLocation("Sag_Ust");
        sv1.setHeaderSize("600");
        sv1.setMailContentsLocation("Alt");
        sv1.setMailContentsSize("900");
        return this.sv1;
    }
}
