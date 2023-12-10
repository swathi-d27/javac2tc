package com.example.demo;



import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="product")
public class Product {



	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	@Column(name="name")
	private String name;
	@Column(name="dob")
	private String dob;
	@Column(name="address")
	private String address;
	@Column(name="shop_id")
	private Integer shop_id;
	
	public Product()
	{
	}
	
	
	public Product(String name, String dob, String address, Integer shop_id) {
		super();
		this.name = name;
		this.dob = dob;
		this.address = address;
		this.shop_id = shop_id;
	}
	public Integer getId()
	{
		return id;
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Integer getShop_id() {
		return shop_id;
	}
	public void setShop_id(Integer shop_id) {
		this.shop_id = shop_id;
	}
	public void setId(Integer id) {
		this.id = id;
	}


	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", dob=" + dob + ", address=" + address + ", shop_id=" + shop_id
				+ "]";
	}
	


	}
	    
 
  
