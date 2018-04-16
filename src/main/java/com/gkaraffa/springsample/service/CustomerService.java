package com.gkaraffa.springsample.service;

import java.util.List;

import com.gkaraffa.springsample.model.Customer;


public interface CustomerService {

  List<Customer> findAll();

}
