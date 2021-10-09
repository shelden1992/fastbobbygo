package com.fastbobby.fastbobbygo.customers.repository;


import com.fastbobby.fastbobbygo.customers.model.Customer;

public interface CustomerRepository {

    Customer getById(Long id);

    void deleteById(Long id);

    Customer update(Customer customer);

    Customer save(Customer customer);
}
