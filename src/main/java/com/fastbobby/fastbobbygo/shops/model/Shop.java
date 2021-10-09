package com.fastbobby.fastbobbygo.shops.model;

import com.fastbobby.fastbobbygo.common.model.Location;
import com.fastbobby.fastbobbygo.worktypes.model.WorkType;
import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.List;
import java.util.UUID;

/**
 * Created by Shelupets Denys on 09.10.2021.
 */
@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Shop {
    UUID id;
    String name;
    Location location;
    List<HashMap<WorkType, BigDecimal>> works;
}
