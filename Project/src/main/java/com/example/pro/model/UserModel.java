package com.example.pro.model;


import java.util.List;



import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="_usermodel")
public class UserModel {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String firstName;
	private String lastName;
	private String email;
	private String address;
	private String inTime;
	private String outTime;

//
	@OneToMany(cascade =CascadeType.ALL,fetch=FetchType.EAGER)
	@JoinColumn(name = "room_id", referencedColumnName = "id")
	private List<Room> room;
	
	@OneToMany(cascade =CascadeType.ALL,fetch=FetchType.EAGER)
	@JoinColumn(name = "price_id", referencedColumnName = "id")
	private List<Price> price;
	
	public UserModel() {
		super();
	}


	public UserModel(Long id, String firstName, String lastName, String email, String address, String inTime,
		String outTime) {
	super();
	this.id = id;
	this.firstName = firstName;
	this.lastName = lastName;
	this.email = email;
	this.address = address;
	this.inTime = inTime;
	this.outTime = outTime;
}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public String getInTime() {
		return inTime;
	}


	public void setInTime(String inTime) {
		this.inTime = inTime;
	}


	public String getOutTime() {
		return outTime;
	}


	public void setOutTime(String outTime) {
		this.outTime = outTime;
	}


	public List<Room> getRoom() {
		return room;
	}


	public void setRoom(List<Room> room) {
		this.room = room;
	}


	public List<Price> getPrice() {
		return price;
	}


	public void setPrice(List<Price> price) {
		this.price = price;
	}
	
	
	
}
