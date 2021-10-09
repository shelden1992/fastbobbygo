package com.fastbobby.fastbobbygo.customers.service;

import com.fastbobby.fastbobbygo.customers.model.Customer;

import java.util.UUID;

/**
 * Created by Shelupets Denys on 09.10.2021.
 */
public interface CustomerService {
    Customer saveCustomer(Customer customer);

    Customer getCustomer(UUID customer);

    void deleteCustomer(UUID customer);

    Customer updateCustomer(Customer customer);
}
