package ex2.data.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
public class Item {
	
	@Id	
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="item-sequence")
	@SequenceGenerator(name="item-sequence",sequenceName="item_sequence", allocationSize = 1)
	private Integer id;
	private String name;
	@Column(name="neededquantity")
	private Integer neededQuantity;
	@Column(name="currentquantity")
	private Integer currentQuantity;
	
	
	
	public Item() {
		super();
	}


	public Item(Integer id, String name, Integer neededQuantity, Integer currentQuantity) {
		super();
		this.id = id;
		this.name = name;
		this.neededQuantity = neededQuantity;
		this.currentQuantity = currentQuantity;
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


	public Integer getNeededQuantity() {
		return neededQuantity;
	}


	public void setNeededQuantity(Integer neededQuantity) {
		this.neededQuantity = neededQuantity;
	}


	public Integer getCurrentQuantity() {
		return currentQuantity;
	}


	public void setCurrentQuantity(Integer currentQuantity) {
		this.currentQuantity = currentQuantity;
	}



	



}
