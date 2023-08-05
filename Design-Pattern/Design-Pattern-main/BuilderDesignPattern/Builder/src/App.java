public class App {
    public static void main(String[] args) throws Exception {
      /*
        Home home=new Home();
       home.setIl("İstanbul");
       home.setIlce("BeylikDüzü");
       home.setMahalle("mahalle");
       home.setOdaSayisi(5);
       home.setBinaYili(2021);
       home.setHasHavuz(true);

       Home home2=new Home("Mersin","Tarsus","Kirklarsirti",2010,3, 2, 1, 2,false, true, true,false);
    
       Emlakci.printHome(home);
       Emlakci.printHome(home2);*/

       Home home =Homebuilder.StartNormalHomeBuilder("Istanbul", "Ümraniye", "TatliSu", 2008, 5)
       .setBanyoSayisi(2)
       .setDublex(true)
       .setTuvaletsayisi(2)
       .Build();

        Emlakci.printHome(home);

        Home home2=Homebuilder.StartHavuzluHomeBuilder("Mersin", "Tarsus", "Kirklarsirti", 2021, 5)
        .Build();

        Emlakci.printHome(home2);
    }
}
