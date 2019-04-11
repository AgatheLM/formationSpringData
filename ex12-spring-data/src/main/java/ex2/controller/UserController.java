package ex2.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import ex2.data.entity.User;
import ex2.data.repository.UserRepository;

@RestController
public class UserController {
	
	@Autowired
	UserRepository userRepository;
	
	@GetMapping("user")
	public Iterable<User> getusers (){
		return userRepository.findAll();
	}
	
	
	@GetMapping("user/{email}")
	public Optional<User> getusersMail (@PathVariable("email") String email){
		return userRepository.findByUniqueAdresseMail(email);
	}
	
	
	@PostMapping("user")
	public User saveUser(@RequestBody User user){
		return userRepository.save(user);
	}

}
