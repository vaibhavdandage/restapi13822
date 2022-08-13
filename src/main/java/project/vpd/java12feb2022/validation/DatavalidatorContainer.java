package project.vpd.java12feb2022.validation;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DatavalidatorContainer {

	List<AbstractDataValidator> dataValidators;
	public Map<String,List<String>> executeValidations(){
		Map<String,List<String>> fieldWiseErrors = new HashMap<String,List<String>>();
		
		if(dataValidators!=null){
			for(AbstractDataValidator dataValidator:dataValidators){
				if(!dataValidator.validate()){
					
				if(fieldWiseErrors.get(dataValidator.getFieldName())!=null){
					fieldWiseErrors.get(dataValidator.getFieldName()).add(dataValidator.getDataValidationError().errorDescription());
				}
				else{
					List<String> dataValidationErrors = new ArrayList<String>();
					dataValidationErrors.add(dataValidator.getDataValidationError().errorDescription());
					fieldWiseErrors.put(dataValidator.getFieldName(), dataValidationErrors);
				}
				}
			}
		}
		return fieldWiseErrors;
	}
	
	public void setDataValidators(){
		
	}

	public List<AbstractDataValidator> getDataValidators() {
		return dataValidators;
	}

	public void setDataValidators(List<AbstractDataValidator> dataValidators) {
		this.dataValidators = dataValidators;
	}
}
