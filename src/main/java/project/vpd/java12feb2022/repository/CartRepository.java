package project.vpd.java12feb2022.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import project.vpd.java12feb2022.model.Cart;

public interface CartRepository extends JpaRepository<Cart,Integer>{

	List<Cart> findById(int cartId);
	List<Cart> findByProductIdAndUserId(int productId, int userId);
	//void deleteAllByUserId(int userId);
	
}
