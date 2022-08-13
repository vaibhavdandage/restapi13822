package project.vpd.java12feb2022.validation;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BusinessRulesValidatorContainer {

	List<AbstractBusinessRulesValidator> businessValidators = new ArrayList<AbstractBusinessRulesValidator>();
	
	public Map<String, List<String>> executeValidations() {
		Map<String,List<String>> businessError = new HashMap<String,List<String>>();
		if(businessValidators!=null){
			for(AbstractBusinessRulesValidator businessValidator:businessValidators){
				if(!businessValidator.validate()){
					if(null!=businessError.get(businessValidator.getFieldName())){
						businessError.get(businessValidator.getFieldName()).add(businessValidator.getBusinessRulesValidationError().errorDescription());
						
					}
					else{
						List<String>errorList = new ArrayList<String>();
						errorList.add(businessValidator.getBusinessRulesValidationError().errorDescription());
						businessError.put(businessValidator.getFieldName(), errorList);
					}
				}
			}
		}
		return null;
	}

	public List<AbstractBusinessRulesValidator> getBusinessValidators() {
		return businessValidators;
	}

	public void setBusinessValidators(List<AbstractBusinessRulesValidator> businessValidators) {
		this.businessValidators = businessValidators;
	}

}
