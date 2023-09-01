package com.example.pro.model;

import jakarta.persistence.Entity;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="_price")
public class Price {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	private Long advanceamt;
	private Long finalamt;
	
	public Price() {
		super();
	}

	public Price(Long id, Long advanceamt, Long finalamt) {
		super();
		this.id = id;
		this.advanceamt = advanceamt;
		this.finalamt = finalamt;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getAdvanceamt() {
		return advanceamt;
	}

	public void setAdvanceamt(Long advanceamt) {
		this.advanceamt = advanceamt;
	}

	public Long getFinalamt() {
		return finalamt;
	}

	public void setFinalamt(Long finalamt) {
		this.finalamt = finalamt;
	}
	
	
	
}
