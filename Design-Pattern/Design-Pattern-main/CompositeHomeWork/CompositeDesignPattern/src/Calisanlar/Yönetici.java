package Calisanlar;

public class Yönetici implements ICalisanlar {
    private String name;
    private String depertmant;
    
    
    
    public Yönetici() {
    }

    public Yönetici(String name) {
        this.name = name;
        this.depertmant="Yönetici";
    }

    @Override
    public void Work() {
       System.out.println("Yönetiliyor.");
        
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
