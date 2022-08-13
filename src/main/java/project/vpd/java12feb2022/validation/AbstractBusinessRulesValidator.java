package project.vpd.java12feb2022.validation;

import project.vpd.java12feb2022.action.ActionData;
import project.vpd.java12feb2022.service.RepoService;

public abstract class AbstractBusinessRulesValidator {

	private String fieldName;
	protected RepoService repoService;
	protected ActionData actionData;
	
	public AbstractBusinessRulesValidator(String fieldName,RepoService repoService,ActionData actionData){
		this.fieldName = fieldName;
		this.repoService = repoService;
		this.actionData = actionData;
	}
	
	abstract public boolean validate();
	abstract public BusinessRulesValidationError getBusinessRulesValidationError();
	
	public String getFieldName(){
		return this.fieldName;
		
	}

}
