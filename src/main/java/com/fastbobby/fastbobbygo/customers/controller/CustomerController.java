package com.fastbobby.fastbobbygo.customers.controller;

import com.fastbobby.fastbobbygo.customers.model.Customer;
import com.fastbobby.fastbobbygo.customers.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Created by Shelupets Denys on 09.10.2021.
 */
@RestController("/customer")
public class CustomerController {
    @Autowired
    private CustomerService service;

    @PostMapping("/create")
    public void createCustomer(@RequestBody Customer customer) {
        service.saveCustomer(customer);
    }

    @GetMapping("/")
    @ResponseBody
    public Customer getCustomer(@RequestParam("id") Long id) {
        return service.getCustomer(id);
    }
}
