package project.vpd.restapp13822.validation;

import project.vpd.restapp13822.action.ActionData;

public class DataValidator extends AbstractDataValidator{

	@Override
	public boolean validate() {
		/*String email = request.getUser().getEmail();
		String password = request.getUser().getPassword();
		String emailPattern =  "^[\\w!#$%&'*+/=?`{|}~^-]+(?:\\.[\\w!#$%&'*+/=?`{|}~^-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,6}";
		if(new LengthValidator().validateLenght(email) && new PatternValidator().validatePattern(emailPattern,email))
		*/return true;
		//return false;

	}

	@Override
	public DataValidationError getDataValidationError() {
		// TODO Auto-generated method stub
		return null;
	}

}
