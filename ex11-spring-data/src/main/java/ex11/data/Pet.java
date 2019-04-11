package ex11.data;

import org.springframework.data.annotation.Id;

public class Pet {
	@Id
	protected Integer id;
	protected String name;
	protected String species;
	
	@Override
	public String toString() {
		return "Pet [id=" + id + ", name=" + name + ", species=" + species + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSpecies() {
		return species;
	}

	public void setSpecies(String species) {
		this.species = species;
	}
}
