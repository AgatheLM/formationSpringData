package ex2.data.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
public class Guest {

	@Id	
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="guest-sequence")
	@SequenceGenerator(name="guest-sequence",sequenceName="guest_sequence", allocationSize = 1)
	private Integer id;
	private String name;
	private String email;
	
	
	public Guest() {
		super();
	}


	public Guest(Integer id, String name, String email) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
	}


	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	

}
