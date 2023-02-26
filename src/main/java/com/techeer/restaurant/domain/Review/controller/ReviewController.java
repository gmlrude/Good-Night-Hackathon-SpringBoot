package com.techeer.restaurant.domain.Review.controller;

import com.techeer.restaurant.domain.Restaurant.dto.RestaurantDto;
import com.techeer.restaurant.domain.Restaurant.entity.Restaurant;
import com.techeer.restaurant.domain.Restaurant.service.RestaurantService;
import com.techeer.restaurant.domain.Review.dto.ReviewDto;
import com.techeer.restaurant.domain.Review.service.ReviewService;
import com.techeer.restaurant.global.result.ResultCode;
import com.techeer.restaurant.global.result.ResultResponse;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@Api(tags = "리뷰 API")
@RequestMapping("/api/v1/reviews")
@RestController
@RequiredArgsConstructor(access = AccessLevel.PRIVATE)
public class ReviewController {
    private final ReviewService reviewService;
    private final RestaurantService restaurantService;

    @ApiOperation(value = "리뷰 작성")
    @PostMapping
    public ResponseEntity<ResultResponse> createReview(
            @Valid @RequestBody ReviewDto.CreateRequest createRequest) {
        Restaurant restaurant = restaurantService.findRestaurantById(createRequest.getRestaurantId());
        reviewService.createReview(createRequest,restaurant);
        return ResponseEntity.ok(ResultResponse.of(ResultCode.REVIEW_CREATE_SUCCESS));
    }
}
