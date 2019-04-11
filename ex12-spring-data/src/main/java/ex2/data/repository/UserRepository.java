package ex2.data.repository;

import org.springframework.data.repository.CrudRepository;

import ex2.data.entity.User;

public interface UserRepository extends CrudRepository<User,Integer> {

}
