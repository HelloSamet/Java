package E_ticaret.core.concretes;

import E_ticaret.core.abstracts.GoogleAccountService;
import E_ticaret.googleAccount.GoogleAccount;

public class GoogleAccountManager implements GoogleAccountService {

	@Override
	public void accountGoogle() {
		// TODO Auto-generated method stub
		GoogleAccount account=new GoogleAccount();
		account.Account();
	}

}
