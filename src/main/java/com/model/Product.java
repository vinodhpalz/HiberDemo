package com.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="Product")
public class Product {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="productid")
	private int pid;
	@Column(name="productname")
	private String pname;
	@Column(name="productcost")
	private int pcost;
	
	@OneToOne
	private Supplier suppl;
	
	public Supplier getSuppl() {
		return suppl;
	}
	public void setSuppl(Supplier suppl) {
		this.suppl = suppl;
	}
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public int getPcost() {
		return pcost;
	}
	public void setPcost(int pcost) {
		this.pcost = pcost;
	}

	
	
}
