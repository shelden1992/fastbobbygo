package com.fastbobby.fastbobbygo.deals.controllers;

import com.fastbobby.fastbobbygo.deals.dtos.CreateDealDto;
import com.fastbobby.fastbobbygo.deals.dtos.DealDto;
import com.fastbobby.fastbobbygo.deals.usecase.CreateDealUseCase;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/deals")
public class DealController {
    private final CreateDealUseCase createDealUseCase;

    public DealController(CreateDealUseCase createDealUseCase) {
        this.createDealUseCase = createDealUseCase;
    }

    @PostMapping
    ResponseEntity<DealDto> createDeal(@RequestBody CreateDealDto dto) {
        return this.createDealUseCase.execute(dto)
            .map(result -> new ResponseEntity<>(result, HttpStatus.CREATED))
            .orElseThrow();
    }
}
