public class App {
    public static void main(String[] args) throws Exception {
       Müzik muzik=new Müzik();
       muzik.setName("Sezen Aksu - Gülümse");
       muzik.setVoice("Gülümse Hadi gülümse");

       Computer computer=new Computer();
       computer.PlaySing(muzik);
    }
}
