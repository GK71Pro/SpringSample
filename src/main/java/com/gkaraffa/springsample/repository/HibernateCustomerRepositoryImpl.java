package com.gkaraffa.springsample.repository;

import java.util.ArrayList;
import java.util.List;

import com.gkaraffa.springsample.model.Customer;

public class HibernateCustomerRepositoryImpl implements CustomerRepository {

  /*
   * (non-Javadoc)
   * 
   * @see com.pluralsight.repository.CustomerRepository#findAll()
   */
  @Override
  public List<Customer> findAll() {
    List<Customer> customers = new ArrayList<>();

    Customer customer = new Customer();

    customer.setFirstname("Gabriel");
    customer.setLastname("Karaffa");

    customers.add(customer);

    return customers;
  }
}
