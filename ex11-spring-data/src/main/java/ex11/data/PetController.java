package ex11.data;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/pets")
public class PetController {
	@Autowired
	protected PetRepository2 petRepository;
	
	@GetMapping("/{id}")
	public @ResponseBody Optional<Pet> getPet(@PathVariable Integer id) {
//		return Optional.ofNullable(petRepository.findById(id));
		return petRepository.findById(id);
	}
	@GetMapping
	public @ResponseBody Iterable<Pet> getAllPets(@RequestParam(required = false) String name) {
		if (name == null)
			return petRepository.findAll();
		else 
			return petRepository.findByName(name);
	}
	@PostMapping
	public @ResponseBody String createPet(@RequestBody Pet pet) {
		petRepository.save(pet);
		return String.format("Ajouté %s", pet);
	}
	@DeleteMapping
	public @ResponseBody String deletePet(@PathVariable Integer id) {
		petRepository.deleteById(id);
		return String.format("Supprimé %d", id);
	}

}
