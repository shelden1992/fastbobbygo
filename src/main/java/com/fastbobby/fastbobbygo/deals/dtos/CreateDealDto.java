package com.fastbobby.fastbobbygo.deals.dtos;

import com.fastbobby.fastbobbygo.common.model.Location;
import com.fastbobby.fastbobbygo.deals.model.DealType;
import lombok.Data;

import java.util.UUID;

@Data
public class CreateDealDto {
    private UUID customerId;
    private String shopId;
    private Location location;
    private Long dateTime;
    private DealType dealType;
}
