package project.vpd.java12feb2022.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import project.vpd.java12feb2022.model.Payment;

public interface PaymentRepository extends JpaRepository<Payment,Integer>{

}
