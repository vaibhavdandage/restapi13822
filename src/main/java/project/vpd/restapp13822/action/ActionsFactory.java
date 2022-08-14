package project.vpd.restapp13822.action;

import java.util.HashMap;

import project.vpd.restapp13822.action.AbstractAction;
import project.vpd.restapp13822.action.AllowedActions;

public class ActionsFactory extends HashMap<AllowedActions, AbstractAction>{

	private static final long serialVersionUID = 2661435909994562647L;

	public ActionsFactory(){
		super.put(AllowedActions.REGISTER_USER, new UserActions());
		super.put(AllowedActions.LOGIN_USER, new UserActions());
		super.put(AllowedActions.USER_LOGOUT, new UserActions());
		super.put(AllowedActions.ADD_PRODUCT, new ProductActions());
		super.put(AllowedActions.GET_PRODUCTS_ALL, new ProductActions());
		super.put(AllowedActions.GET_PRODUCT, new ProductActions());
		super.put(AllowedActions.ADD_TO_CART, new CartActions());
		super.put(AllowedActions.GET_CART, new CartActions());
		super.put(AllowedActions.DELETE_FROM_CART, new CartActions());
		super.put(AllowedActions.DO_PAYMENT, new PaymentActions());
		super.put(AllowedActions.SEND_EMAIL, new MessageActions());
	}

}
