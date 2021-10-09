package com.fastbobby.fastbobbygo.customers;

import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import java.util.Date;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Car {
    String model;
    Date year;
    Vehicle vehicle;
}
