package project.vpd.restapp13822.action;


import org.springframework.beans.factory.annotation.Autowired;

import project.vpd.restapp13822.action.AbstractAction;
import project.vpd.restapp13822.model.Email;
import project.vpd.restapp13822.model.Payment;
import project.vpd.restapp13822.model.Product;
import project.vpd.restapp13822.model.User;
import project.vpd.restapp13822.service.RepoService;

public class ActionData {

	private AllowedActions action;
	private RepoService repoService;
	private Product product;
	private User user;
	private int userId;
	private int productId;
	private Payment payment;
	private Email email;
	
	public String executeAction() {
		ActionsFactory factory = new ActionsFactory();
		AbstractAction action = factory.get(this.action);
		return action.dataPreprocessing(this,repoService);
	}

	public AllowedActions getAction() {
		return action;
	}

	public void setAction(AllowedActions action) {
		this.action = action;
	}

	public RepoService getRepoService() {
		return repoService;
	}

	public void setRepoService(RepoService repoService) {
		this.repoService = repoService;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public void setUser(User user) {
		this.user=user;
	}
	
    public User getUser() {
		return user;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public Payment getPayment() {
		return payment;
	}

	public void setPayment(Payment payment) {
		this.payment = payment;
	}

	public Email getEmail() {
		return email;
	}

	public void setEmail(Email email) {
		this.email = email;
	}



}
