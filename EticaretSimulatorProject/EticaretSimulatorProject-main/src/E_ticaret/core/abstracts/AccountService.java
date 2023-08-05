package E_ticaret.core.abstracts;

import E_ticaret.entities.abstracts.Entity;

public interface AccountService {
	boolean register(Entity entity);
	boolean login(Entity entity);
}
