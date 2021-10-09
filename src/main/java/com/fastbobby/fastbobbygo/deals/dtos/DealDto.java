package com.fastbobby.fastbobbygo.deals.dtos;

import com.fastbobby.fastbobbygo.common.model.Location;
import com.fastbobby.fastbobbygo.deals.model.DealType;
import com.fastbobby.fastbobbygo.deals.model.Status;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class DealDto {
    private String id;
    private Location location;
    private Status status;
    private DealType type;
    private DealShopDto shop;
    private DealMechanicDto mechanic;
}
