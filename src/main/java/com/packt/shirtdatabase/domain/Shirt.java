package com.packt.shirtdatabase.domain;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Shirt {

	//PROPS LISTED IN THIS OBJECT
	//long id,
	//String brand, description, shirtColor, shirtType
	//int colorCount

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	private String brand;

	@Column(nullable = false)
	private String shirtType;

	@Column(nullable = false)
	private String shirtColor;

	private int colorCount;

	@Column(nullable = false, length = 750)
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

	//getters & setters
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
