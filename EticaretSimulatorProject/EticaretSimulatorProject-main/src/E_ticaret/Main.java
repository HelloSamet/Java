package E_ticaret;

import E_ticaret.business.concretes.UsersManager;
import E_ticaret.core.concretes.AccountManager;
import E_ticaret.core.concretes.GoogleAccountManager;
import E_ticaret.core.concretes.VerificationManager;
import E_ticaret.dataAccess.concretes.InMemoryEntity;
import E_ticaret.entities.abstracts.Entity;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Entity user1=new Entity("Samet","Göçmen","gm_samet11@hotmail.com","1112223");
		
		Entity user2=new Entity("Emirhan","Doðandemir","gm_samet22@hotmail.com","1112224");
		
		Entity user3=new Entity("Ömer Faruk","Duran","gm_samet33@hotmail.com","1112225");
		
		AccountManager accountManager=new AccountManager(new UsersManager(new InMemoryEntity())
				, new VerificationManager(),
				new GoogleAccountManager());
		accountManager.register(user1);
		System.out.println("-----------------------------------------------------------------");
		accountManager.register(user2);
		System.out.println("-----------------------------------------------------------------");
		accountManager.register(user3);
		System.out.println("-----------------------------------------------------------------");
		
		
		accountManager.login(user3);
		System.out.println("-----------------------------------------------------------------");
		accountManager.login(user2);
		System.out.println("-----------------------------------------------------------------");
		accountManager.login(user1);
		System.out.println("-----------------------------------------------------------------");
		
	}

}
