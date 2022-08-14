package project.vpd.restapp13822.validation;

import project.vpd.restapp13822.action.ActionData;
import project.vpd.restapp13822.service.RepoService;

public class EmailUniqueness extends AbstractBusinessRulesValidator{

	public EmailUniqueness(String fieldName, RepoService repoService, ActionData actionData) {
		super(fieldName, repoService, actionData);
	}

	@Override
	public boolean validate() {
		String email = actionData.getUser().getEmail();
		return email.equals(repoService.getUserRepository().getById(email));
	}

	@Override
	public BusinessRulesValidationError getBusinessRulesValidationError() {
		return BusinessRulesValidationError.EMAIL_ADDRESS_ALREADY_USED;
	}

}
