package Settings;
public class SettingsVariables {
    private static SettingsVariables settingsVariables;
    private static Object lock = new Object();

    private String  mailBoxLocation;
    private String headerLocation;
    private String mailContentsLocation;
    private String mailBoxSize;
    private String headerSize;
    private String mailContentsSize;


    public static SettingsVariables SettingsVariablesGetir() {

        synchronized (lock) {
            if (settingsVariables == null) {
                settingsVariables = new SettingsVariables();
            }
        }

        return settingsVariables;
    }

    public String getMailBoxLocation() {
        return mailBoxLocation;
    }
    public void setMailBoxLocation(String mailBoxLocation) {
        this.mailBoxLocation = mailBoxLocation;
    }
    public String getHeaderLocation() {
        return headerLocation;
    }
    public void setHeaderLocation(String headerLocation) {
        this.headerLocation = headerLocation;
    }
    public String getMailContentsLocation() {
        return mailContentsLocation;
    }
    public void setMailContentsLocation(String mailContentsLocation) {
        this.mailContentsLocation = mailContentsLocation;
    }
    public String getMailBoxSize() {
        return mailBoxSize;
    }
    public void setMailBoxSize(String mailBoxSize) {
        this.mailBoxSize = mailBoxSize;
    }
    public String getHeaderSize() {
        return headerSize;
    }
    public void setHeaderSize(String headerSize) {
        this.headerSize = headerSize;
    }
    public String getMailContentsSize() {
        return mailContentsSize;
    }
    public void setMailContentsSize(String mailContentsSize) {
        this.mailContentsSize = mailContentsSize;
    } 
}
