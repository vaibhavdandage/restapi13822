package project.vpd.restapp13822.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import project.vpd.restapp13822.model.User;

public interface UserRepository extends JpaRepository<User, String>{

	User findByEmail(String email);

}
