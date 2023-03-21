package com.techeer.restaurant.domain.Review.dto;

import com.techeer.restaurant.domain.Restaurant.dto.RestaurantDto;
import lombok.*;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

public class ReviewDto {
    @Builder
    @AllArgsConstructor(access = AccessLevel.PRIVATE)
    @NoArgsConstructor(access = AccessLevel.PRIVATE)
    @Getter
    public static class CreateRequest {
        @NotBlank
        private String title;
        @NotBlank
        private String content;
        @NotNull
        private Long restaurantId;
    }
}
