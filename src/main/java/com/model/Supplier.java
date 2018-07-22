package com.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Supplier {
	
	@Column(name="SupplierId")
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int Id;
	@Column(name="SupplierName")
	private String name;
	
	
	

	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}	
	
}
