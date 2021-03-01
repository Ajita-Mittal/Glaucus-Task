package com.glaucus.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class IncrementNumber {
	
	@Id
	@GeneratedValue
	private int id;
	private int increement;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getIncreement() {
		return increement;
	}
	public void setIncreement(int increement) {
		this.increement = increement;
	}
	
}
