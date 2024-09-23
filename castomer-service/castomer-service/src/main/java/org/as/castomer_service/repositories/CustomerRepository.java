package org.as.castomer_service.repositories;

import org.as.castomer_service.entities.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

import java.util.List;

@RepositoryRestResource
public interface CustomerRepository  extends JpaRepository<Customer , Long> {


    @Query(value = "select u from Customer u")
    public List<Customer>  FindAll();

    public Customer findAllById(Long id );

}
