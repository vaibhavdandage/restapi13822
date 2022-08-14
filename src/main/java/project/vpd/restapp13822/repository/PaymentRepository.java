package project.vpd.restapp13822.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import project.vpd.restapp13822.model.Payment;

public interface PaymentRepository extends JpaRepository<Payment,Integer>{

}
