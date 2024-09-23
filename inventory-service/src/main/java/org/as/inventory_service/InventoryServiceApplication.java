package org.as.inventory_service;

import org.as.inventory_service.entities.Inventory;
import org.as.inventory_service.repositories.InventoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class InventoryServiceApplication {

	@Autowired
	private InventoryRepository inventoryRepository ;
	public static void main(String[] args) {
		SpringApplication.run(InventoryServiceApplication.class, args);
		System.out.println("*******************************************************************************");


		System.out.println("***************           APPLICATION SUCCES  2____InVentory        ************************");


		System.out.println("*******************************************************************************");
	}


@Bean
	CommandLineRunner run(){
		return args -> {


			inventoryRepository.save(new Inventory(null , "inventory1" , 1100));
			inventoryRepository.save(new Inventory(null , "inventory2" , 2200));
			inventoryRepository.save(new Inventory(null , "inventory3" , 3300));
			inventoryRepository.save(new Inventory(null , "inventory5" , 4400));
			inventoryRepository.save(new Inventory(null , "inventory5" , 5500));

		};
	}
}
