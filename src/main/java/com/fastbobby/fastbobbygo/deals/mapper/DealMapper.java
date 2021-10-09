package com.fastbobby.fastbobbygo.deals.mapper;

import com.fastbobby.fastbobbygo.common.model.Location;
import com.fastbobby.fastbobbygo.deals.dtos.DealDto;
import com.fastbobby.fastbobbygo.deals.dtos.DealMechanicDto;
import com.fastbobby.fastbobbygo.deals.dtos.DealShopDto;
import com.fastbobby.fastbobbygo.deals.model.Deal;
import com.fastbobby.fastbobbygo.deals.model.DealType;
import com.fastbobby.fastbobbygo.deals.model.Status;
import org.springframework.stereotype.Service;

@Service
public class DealMapper {
    public DealDto toDto(Deal deal) {
        return DealDto.builder()
            .id(deal.getId().toString())
            .location(deal.getLocation())
            .status(deal.getStatus())
            .type(deal.getType())

            .shop(DealShopDto.builder().build())
            .mechanic(DealMechanicDto.builder().build())
            .build();
    }
}
