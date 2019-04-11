package ex2.data.entity;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.MapKey;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;

@Entity
public class Event {
	
	@Id	
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="event-sequence")
	@SequenceGenerator(name="event-sequence",sequenceName="event_sequence", allocationSize = 1)
	private Integer id;
	private String title;
	private String description;
	@Column(name="begindate")
	private LocalDate beginDate;
	@Column(name="alldays")
	private Boolean allDays;
	@ManyToOne(cascade=CascadeType.PERSIST)
	@JoinColumn(name="fk_address_event")
	private Address address;
	@ManyToOne(cascade=CascadeType.PERSIST)
	@JoinColumn(name="fk_creator")
	private User user;
	@ManyToMany(cascade=CascadeType.PERSIST)
	@JoinTable(name="guest_event", 
			   joinColumns={@JoinColumn(name="fk_event")}, 
			   inverseJoinColumns={@JoinColumn(name="fk_guest")}
	)
	@MapKey(name="id")	
	private Map<Integer, Guest> guest;
	@OneToMany(cascade=CascadeType.PERSIST)
	@JoinColumn(name="fk_item_event", referencedColumnName="id")
	@MapKey(name="id")	
	private Map<Integer,Item> items;
	
	
	public Event() {
		super();
		guest=new HashMap<>();
		items=new HashMap<>();
	}


	public Event(Integer id, String title, String descritpion, LocalDate beginDate, Boolean allDay) {
		super();
		this.id = id;
		this.title = title;
		this.description = descritpion;
		this.beginDate = beginDate;
		this.allDays = allDay;
	}


	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String descritpion) {
		this.description = descritpion;
	}


	public LocalDate getBeginDate() {
		return beginDate;
	}


	public void setBeginDate(LocalDate beginDate) {
		this.beginDate = beginDate;
	}


	public Boolean getAllDays() {
		return allDays;
	}


	public void setAllDays(Boolean allDays) {
		this.allDays = allDays;
	}


	public Address getAddress() {
		return address;
	}


	public void setAddress(Address address) {
		this.address = address;
	}


	public User getUser() {
		return user;
	}


	public void setUser(User user) {
		this.user = user;
	}


	public Map<Integer, Guest> getGuest() {
		return guest;
	}


	public void setGuest(Map<Integer, Guest> guest) {
		this.guest = guest;
	}


	public Map<Integer, Item> getItems() {
		return items;
	}


	public void setItems(Map<Integer, Item> items) {
		this.items = items;
	}


	

	

	

}
