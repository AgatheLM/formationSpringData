package ex2.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import ex2.data.entity.Event;
import ex2.data.entity.Guest;
import ex2.data.repository.EventRepository;
import ex2.data.repository.GuestRepository;

@RestController
public class GuestController {
	
	@Autowired
	GuestRepository guestRepository;
	@Autowired
	EventRepository eventRepository;
	
	@GetMapping("guest")
	public Iterable<Guest> getGuest (){
		return guestRepository.findAll();
	}
	
	@PostMapping("guest")
	public Guest saveGuest(@RequestBody Guest guest){
		return guestRepository.save(guest);
	}
	
	@GetMapping("guest/{name}")
	public Guest saveGuest(@PathVariable("name") String name){
		return guestRepository.findByName(name);
	}
	
	@GetMapping("guest/id/{id}")
	public Guest findGuest(@PathVariable("id") Integer id) throws InterruptedException, ExecutionException{
		Future<Optional<Guest>> fog =  guestRepository.findFutureOptionalGuest(id);
		if (fog.isDone()) {
			return fog.get().get();
		}
		return null;
	}
	
	
	@GetMapping("guest/event/{titleEvent}")
	public List<Guest> guestByEvent(@PathVariable("titleEvent") String titleEvent){
		Event event = eventRepository.findByTitle(titleEvent);
		return new ArrayList<Guest>(event.getGuest().values());
		
	}

}
