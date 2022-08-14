package project.vpd.restapp13822.action;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ActionResult {
	
	private Map<String,List<String>> dataValidationFieldwiseError;
	private Map<String,List<String>> businessDataFieldwiseError;
	private ActionStatus actionStatus;
	private List<String> performActionErrors = new ArrayList<String>();
	
	
	public Map<String, List<String>> getDataValidationFieldwiseError() {
		return dataValidationFieldwiseError;
	}
	public void setDataValidationFieldwiseError(Map<String, List<String>> dataValidationFieldwiseError) {
		this.dataValidationFieldwiseError = dataValidationFieldwiseError;
	}
	public Map<String, List<String>> getBusinessDataFieldwiseError() {
		return businessDataFieldwiseError;
	}
	public void setBusinessDataFieldwiseError(Map<String, List<String>> businessDataFieldwiseError) {
		this.businessDataFieldwiseError = businessDataFieldwiseError;
	}
	public ActionStatus getActionStatus() {
		return actionStatus;
	}
	public void setActionStatus(ActionStatus actionStatus) {
		this.actionStatus = actionStatus;
	}
	public List<String> getPerformActionErrors() {
		return performActionErrors;
	}
	public void setPerformActionErrors(List<String> performActionErrors) {
		this.performActionErrors = performActionErrors;
	}
	

}
