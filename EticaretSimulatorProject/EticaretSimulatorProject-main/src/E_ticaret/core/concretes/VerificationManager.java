package E_ticaret.core.concretes;

import java.util.Scanner;

import E_ticaret.core.abstracts.VerificationService;

public class VerificationManager implements VerificationService {
	private final String code="check";
	
	public String getCode() {
		return code;
	}
	
	@Override
	public void verificationByCode() {
		// TODO Auto-generated method stub
		System.out.println(" Doðrulama Kodu : "+getCode());
		Scanner scanner =new Scanner(System.in);
		System.out.print("Lütfen Doðrulama Kodunu Giriniz : ");
		String checkCode=scanner.nextLine();
		if(code.equals(checkCode)) {
			System.out.println("Kod Doðrulandý...!");
		}
		else {
			System.out.println("Geçersiz Kod...!");
		}
		
	}
	

}
