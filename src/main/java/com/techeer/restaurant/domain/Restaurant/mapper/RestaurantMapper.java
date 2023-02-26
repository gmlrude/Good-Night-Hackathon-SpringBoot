package com.techeer.restaurant.domain.Restaurant.mapper;

import com.techeer.restaurant.domain.Restaurant.entity.Restaurant;
import com.techeer.restaurant.domain.Restaurant.dto.RestaurantDto;
import org.springframework.stereotype.Component;


@Component
public class RestaurantMapper {
    public Restaurant toEntity(RestaurantDto.CreateRequest dto) {
        return Restaurant.builder()
                .name(dto.getName())
                .type(dto.getType())
                .build();
    }
}
