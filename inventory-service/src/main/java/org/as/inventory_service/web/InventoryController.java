package org.as.inventory_service.web;


import org.as.inventory_service.entities.Inventory;
import org.as.inventory_service.repositories.InventoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/inventory")
public class InventoryController {


    @Autowired
    private InventoryRepository inventoryRepository ;



    @GetMapping("/all")
    public List<Inventory>  findAll(){

        return inventoryRepository.findAll() ;
    }
}
