package com.fastbobby.fastbobbygo.customers;

import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

/**
 * Created by Shelupets Denys on 09.10.2021.
 */
@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Customer {
    Long id;
}
