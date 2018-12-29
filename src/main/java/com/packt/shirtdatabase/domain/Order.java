package com.packt.shirtdatabase.domain;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
public class Order {

	@ManyToOne(fetch= FetchType.LAZY)//MANY orders to ONE customer
	@JoinColumn(name= "customer")
	private Customer customer;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	public LocalDateTime initDate;

	//Constructors
	public Order(){
		this.initDate = LocalDateTime.now();

	}


//	public Order(){}

	//getter & setter
	public Customer getCustomer(){
		return customer;
	}

	public void setCustomer(Customer customer){
		this.customer = customer;
	}


}
