package adapterpattern;

import org.apache.commons.validator.routines.EmailValidator;

public class EmailValidatorAdapter implements Target {

	EmailValidator emailVal;

	public EmailValidatorAdapter(EmailValidator emailVal) {

		this.emailVal = emailVal;

	}

	@Override
	public boolean isEmail(String email) {

		if (emailVal.isValid(email)) {

			return true;

		}

		return false;

	}

}
