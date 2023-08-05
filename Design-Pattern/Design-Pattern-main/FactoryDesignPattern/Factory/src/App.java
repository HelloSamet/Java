public class App {
    public static void main(String[] args) throws Exception {
      Telefon s8=TelefonFactory.getTelefon("S8", "10000", 15, 25);
      Telefon note8=TelefonFactory.getTelefon("Note8", "10500", 25, 25);
    
      System.out.println("S8 Telefon özellikleri :");
      System.out.println(s8);
      System.out.println("Nte8 Telefon özellikleri :");
      System.out.println(note8);
    
      
      
    }
}
