package ex2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
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
	
	@PostMapping("user")
	public User saveUser(@RequestBody User user){
		return userRepository.save(user);
	}

}
