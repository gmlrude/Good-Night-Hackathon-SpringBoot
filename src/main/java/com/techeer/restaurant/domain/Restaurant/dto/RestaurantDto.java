package com.techeer.restaurant.domain.Restaurant.dto;

import lombok.*;

public class RestaurantDto {
    @Getter
    @Builder
    @AllArgsConstructor(access = AccessLevel.PROTECTED)
    @NoArgsConstructor(access = AccessLevel.PROTECTED)
    public static class CreateRequest {
        private String name;
        private String type;
    }
}
