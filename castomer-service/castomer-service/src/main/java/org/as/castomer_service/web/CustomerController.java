package org.as.castomer_service.web;


import lombok.AllArgsConstructor;
import org.as.castomer_service.entities.Customer;
import org.as.castomer_service.repositories.CustomerRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/customer")
@AllArgsConstructor
public class CustomerController {

    private CustomerRepository customerRepository ;


    @GetMapping("/all")
    public List<Customer> findAllCustomer(){

        return customerRepository.FindAll();
    }



    @GetMapping("/all/{id}")
    public Customer findCustomer(@PathVariable(name = "id") Long id){
        return  customerRepository.findAllById(id) ;
    }




    @PostMapping("/add")
    public void addCustomer(@RequestBody Customer customer){
        System.out.println("###Customer   :"+customer);
        customerRepository.save(customer);
    }

}
