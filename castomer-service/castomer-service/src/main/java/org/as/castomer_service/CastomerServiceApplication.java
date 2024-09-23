package org.as.castomer_service;

import org.as.castomer_service.entities.Customer;
import org.as.castomer_service.repositories.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CastomerServiceApplication {


	@Autowired
	private CustomerRepository customerRepository  ;

	public static void main(String[] args) {
		SpringApplication.run(CastomerServiceApplication.class, args);

		System.out.println("*******************************************************************************");


       System.out.println("***************           APPLICATION SUCCES             ************************");


		System.out.println("*******************************************************************************");
	}
@Bean
	CommandLineRunner run(){

		return  args -> {
			Customer customer = new Customer() ;

			customerRepository.save(new Customer(null ,"yassine" ,"yassine@gmail.com"));
			customerRepository.save(new Customer(null ,"Nader" ,"Nadere@gmail.com"));
			customerRepository.save(new Customer(null ,"Faten" ,"Faten@gmail.com"));
			customerRepository.save(new Customer(null ,"RAMI" ,"Rami@gmail.com"));





		};
	}

}
