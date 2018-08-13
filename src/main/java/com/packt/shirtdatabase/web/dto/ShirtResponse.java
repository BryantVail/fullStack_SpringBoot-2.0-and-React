package com.packt.shirtdatabase.web.dto;

public class ShirtResponse {
	public String getGreeting() {
		return greeting;
	}

	public void setGreeting(String greeting) {
		this.greeting = greeting;
	}

	public String getMessageOfTheDay() {
		return messageOfTheDay;
	}

	public void setMessageOfTheDay(String messageOfTheDay) {
		this.messageOfTheDay = messageOfTheDay;
	}

	private String greeting;
	private String messageOfTheDay;
}
