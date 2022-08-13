package project.vpd.java12feb2022.service;

import java.util.LinkedList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import project.vpd.java12feb2022.action.ActionData;
import project.vpd.java12feb2022.action.AllowedActions;
import project.vpd.java12feb2022.model.Product;
import project.vpd.java12feb2022.model.User;
import project.vpd.java12feb2022.repository.CartRepository;
import project.vpd.java12feb2022.repository.EmailRepository;
//import project.vpd.java12feb2022.repository.MessageRepository;
import project.vpd.java12feb2022.repository.PaymentRepository;
import project.vpd.java12feb2022.repository.ProductRepository;
import project.vpd.java12feb2022.repository.UserRepository;

@Service
@Transactional
public class RepoService {
	@Autowired
	private ProductRepository productRepository;
	@Autowired
	private UserRepository userRepository;
	@Autowired
	private CartRepository cartRepository;
	@Autowired
	private EmailRepository emailRepository;
	@Autowired 
	private PaymentRepository paymentRepository;
	
	public ProductRepository getProductRepository() {
		return productRepository;
	}
	public void setProductRepository(ProductRepository productRepository) {
		this.productRepository = productRepository;
	}
	public UserRepository getUserRepository() {
		return userRepository;
	}
	public void setUserRepository(UserRepository userRepository) {
		this.userRepository = userRepository;
	}
	public CartRepository getCartRepository() {
		return cartRepository;
	}
	public void setCartRepository(CartRepository cartRepository) {
		this.cartRepository = cartRepository;
	}
	public EmailRepository getEmailRepository() {
		return emailRepository;
	}
	public void setEmailRepository(EmailRepository emailRepository) {
		this.emailRepository = emailRepository;
	}
	public PaymentRepository getPaymentRepository() {
		return paymentRepository;
	}
	public void setPaymentRepository(PaymentRepository paymentRepository) {
		this.paymentRepository = paymentRepository;
	}
	
	
		
	}	

