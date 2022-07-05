package adapterpattern;

import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;

public class InternetAddressAdapter implements Target {
	
	private InternetAddress emailAddr;
	
	public InternetAddressAdapter(InternetAddress email) {
		
		this.emailAddr = email;
		
	}
	
	@Override
	public boolean isEmail(String email) {

		boolean result = true;
		try {
			emailAddr.setAddress(email);
			emailAddr.validate();
		} catch (AddressException ex) {
			result = false;
		}
		return result;
	}

}
