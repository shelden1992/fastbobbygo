package com.fastbobby.fastbobbygo.customers.model;

import com.fastbobby.fastbobbygo.customers.Car;
import com.fastbobby.fastbobbygo.customers.model.Address;
import com.fastbobby.fastbobbygo.deals.Deal;
import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import java.util.List;

/**
 * Created by Shelupets Denys on 09.10.2021.
 */
@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Customer {
    Long id;
    String name;
    String email;
    List<Deal> deal;
    List<Car> cars;
    Address address;
}
