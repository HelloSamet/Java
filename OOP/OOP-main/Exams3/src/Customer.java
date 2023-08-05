public class Customer {
    private int id;
    private String name;
    private String surName;
    private int adressID;



    
    public Customer() {
    }

    public Customer(int id, String name, String surName, int adressID) {
        this.id = id;
        this.name = name;
        this.surName = surName;
        this.adressID = adressID;
    }
    
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getSurName() {
        return surName;
    }
    public void setSurName(String surName) {
        this.surName = surName;
    }
    public int getAdressID() {
        return adressID;
    }
    public void setAdressID(int adressID) {
        this.adressID = adressID;
    }

    @Override
    public String toString() {
        return "Customer [adressID=" + adressID + ", id=" + id + ", name=" + name + ", surName=" + surName + "]";
    }

    
}
