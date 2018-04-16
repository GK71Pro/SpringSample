package com.gkaraffa.springsample.repository;

import java.util.List;

import com.gkaraffa.springsample.model.Customer;

public interface CustomerRepository {

  List<Customer> findAll();

}
