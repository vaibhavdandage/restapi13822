package project.vpd.restapp13822;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;

import java.util.LinkedList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import project.vpd.restapp13822.action.ActionData;
import project.vpd.restapp13822.action.ActionResponse;
import project.vpd.restapp13822.action.AllowedActions;
import project.vpd.restapp13822.model.Email;
import project.vpd.restapp13822.model.Payment;
import project.vpd.restapp13822.model.Product;
import project.vpd.restapp13822.model.User;
import project.vpd.restapp13822.service.RepoService;


@SpringBootApplication
@RestController
@CrossOrigin(origins="*")
public class Java12feb2022Application{

	@Autowired
	private RepoService repoService;
	
	
	@PostMapping("/register")
	ResponseEntity<String> registerUser(@RequestBody User user){
		ActionData data = new ActionData();
		data.setAction(AllowedActions.REGISTER_USER);
		data.setRepoService(repoService);
		data.setUser(user);
		String response = data.executeAction();
		return new ResponseEntity(response, HttpStatus.OK);		
	}
	
	@PostMapping("/login")
	ResponseEntity<String> loginUser(@RequestBody User user){
		ActionData data = new ActionData();
		data.setAction(AllowedActions.LOGIN_USER);
		data.setRepoService(repoService);
		data.setUser(user);
		String response = data.executeAction();
		return new ResponseEntity(response, HttpStatus.OK);		
	}
	
	@GetMapping("/products")
	ResponseEntity<String> getProducts(){
		ActionData data = new ActionData();
		data.setAction(AllowedActions.GET_PRODUCTS_ALL);
		data.setRepoService(repoService);
		String response = data.executeAction();
		return new ResponseEntity(response, HttpStatus.OK);	
	}
	
	@GetMapping("/products/{productId}")
	ResponseEntity<String> getProduct(@PathVariable int productId){
		ActionData data = new ActionData();
		data.setAction(AllowedActions.GET_PRODUCT);
		data.setRepoService(repoService);
		data.setProductId(productId);
		String response = data.executeAction();
		return new ResponseEntity(response, HttpStatus.OK);	
	}
	
	@PostMapping("/addproduct")
	ResponseEntity<String> addProduct(@RequestBody Product product){
		ActionData data = new ActionData();
		data.setAction(AllowedActions.ADD_PRODUCT);
		data.setRepoService(repoService);
		data.setProduct(product);
		String response = data.executeAction();
		return new ResponseEntity(response, HttpStatus.OK);
	}
	
	@GetMapping("/getcart/{userId}")
	ResponseEntity<String> getCart(@PathVariable int userId){
		ActionData data = new ActionData();
		data.setAction(AllowedActions.GET_CART);
		data.setRepoService(repoService);
		data.setUserId(userId);
		String response = data.executeAction();
		return new ResponseEntity(response, HttpStatus.OK);		
	}
	
	@PostMapping("/addtocart/{userId}")
	ResponseEntity<String> addProductToCart(@RequestBody Product product, @PathVariable int userId){
		ActionData data = new ActionData();
		data.setAction(AllowedActions.ADD_TO_CART);
		data.setRepoService(repoService);
		data.setProduct(product);
		data.setUserId(userId);
		String response = data.executeAction();
		return new ResponseEntity(response, HttpStatus.OK);
	}
	
	@DeleteMapping("/deletefromcart/{userId}")
	ResponseEntity<String> deleteFromCart(@RequestBody Product product, @PathVariable int userId){
		ActionData data = new ActionData();
		data.setAction(AllowedActions.DELETE_FROM_CART);
		data.setRepoService(repoService);
		data.setProduct(product);
		data.setUserId(userId);
		String response = data.executeAction();
		return new ResponseEntity(response, HttpStatus.OK);
	}
	
	
	@PostMapping("/payment/{userId}")
	ResponseEntity<String> doPayment(@PathVariable int userId, @RequestBody Payment payment ){
		ActionData data = new ActionData();
		data.setAction(AllowedActions.DO_PAYMENT);
		data.setRepoService(repoService);
		data.setUserId(userId);
		data.setPayment(payment);
		String response = data.executeAction();
		return new ResponseEntity(response, HttpStatus.OK);
	}
	
	
	@PostMapping("/sendemail/{userId}")
	ResponseEntity<String> sendEmail(@PathVariable int userId,@RequestBody Email email){
		ActionData data = new ActionData();
		data.setAction(AllowedActions.SEND_EMAIL);
		data.setRepoService(repoService);
		data.setUserId(userId);
		data.setEmail(email);
		String response = data.executeAction();
		return new ResponseEntity(response, HttpStatus.OK);
	}
	
	
	
	public static void main(String[] args) {
		SpringApplication.run(Java12feb2022Application.class, args);
	}

}
