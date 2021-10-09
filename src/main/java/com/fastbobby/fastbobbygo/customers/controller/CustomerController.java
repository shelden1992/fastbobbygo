package com.fastbobby.fastbobbygo.customers.controller;

import com.fastbobby.fastbobbygo.customers.model.Customer;
import com.fastbobby.fastbobbygo.customers.service.CustomerServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

/**
 * Created by Shelupets Denys on 09.10.2021.
 */
@RestController("/customer")
public class CustomerController {
    @Autowired
    private CustomerServiceImpl service;

    @PostMapping("/create")
    public void createCustomer(@RequestBody Customer customer) {
        service.saveCustomer(customer);
    }

    @GetMapping("/get")
    @ResponseBody
    public Customer getCustomer(@RequestParam("id") UUID id) {
        return service.getCustomer(id);
    }

    @DeleteMapping("/delete")
    public void deleteCustomer(@RequestParam("id") UUID id) {
        service.deleteCustomer(id);
    }

    @PutMapping("/update")
    public Customer updateCustomer(@RequestBody Customer customer) {
       return service.updateCustomer(customer);
    }

}
