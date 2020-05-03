package com.visionai.csvisualgenerator.repository;


import org.springframework.data.repository.CrudRepository;
import com.visionai.csvisualgenerator.model.Customer;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerDTO extends CrudRepository<Customer , Integer > {
}