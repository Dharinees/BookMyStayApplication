package com.example.pro.model;

import jakarta.persistence.Entity;


import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="_room")
public class Room {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	private Long roomNum;
	private String roomType;
	private Long floor;
	
	public Room() {
		super();
	}
	

	public Room(Long id, Long roomNum, String roomType, Long floor) {
		super();
		this.id = id;
		this.roomNum = roomNum;
		this.roomType = roomType;
		this.floor = floor;
	}


	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getRoomNum() {
		return roomNum;
	}

	public void setRoomNum(Long roomNum) {
		this.roomNum = roomNum;
	}

	public String getRoomType() {
		return roomType;
	}

	public void setRoomType(String roomType) {
		this.roomType = roomType;
	}

	public Long getFloor() {
		return floor;
	}

	public void setFloor(Long floor) {
		this.floor = floor;
	}

	
	
	
	

}
