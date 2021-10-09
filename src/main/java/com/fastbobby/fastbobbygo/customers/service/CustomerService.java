package com.fastbobby.fastbobbygo.customers.service;

import com.fastbobby.fastbobbygo.customers.model.Customer;

/**
 * Created by Shelupets Denys on 09.10.2021.
 */
public interface CustomerService {
    Customer saveCustomer(Customer customer);

    Customer getCustomer(Long customer);

    void deleteCustomer(Long customer);

    Customer updateCustomer(Customer customer);
}
