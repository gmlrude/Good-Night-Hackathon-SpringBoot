package com.techeer.restaurant.domain.Restaurant.service;

import com.techeer.restaurant.domain.Restaurant.dto.RestaurantDto;
import com.techeer.restaurant.domain.Restaurant.entity.Restaurant;
import com.techeer.restaurant.domain.Restaurant.exception.RestaurantNotFoundException;
import com.techeer.restaurant.domain.Restaurant.mapper.RestaurantMapper;
import com.techeer.restaurant.domain.Restaurant.repository.RestaurantRepository;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor(access = AccessLevel.PROTECTED)
public class RestaurantService {
    private final RestaurantRepository restaurantRepository;
    private final RestaurantMapper restaurantMapper;

    public Restaurant createRestaurant(RestaurantDto.CreateRequest requestDto) { // 레스토랑 등록
        Restaurant restaurant = restaurantMapper.toEntity(requestDto);
        Restaurant createdRestaurant = restaurantRepository.save(restaurant);

        return createdRestaurant;
    }
}
