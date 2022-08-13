package project.vpd.java12feb2022.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import project.vpd.java12feb2022.model.User;

public interface UserRepository extends JpaRepository<User, String>{

	User findByEmail(String email);

}
