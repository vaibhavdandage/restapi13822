package project.vpd.restapp13822.validation;

public enum DataValidationError {
	INVALID_EMAIL("Invalid email address.", true), INVALID_PHONE_NUMBER("Invalid phone number.", true),
	INVALID_LENGTH("Invalid length of the field", false),
	INEQUAL_PASSWORD("Password & repeated password are not equal.", false),
	INTEGER_OUT_OF_RANGE("Integer value out of range.", false),
	PATTERN_NOT_MATCHED("Value of field is not as per allowed pattern.", false),
	USERNAME_VALID("Username should be mobile number or email id.", false),
	FIELD_VALUE_NOT_ALLOWED("Field value is not in whitelist.", false);
	private final Object[] values;

	DataValidationError(Object... vals) {
		this.values = vals;
	}

	public String errorDescription() {
		return (String) values[0];
	}

	public boolean sendBackToUser() {
		return  (Boolean) values[1];
	}
}
