package com.fastbobby.fastbobbygo.customers.repository;

import com.fastbobby.fastbobbygo.customers.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Shelupets Denys on 09.10.2021.
 */
@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {

}
