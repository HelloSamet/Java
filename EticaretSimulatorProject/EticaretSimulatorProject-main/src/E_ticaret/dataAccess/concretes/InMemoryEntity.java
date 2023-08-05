package E_ticaret.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import E_ticaret.dataAccess.abstracts.EntityDao;
import E_ticaret.entities.abstracts.Entity;

public class InMemoryEntity implements EntityDao {
	
	public ArrayList<Entity>entityDao=new ArrayList<Entity>();
	
	@Override
	public void add(Entity entity) {
		// TODO Auto-generated method stub
		entityDao.add(entity);
		System.out.println(entity.getFirstName()+" Eklendi.");
	}

	@Override
	public void update(Entity entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Entity entity) {
		// TODO Auto-generated method stub
		int remove=entityDao.indexOf(entity);
		entityDao.remove(remove);
		System.out.println(entity.getFirstName()+" Silindi.");
	}

	@Override
	public boolean getByMail(String mail) {
		// TODO Auto-generated method stub
		return entityDao.stream().anyMatch(u->u.getEmail().equals(mail));
	}
	
	
}
