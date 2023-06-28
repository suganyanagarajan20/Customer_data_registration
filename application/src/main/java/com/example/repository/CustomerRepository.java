package com.example.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.model.Customer;

public interface CustomerRepository extends CrudRepository <Customer, Integer> {

}
