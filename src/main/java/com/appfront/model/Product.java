package com.appfront.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="product")
public class Product {
	@Id
	//@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer prodid;
	private String proddesc;
	public Product() {
		
	}
	public Integer getProdid() {
		return prodid;
	}
	public void setProdid(Integer id) {
		this.prodid = id;
	}
	public String getProddesc() {
		return proddesc;
	}
	public void setProddesc(String proddesc) {
		this.proddesc = proddesc;
	}
	

}
