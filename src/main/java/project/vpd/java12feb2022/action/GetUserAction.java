package project.vpd.java12feb2022.action;

import java.util.List;

import project.vpd.java12feb2022.service.RepoService;
import project.vpd.java12feb2022.validation.AbstractBusinessRulesValidator;
import project.vpd.java12feb2022.validation.AbstractDataValidator;

public class GetUserAction extends AbstractAction{

	@Override
	public ActionResponse performAction(ActionData request, RepoService service) {
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
