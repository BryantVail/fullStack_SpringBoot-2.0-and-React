package com.packt.shirtdatabase;
//imports from project
import com.packt.shirtdatabase.domain.Shirt;
import com.packt.shirtdatabase.domain.ShirtRepository;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ShirtdatabaseApplication {

	@Autowired
	private ShirtRepository repository;

	private static final Logger log =
			LoggerFactory.getLogger(ShirtdatabaseApplication.class);

	//main
	public static void main(String[] args) {
		SpringApplication.run(ShirtdatabaseApplication.class, args);
		log.info("Spring Boot Logger");
	}//end public static void main(String[] args){}

	@Bean
	CommandLineRunner runner(){
		return args -> {
			//demo data to database
			repository.save(new Shirt("default", "tee", "black",
					8, "alabama football"));
			repository.save(new Shirt("Nike", "polo", "blue",
					2, "running polo with Spectrum logo"));
			repository.save(new Shirt("Columbia", "dri-fit tee", "grey",
					3, "work out shirt"));

		};
	}//end CommandLineRunner runner()
}












