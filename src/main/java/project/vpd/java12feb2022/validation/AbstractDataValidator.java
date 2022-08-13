package project.vpd.java12feb2022.validation;

public abstract class AbstractDataValidator {

	private String fieldName;
	
	public abstract boolean validate();

	public abstract DataValidationError getDataValidationError();
	public String getFieldName() {
		return this.fieldName;
	}


}
