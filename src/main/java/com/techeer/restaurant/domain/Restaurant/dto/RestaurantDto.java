package com.techeer.restaurant.domain.Restaurant.dto;

import lombok.*;

import java.time.LocalDateTime;

public class RestaurantDto {
    @Getter
    @Builder
    @AllArgsConstructor(access = AccessLevel.PROTECTED)
    public static class Response {
        private String name; // 레스토랑 이름
        private String type;
        private LocalDateTime createdAt;
    }

    @Getter
    @Builder
    @AllArgsConstructor(access = AccessLevel.PROTECTED)
    @NoArgsConstructor(access = AccessLevel.PROTECTED)
    public static class CreateRequest {
        private String name;
        private String type;
    }

    @Getter
    @Builder
    @AllArgsConstructor(access = AccessLevel.PROTECTED)
    @NoArgsConstructor(access = AccessLevel.PROTECTED)
    public static class UpdateRequest {
        private String type;
    }
}
