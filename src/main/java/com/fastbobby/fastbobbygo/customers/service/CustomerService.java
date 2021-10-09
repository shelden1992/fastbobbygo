package com.fastbobby.fastbobbygo.customers.service;

import com.fastbobby.fastbobbygo.customers.model.Customer;
import com.fastbobby.fastbobbygo.customers.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Shelupets Denys on 09.10.2021.
 */
@Service
public class CustomerService {
    @Autowired
    private CustomerRepository customerRepository;

    public Customer saveCustomer(Customer customer) {
        return customerRepository.save(customer);
    }

    public Customer getCustomer(Long customer) {
         return customerRepository.getById(customer);
    }
}
