package ex2.data.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
public class Address {
	

	@Id	
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="address-sequence")
	@SequenceGenerator(name="address-sequence",sequenceName="address_sequence", allocationSize = 1)
	private Integer id;
	private String name;
	private String street;
	private String comments;
	@Column(name="zipcode")
	private String zipCode;
	private String city;
	
	public Address() {
		super();
	}


	public Address(Integer id, String name, String street, String comments, String zipCode, String city) {
		super();
		this.id = id;
		this.name = name;
		this.street = street;
		this.comments = comments;
		this.zipCode = zipCode;
		this.city = city;
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


	public String getStreet() {
		return street;
	}


	public void setStreet(String street) {
		this.street = street;
	}


	public String getComments() {
		return comments;
	}


	public void setComments(String comments) {
		this.comments = comments;
	}


	public String getZipCode() {
		return zipCode;
	}


	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}


	public String getCity() {
		return city;
	}


	public void setCity(String city) {
		this.city = city;
	}


	

	
	

}
