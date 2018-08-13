package com.packt.shirtdatabase.web;


import com.packt.shirtdatabase.web.dto.ShirtResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/shirt")
public class ShirtController {
	private static final Logger log = LoggerFactory.getLogger(ShirtController.class);

	@RequestMapping(path = "/greeting", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public ShirtResponse SubmitShirtRequest(){
		ShirtResponse response = new ShirtResponse();
		response.setGreeting("Hey There");
		response.setMessageOfTheDay("The shadow walks quietly in the night");

		log.info("Returning Greeting: {}", response);

		return response;
	}//end hello
}
