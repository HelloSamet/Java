import java.util.Scanner;

import Settings.SettingsVariables;
import Settings.SettingsVariablesWorker;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner=new Scanner(System.in);
        SettingsVariables sv1= SettingsVariables.SettingsVariablesGetir();
        SettingsVariablesWorker settingsVariablesWorker=new SettingsVariablesWorker();
        System.out.println("------------------------Typs--------------------------");
        settingsVariablesWorker.SelectVariablesTypeOne();
        settingsVariablesWorker.ShowInformationsVariablesType(sv1);
        settingsVariablesWorker.SelectVariablesTypeTwo();
        settingsVariablesWorker.ShowInformationsVariablesType(sv1);
        settingsVariablesWorker.SelectVariablesTypeThree();
        settingsVariablesWorker.ShowInformationsVariablesType(sv1);
        System.out.print("Please enter a Type : ");
        int id=scanner.nextInt();
        settingsVariablesWorker.SelectMailWindowsType(id);
    }
}
