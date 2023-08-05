package E_ticaret.entities.concretes;

import E_ticaret.entities.abstracts.Entity;

public class Users extends Entity {
	
	private String userName;
	
	public Users() {
		
	}

	public Users(String userName) {
		super();
		this.userName = userName;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	
	
}
