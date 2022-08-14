package project.vpd.restapp13822.validation;

public class LengthValidator {

	public boolean validateLenght(String email) {

		if(email.length()>8)
			return true;
		
		return false;
	}

}
