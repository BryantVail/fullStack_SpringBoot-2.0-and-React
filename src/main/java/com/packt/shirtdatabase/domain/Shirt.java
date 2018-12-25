package com.packt.shirtdatabase.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Column;


@Entity //defines the class as an Entity
public class Shirt {

	//PROPS LISTED IN THIS OBJECT
	//long id,
	//String brand, description, shirtColor, shirtType
	//int colorCount

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	@Column(name="brand", nullable=true, length=100)
	private String brand;

	@Column(nullable = false)
	private String shirtType;

	@Column(nullable = false)
	private String shirtColor;

	private int colorCount;

	@Column(nullable = false, length = 1000)
	private String description;

	//constructors
	public Shirt(){}
	public Shirt(String brand, String shirtType, String shirtColor, int colorCount, String description){
		super();
		this.brand = brand;
		this.description = description;
		this.colorCount = colorCount;
		this.shirtColor = shirtColor;
		this.shirtType = shirtType;

	}
	//end constructors

	//PROPS LISTED IN THIS OBJECT
	//long id,
	//String brand, description, shirtColor, shirtType
	//int colorCount

	//getters & setters

	/*id is Generated Automatically by the JPA */

	public String getBrand() {
		return this.brand;
	}
	public void setBrand(String brand){
		this.brand = brand;
	}//end brand get/set

	public String getDescription(){
		return description;
	}
	public void setDescription(String description){
		this.description = description;
	}

	public int getColorCount(){
		return this.colorCount;
	}
	public void setColorCount(int colorCount){
		this.colorCount = colorCount;
	}//end colorCount get/set

	public String getShirtColor(){
		return this.shirtColor;
	}
	public void setShirtColor(String shirtColor){
		this.shirtColor = shirtColor;
	}

	public String getShirtType(){
		return this.shirtType;
	}
	public void setShirtType(String shirtType){
		this.shirtType = shirtType;
	}//end shirtType get/set


}

















