package com.gkaraffa.springsample.service;

import java.util.List;

import com.gkaraffa.springsample.model.Customer;
import com.gkaraffa.springsample.repository.CustomerRepository;
import com.gkaraffa.springsample.repository.HibernateCustomerRepositoryImpl;

public class CustomerServiceImpl implements CustomerService {
  private CustomerRepository customerRepository = new HibernateCustomerRepositoryImpl();

  /* (non-Javadoc)
   * @see com.pluralsight.service.CustomerService#findAll()
   */
  @Override
  public List<Customer> findAll() {
    return customerRepository.findAll();
  }
}
