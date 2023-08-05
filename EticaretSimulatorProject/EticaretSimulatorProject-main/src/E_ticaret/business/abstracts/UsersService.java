package E_ticaret.business.abstracts;

import E_ticaret.entities.abstracts.Entity;

public interface UsersService {
	void add(Entity entity);
	void delete(Entity entity);
	void update(Entity entity);
	boolean getByMail(String mail);
	boolean checkIfEmail(String mail);
}
