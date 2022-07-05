package adapterpattern;

import java.util.Scanner;

import javax.mail.internet.InternetAddress;
import org.apache.commons.validator.routines.EmailValidator;

public class Client{
	
	public static void main(String[] args) {
		
		InternetAddressAdapter emailValidation = new InternetAddressAdapter(new InternetAddress());
		EmailValidatorAdapter emailValidation2 = new EmailValidatorAdapter(EmailValidator.getInstance());
		
		System.out.println(emailValidation.isEmail("emailteste1234@gmail.com"));
		System.out.println(emailValidation2.isEmail("emailteste1234@gmail.com"));
			
		
		
	}


}
