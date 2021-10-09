package com.fastbobby.fastbobbygo.deals.model;

import com.fastbobby.fastbobbygo.common.model.Location;
import com.fastbobby.fastbobbygo.customers.model.Customer;
import com.fastbobby.fastbobbygo.mechanics.Mechanic;
import com.fastbobby.fastbobbygo.shops.model.Shop;
import lombok.Builder;
import lombok.Data;

import java.util.UUID;

@Data
@Builder
public class Deal {
    private UUID id;
    private Customer customer;
    private Shop shop;
    private Status status;
    private Mechanic mechanic;
    private Location location;
    private DealType type;
}
