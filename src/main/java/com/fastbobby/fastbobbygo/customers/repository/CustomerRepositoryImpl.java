package com.fastbobby.fastbobbygo.customers.repository;

import com.fastbobby.fastbobbygo.customers.model.Customer;
import org.springframework.stereotype.Repository;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

/**
 * Created by Shelupets Denys on 09.10.2021.
 */
@Repository
public class CustomerRepositoryImpl implements CustomerRepository {
    private static Set<Customer> customers = new HashSet<>();

    public Customer save(Customer customer) {
        customers.add(customer);
        return customer;
    }

    public Customer update(Customer customer) {
        customers.add(customer);
        return customer;
    }

    public Customer getById(Long id) {
        return customers.stream().filter(customer -> Objects.equals(customer.getId(), id)).findFirst().orElse(null);
    }

    @Override
    public void deleteById(Long id) {
        Customer byId = getById(id);
        if (byId != null) {
            customers.remove(byId);
        }
    }


}
