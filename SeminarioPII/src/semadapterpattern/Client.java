package semadapterpattern;

import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import org.apache.commons.validator.routines.EmailValidator;

public class Client {

	public static void main(String[] args) {

		boolean resposta1;
		boolean resposta2;
		
		try {

			InternetAddress emailAddr = new InternetAddress("testandoemail1234@gmail.com");
			emailAddr.validate();
			resposta1 = true;

		} catch (AddressException e1) {

			resposta1 = false;
			e1.getMessage();

		}
		
		EmailValidator emailVal = EmailValidator.getInstance();
		resposta2 = emailVal.isValid("testandoemail1234@gmail.com");

		System.out.println(resposta1);
		System.out.print(resposta2);
		
	}

}
