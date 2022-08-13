package project.vpd.java12feb2022.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import project.vpd.java12feb2022.model.Product;

public interface ProductRepository extends JpaRepository<Product,Integer>{

}
