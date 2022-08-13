package project.vpd.java12feb2022.action;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import project.vpd.java12feb2022.model.Cart;
import project.vpd.java12feb2022.service.RepoService;
import project.vpd.java12feb2022.validation.AbstractBusinessRulesValidator;
import project.vpd.java12feb2022.validation.AbstractDataValidator;

public class CartActions extends AbstractAction{

	@Override
	public ActionResponse performAction(ActionData request, RepoService service) {
		ActionResponse response = new ActionResponse();
		if(request.getAction()==AllowedActions.ADD_TO_CART)
		{
			Cart cart = new Cart();
			cart.setProductId(request.getProductId());
			cart.setUserId(request.getUserId());
			response.setObject(service.getCartRepository().save(cart));
			return response;
		}
		
		if(request.getAction()==AllowedActions.DELETE_FROM_CART)
		{
			service.getCartRepository().deleteById(request.getUserId());
		}
		
		if(request.getAction()==AllowedActions.GET_CART)
		{
			response.setObject(service.getCartRepository().findById(request.getUserId()));
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
