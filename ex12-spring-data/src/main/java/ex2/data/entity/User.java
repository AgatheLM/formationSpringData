package ex2.data.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity @Table(name="creator")
public class User {
	
	@Id	
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="user-sequence")
	@SequenceGenerator(name="user-sequence",sequenceName="creator_sequence", allocationSize = 1)
	private Integer id;
	private String login;
	@Column(name="password")
	private String pass;
	private String email;
	
	
	public User() {
		super();
	}


	public User(Integer id, String login, String pass, String email) {
		super();
		this.id = id;
		this.login = login;
		this.pass = pass;
		this.email = email;
	}


	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public String getLogin() {
		return login;
	}


	public void setLogin(String login) {
		this.login = login;
	}


	public String getPass() {
		return pass;
	}


	public void setPass(String pass) {
		this.pass = pass;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	
	
	
	
	

}
