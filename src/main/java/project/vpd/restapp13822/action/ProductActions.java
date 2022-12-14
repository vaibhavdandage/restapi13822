package project.vpd.restapp13822.action;


import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import project.vpd.restapp13822.model.Product;
import project.vpd.restapp13822.service.RepoService;
import project.vpd.restapp13822.validation.AbstractBusinessRulesValidator;
import project.vpd.restapp13822.validation.AbstractDataValidator;

public class ProductActions extends AbstractAction{

	@Override
	public ActionResponse performAction(ActionData request, RepoService service) {
		ActionResponse response = new ActionResponse();
		if(request.getAction()==AllowedActions.GET_PRODUCTS_ALL)
		{
			response.setObject(service.getProductRepository().findAll());
			return response;
		}
		
		if(request.getAction()==AllowedActions.GET_PRODUCT)
		{
			response.setObject(service.getProductRepository().findById(request.getProductId()));
			return response;
		}
		
		if(request.getAction()==AllowedActions.ADD_PRODUCT)
		{
			response.setObject(service.getProductRepository().save(request.getProduct()));
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
