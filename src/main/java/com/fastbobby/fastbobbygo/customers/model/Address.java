package com.fastbobby.fastbobbygo.customers.model;

import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

/**
 * Created by Shelupets Denys on 09.10.2021.
 */
@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Address {
    String city;
    String zipCode;
    String country;
    String street;
}
