package E_ticaret.core.concretes;


import E_ticaret.business.abstracts.UsersService;
import E_ticaret.business.concretes.UsersManager;
import E_ticaret.core.abstracts.AccountService;
import E_ticaret.core.abstracts.GoogleAccountService;
import E_ticaret.core.abstracts.VerificationService;
import E_ticaret.entities.abstracts.Entity;

public class AccountManager implements AccountService {

	private UsersService userService;
	private VerificationService verificationService;
	private GoogleAccountService googleService;
	
	public AccountManager(UsersManager usersManager, VerificationService verificationService,
			GoogleAccountService googleService) {
		super();
		this.userService = usersManager;
		this.verificationService = verificationService;
		this.googleService = googleService;
	}

	@Override
	public boolean register(Entity entity) {
		if((CheckIfPassword(entity))
				&&(CheckIfFullName(entity)
						&&(checkIfUserExist(entity.getEmail())
								&&(userService.checkIfEmail(entity.getEmail()))))) {
			verificationService.verificationByCode();
			System.out.println("Kayıt Başarılı Bir Şekilde Gerçekleşti : "+entity.getFirstName());
			userService.add(entity);
			
		}
		return false;
		
	}

	@Override
	public boolean login(Entity entity) {
		boolean getEmail=userService.getByMail(entity.getEmail());
		if(getEmail) {
			System.out.println("Giriş Başarılı : " + entity.getFirstName());
			return true;
		}
		else {
			System.out.println("Böyle bir Kullanici Bulunamadı...!");
		return false;
		}
	}
	
	
	
	private boolean CheckIfFullName(Entity user) {
		if(user.getFirstName().length()>=2 &&user.getLastName().length()>=2) {
			return true;
		}else {
			System.out.println("Ad ve soyad en az 2 karakterden oluþmalýdýr.");
			return false;
		}
	}
	
	
	private boolean CheckIfPassword(Entity user) {
		if(user.getPassword().length()>=6) {
			return true;
		}
		else {
			System.out.println("Parola en az 6 karakterden oluþmalýdýr.");
			return false;
			
		}
	
	}
	private boolean checkIfUserExist(String email) {
		if(userService.getByMail(email)) {
			System.out.println("Bu Email adresi zaten kullanýlýyor");
			return false;
		}else {
			return true;
		}
	}

}
