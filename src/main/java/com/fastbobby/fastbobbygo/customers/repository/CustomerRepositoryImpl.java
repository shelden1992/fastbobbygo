package com.fastbobby.fastbobbygo.customers.repository;

import com.fastbobby.fastbobbygo.customers.model.Customer;
import org.springframework.stereotype.Repository;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by Shelupets Denys on 09.10.2021.
 */
@Repository
public class CustomerRepository implements {
    private static Set<Customer> customers = new HashSet<>();

    public Customer save(Customer customer) {
        customers.add(customer);
        return customer;
    }

    public Customer update(Customer customer) {
        customers.add(customer);
        return customer;
    }

    public void deleteCustomer(Customer customer) {
        customers.remove(customer);
    }


}
