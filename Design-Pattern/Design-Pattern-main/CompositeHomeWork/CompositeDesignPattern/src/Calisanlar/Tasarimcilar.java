package Calisanlar;

public class Tasarimcilar implements ICalisanlar {

    private String depertmant;
    private String name;

    

    public Tasarimcilar() {
    }


    public Tasarimcilar(String name) {
        this.name = name;
        this.depertmant="Tasarimci";
    }


    @Override
    public void Work() {
        System.out.println("Tasarim Yapiliyor.");
        
    }

    
    @Override
    public String getDepertmant() {
        return depertmant;
    }


    @Override
    public String getName() {
        return name;
    }
    
}
