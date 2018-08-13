package com.packt.shirtdatabase.domain;

import javax.persistence.*;

@Entity
public class Customer {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long customerId;
	@Column(nullable=false)
	private String username;
	@Column(nullable=false)
	private String email;
	
	private String city, state, zip, country;

	//constructors	//
	public Customer(){}
	public Customer(String username, String email){
		super();
		this.username = username;
		this.email = email;
		this.city = "";
		this.state= "";
		this.zip = "";
		this.country = "";
	}
	public Customer(String username, String email,
					String city, String state, String zip, String country){
		super();
		this.username = username;
		this.email = email;
		this.city = city;
		this.state = state;
		this.zip = zip;
		this.country = country;
	}
	//end constructors //

	//getters & setters
	public long getId(){
		return this.customerId;
	}

	public String getUsername(){
		return this.username;
	}
	public void setUsername(String username){
		this.username = username;
	}
	//end username get/set

	public String getEmail(){
		return this.email;
	}
	public void setEmail(String email){
		this.email = email;
	}//end email get/set

	public String getCity(){
		return this.city;
	}
	public void setCity(String city){
		this.city = city;
	}//end city get/set

	public String getState(){
		return this.state;
	}
	public void setState(String state){
		this.state = state;
	}//end state get/set

	public String getZip(){
		return this.zip;
	}
	public void setZip(String zip){
		this.zip = zip;
	}//end zip get /set

	public String getCountry(){
		return this.country;
	}
	public void setCountry(String country){
		this.country = country;
	}//end country get/set

}//end class
