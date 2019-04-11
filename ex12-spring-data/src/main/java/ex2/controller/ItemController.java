package ex2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import ex2.data.entity.Item;
import ex2.data.repository.ItemRepository;

@RestController
public class ItemController {
	
	@Autowired
	ItemRepository itemRepository;
	
	@GetMapping("item")
	public Iterable<Item> getItems (){
		return itemRepository.findAll();
	}
	
	@PostMapping("item")
	public Item saveItem(@RequestBody Item item){
		return itemRepository.save(item);
	}

}
