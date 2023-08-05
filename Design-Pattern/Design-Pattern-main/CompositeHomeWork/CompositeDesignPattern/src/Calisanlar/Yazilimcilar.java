package Calisanlar;

public class Yazilimcilar implements ICalisanlar {
    private String name;
    private String depertmant;

    
    

    public Yazilimcilar() {
    }

    public Yazilimcilar(String name) {
        this.name = name;
        this.depertmant="Yazilimci";
    }

    @Override
    public void Work() {
        System.out.println("Yazilim Tamamlaniyor.");
        
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
