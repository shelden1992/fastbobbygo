package com.fastbobby.fastbobbygo.deals.dtos;

import com.fastbobby.fastbobbygo.common.model.Location;
import com.fastbobby.fastbobbygo.deals.model.DealType;
import lombok.Data;

@Data
public class CreateDealDto {
    private String customerId;
    private String shopId;
    private Location location;
    private Long dateTime;
    private DealType dealType;
}
