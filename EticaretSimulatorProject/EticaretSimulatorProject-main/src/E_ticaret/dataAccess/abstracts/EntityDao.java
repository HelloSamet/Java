package E_ticaret.dataAccess.abstracts;

import E_ticaret.entities.abstracts.Entity;

public interface EntityDao {
	void add(Entity entity);
	
	void update(Entity entity);
	
	void delete(Entity entity);
	
	boolean getByMail(String mail);
}
