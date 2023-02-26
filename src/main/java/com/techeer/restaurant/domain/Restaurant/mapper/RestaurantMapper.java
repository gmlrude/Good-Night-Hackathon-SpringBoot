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

    public RestaurantDto.Response toDto(Restaurant restaurant) {

        RestaurantDto.Response restaurantResponse =
                RestaurantDto.Response.builder()
                        .name(restaurant.getName())
                        .type(restaurant.getType())
                        .createdAt(restaurant.getCreatedAt())
                        .build();

        return restaurantResponse;
    }
}
