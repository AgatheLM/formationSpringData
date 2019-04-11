package ex2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import ex2.data.entity.Event;
import ex2.data.repository.AddressRepository;
import ex2.data.repository.EventRepository;

@RestController
public class EventController {
	
	@Autowired
	EventRepository eventRepository;
	@Autowired
	AddressRepository  addressRepository;
	
	@GetMapping("event")
	public Iterable<Event> getEvents (){
		return eventRepository.findAll();
	}
	
	@PostMapping("event")
	public Event saveEvent(@RequestBody Event event){
		return eventRepository.save(event);
		
	}

}
