package ex2.data.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import ex2.data.entity.User;

public interface UserRepository extends CrudRepository<User,Integer> {

	
	@Query("SELECT u FROM User u where u.email=:email")
	public Optional<User> findByUniqueAdresseMail(@Param("email") String email);

	
}
