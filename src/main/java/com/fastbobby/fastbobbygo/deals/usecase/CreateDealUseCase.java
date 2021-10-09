package com.fastbobby.fastbobbygo.deals.usecase;

import com.fastbobby.fastbobbygo.deals.dtos.CreateDealDto;
import com.fastbobby.fastbobbygo.deals.dtos.DealDto;
import com.fastbobby.fastbobbygo.deals.mapper.DealMapper;
import com.fastbobby.fastbobbygo.deals.model.Deal;
import com.fastbobby.fastbobbygo.deals.model.Status;
import com.fastbobby.fastbobbygo.deals.repository.DealRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.UUID;

@Service
public class CreateDealUseCase {
    private final DealRepository dealRepository;
    private final CustomerRepository customerRepository;
    private final ShopRepository shopRepository;
    private final DealMapper dealMapper;

    public CreateDealUseCase(
        CustomerRepository customerRepository,
        DealRepository dealRepository,
        DealMapper dealMapper,
        ShopRepository shopRepository
    ) {
        this.dealRepository = dealRepository;
        this.dealMapper = dealMapper;
        this.customerRepository = customerRepository;
        this.shopRepository = shopRepository
    }

    public Optional<DealDto> execute(CreateDealDto dto) {
        Customer customer = customerRepository.getById(dto.getCustomerId());
        Shop shop = shopRepository.getById(dto.getShopId());

        Deal deal = Deal.builder()
            .id(UUID.randomUUID())
            .customer(customer)
            .shop(shop)
            .status(Status.TODO)
            .location(dto.getLocation())
            .type(dto.getDealType())
            .build();

        return Optional.of(this.dealMapper.toDto(this.dealRepository.create(deal)));
    }
}
