package project.vpd.java12feb2022.validation;

import java.util.regex.Pattern;

public class PatternValidator {

	public boolean validatePattern(String regex,String input) {
		
		return Pattern.compile(regex)
			      .matcher(input)
			      .matches();
	}

}
