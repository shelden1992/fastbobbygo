package com.fastbobby.fastbobbygo.deals.repository;

import com.fastbobby.fastbobbygo.deals.model.Deal;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Repository
public class DealRepository {
    List<Deal> list = new ArrayList<>();

    public Deal create(Deal deal) {
        list.add(deal);

        return deal;
    }

    public Optional<Deal> getDealById(UUID uuid) {
        return list.stream().filter(deal -> deal.getId().equals(uuid)).findFirst();
    }

    public Deal update(UUID uuid, Deal updateDeal) {
        return getDealById(uuid).map((deal -> {
            deal.setStatus(updateDeal.getStatus());
            deal.setStatus(updateDeal.getStatus());

            deal.setId(updateDeal.getId());
            deal.setCustomer(updateDeal.getCustomer());
            deal.setShop(updateDeal.getShop());
            deal.setStatus(updateDeal.getStatus());
            deal.setMechanic(updateDeal.getMechanic());
            deal.setLocation(updateDeal.getLocation());
            deal.setType(updateDeal.getType());

            return deal;
        }))
            .orElseThrow();
    }
}
