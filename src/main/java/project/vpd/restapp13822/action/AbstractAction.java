package project.vpd.restapp13822.action;


import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.http.HttpStatus;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import project.vpd.restapp13822.exception.ApiError;
import project.vpd.restapp13822.exception.EmptyProductListException;
import project.vpd.restapp13822.exception.ErrorException;
import project.vpd.restapp13822.exception.InvalidBusinessDataException;
import project.vpd.restapp13822.exception.InvalidDataException;
import project.vpd.restapp13822.service.RepoService;
import project.vpd.restapp13822.validation.AbstractBusinessRulesValidator;
import project.vpd.restapp13822.validation.AbstractDataValidator;
import project.vpd.restapp13822.validation.BusinessRulesValidatorContainer;
import project.vpd.restapp13822.validation.DataValidator;
import project.vpd.restapp13822.validation.DatavalidatorContainer;

public abstract class AbstractAction {

	public abstract ActionResponse performAction(ActionData request, RepoService service);
	
	ObjectMapper mapper = new ObjectMapper();
	
	public String dataPreprocessing(ActionData request, RepoService service){
		
		ActionResponse response = new ActionResponse();
		
		String jsonResponse = "";
				
		try {
			
			
		DatavalidatorContainer dataValidatorContainer = new DatavalidatorContainer();
		List<AbstractDataValidator> dataValidators = this.getDataValidators(request);
		Map<String,List<String>> errors = dataValidatorContainer.executeValidations();
		
		
		if(null!=errors && errors.size()>0){
			ActionResult result = new ActionResult();
			result.setActionStatus(ActionStatus.DATA_VALIDATION_ERROR);
			result.setDataValidationFieldwiseError(errors);
			response.setObject(request.getAction());
			response.setResult(result);
		
		}

		else{
			BusinessRulesValidatorContainer businessValidatorContainer = new BusinessRulesValidatorContainer();
			List<AbstractBusinessRulesValidator> businessRulesValidators = this.getBusinessRulesValidators(request, service);
			businessValidatorContainer.setBusinessValidators(businessRulesValidators);
			Map<String,List<String>>bErrors = businessValidatorContainer.executeValidations();
			
			if(null!=bErrors && bErrors.size()>0){
				ActionResult result = new ActionResult();
				result.setActionStatus(ActionStatus.BUSINESS_RULES_VALIDATION_ERROR);
				result.setBusinessDataFieldwiseError(bErrors);
				response.setObject(request.getAction());
				response.setResult(result);
					
			}
			else{
			
				response= this.performAction(request, service);
				ActionResult actionResult = new ActionResult();
				actionResult.setActionStatus(ActionStatus.SUCCESS);
				response.setResult(actionResult);
			}
			
			
		}
		
		if(response.getResult().getActionStatus().equals(ActionStatus.SUCCESS)){
			jsonResponse = mapper.writeValueAsString(response);
		}
		else{
			jsonResponse = mapper.writeValueAsString(response);			
			System.out.println("Something went wrong, payload is - " + jsonResponse);
		}
		
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}
		
		return jsonResponse;
		
	}

	public abstract List<AbstractDataValidator> getDataValidators(ActionData request);
	
	public abstract List<AbstractBusinessRulesValidator> getBusinessRulesValidators(ActionData request, RepoService service);

}
