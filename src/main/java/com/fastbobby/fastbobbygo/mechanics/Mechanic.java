package com.fastbobby.fastbobbygo.mechanics;

import com.fastbobby.fastbobbygo.deals.Deal;
import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Mechanic {
    private long id;
    private String firstName;
    private String lastName;
    private Deal deal;
}
