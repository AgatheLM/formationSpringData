package ex2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import ex2.data.entity.Guest;
import ex2.data.repository.GuestRepository;

@RestController
public class GuestController {
	
	@Autowired
	GuestRepository guestRepository;
	
	@GetMapping("guest")
	public Iterable<Guest> getGuest (){
		return guestRepository.findAll();
	}
	
	@PostMapping("guest")
	public Guest saveGuest(@RequestBody Guest guest){
		return guestRepository.save(guest);
	}

}
