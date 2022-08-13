package project.vpd.java12feb2022.action;

import java.util.List;

import project.vpd.java12feb2022.service.RepoService;
import project.vpd.java12feb2022.validation.AbstractBusinessRulesValidator;
import project.vpd.java12feb2022.validation.AbstractDataValidator;

public class UserActions extends AbstractAction{

	@Override
	public ActionResponse performAction(ActionData request, RepoService service) {
		ActionResponse response = new ActionResponse();
		if(request.getAction()==AllowedActions.REGISTER_USER)
		{
			response.setObject(service.getUserRepository().save(request.getUser()));
			return response;
		}
		
		if(request.getAction()==AllowedActions.LOGIN_USER)
		{
			response.setObject(service.getUserRepository().findByEmail(request.getUser().getEmail()));
			return response;
		}
		
		if(request.getAction()==AllowedActions.USER_LOGOUT)
		{
			response.setObject(service.getUserRepository().findByEmail(request.getUser().getEmail()));
			return response;
		}
		
		
		return null;
	}

	@Override
	public List<AbstractDataValidator> getDataValidators(ActionData request) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<AbstractBusinessRulesValidator> getBusinessRulesValidators(ActionData request, RepoService service) {
		// TODO Auto-generated method stub
		return null;
	}

}
