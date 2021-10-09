package com.fastbobby.fastbobbygo.shops.repository;

import com.fastbobby.fastbobbygo.shops.model.Shop;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Repository
public class ShopRepository {
    List<Shop> list = new ArrayList<>();

    public Shop create(Shop shop) {
        list.add(shop);

        return shop;
    }

    public Optional<Shop> getById(UUID uuid) {
        return list.stream().filter(shop -> shop.getId().equals(uuid)).findAny();
    }
}
