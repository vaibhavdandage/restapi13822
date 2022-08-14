package project.vpd.restapp13822.action;

import java.util.List;

import project.vpd.restapp13822.model.Payment;
import project.vpd.restapp13822.service.RepoService;
import project.vpd.restapp13822.validation.AbstractBusinessRulesValidator;
import project.vpd.restapp13822.validation.AbstractDataValidator;

public class PaymentActions extends AbstractAction{

	@Override
	public ActionResponse performAction(ActionData request, RepoService service) {
		ActionResponse response = new ActionResponse();
		if(request.getAction()==AllowedActions.DO_PAYMENT)
		{
			response.setObject(service.getPaymentRepository().save(request.getPayment()));
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
