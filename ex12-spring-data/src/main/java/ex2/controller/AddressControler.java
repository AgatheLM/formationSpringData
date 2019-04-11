package ex2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import ex2.data.entity.Address;
import ex2.data.repository.AddressRepository;

@RestController
public class AddressControler {
	
	@Autowired
	AddressRepository addressRepository;
	
	@GetMapping("address")
	public Iterable<Address> getEvents (){
		return addressRepository.findAll();
	}

	@PostMapping("address")
	public Address saveAddress(@RequestBody Address adresse){
		return addressRepository.save(adresse);
	}

}
