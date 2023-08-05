package E_ticaret.business.concretes;


import java.util.regex.Pattern;

import E_ticaret.business.abstracts.UsersService;
import E_ticaret.dataAccess.abstracts.EntityDao;
import E_ticaret.entities.abstracts.Entity;




public class UsersManager implements UsersService {
	EntityDao entityDao;
	
	public UsersManager(EntityDao _entityDao) {
		// TODO Auto-generated constructor stub
		this.entityDao=_entityDao;
	}
	@Override
	public void add(Entity _entity) {
		// TODO Auto-generated method stub
		entityDao.add(_entity);
	}

	@Override
	public void delete(Entity _entity) {
		// TODO Auto-generated method stub
		entityDao.delete(_entity);
	}

	@Override
	public void update(Entity _entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean getByMail(String _mail) {
		// TODO Auto-generated method stub
		return entityDao.getByMail(_mail);
	}

	@Override
	public boolean checkIfEmail(String mail) {
		String email_pattern="^[A-Z0-9._%+-]+@[A-Z0-9.-]+.(com|org|net|edu|gov|mil|biz|info|mobi)(.[A-Z]{2})?$";
		Pattern pattern=Pattern.compile(email_pattern,Pattern.CASE_INSENSITIVE);
		if(!(pattern.matcher(mail).find())) {
			System.out.println("Geçerli Bir Mail Adresi Giriniz...!");
			return false;
		}
		else {
			
			return true;
		}
	}
	

}
