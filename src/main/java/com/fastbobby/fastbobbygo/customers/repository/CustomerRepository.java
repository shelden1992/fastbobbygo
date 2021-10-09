package com.fastbobby.fastbobbygo.customers.repository;


import com.fastbobby.fastbobbygo.customers.model.Customer;

import java.util.UUID;

public interface CustomerRepository {

    Customer getById(UUID id);

    void deleteById(UUID id);

    Customer update(Customer customer);

    Customer save(Customer customer);
}
