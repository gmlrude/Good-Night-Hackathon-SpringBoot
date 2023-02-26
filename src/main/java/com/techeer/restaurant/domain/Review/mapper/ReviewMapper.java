package com.techeer.restaurant.domain.Review.mapper;

import com.techeer.restaurant.domain.Restaurant.dto.RestaurantDto;
import com.techeer.restaurant.domain.Restaurant.entity.Restaurant;
import com.techeer.restaurant.domain.Review.dto.ReviewDto;
import com.techeer.restaurant.domain.Review.entity.Review;
import org.springframework.stereotype.Component;

@Component
public class ReviewMapper {
    public Review toEntity(ReviewDto.CreateRequest dto, Restaurant restaurant) {
        return Review.builder()
                .title(dto.getTitle())
                .content(dto.getContent())
                .restaurant(restaurant)
                .build();
    }
}
