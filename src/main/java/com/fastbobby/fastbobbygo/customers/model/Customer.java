package com.fastbobby.fastbobbygo.customers.model;

import com.fastbobby.fastbobbygo.customers.Car;
import com.fastbobby.fastbobbygo.deals.model.Deal;
import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import java.util.List;
import java.util.UUID;

/**
 * Created by Shelupets Denys on 09.10.2021.
 */
@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Customer {
    UUID id;
    String name;
    String email;
    List<Deal> deal;
    List<Car> cars;
    Address address;
}
