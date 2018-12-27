package com.packt.shirtdatabase.domain;

import org.springframework.boot.autoconfigure.web.ResourceProperties;

import javax.persistence.*;

@Entity
public class Order {

	@ManyToOne(fetch= FetchType.LAZY)//MANY orders to ONE customer
	@JoinColumn(name= "customer")
	private Customer customer;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;


//	public Order(){}

	//getter & setter
	public Customer getCustomer(){
		return customer;
	}

	public void setCustomer(Customer customer){
		this.customer = customer;
	}


}
