package com.techeer.restaurant.domain.Restaurant.controller;

import com.techeer.restaurant.domain.Restaurant.entity.Restaurant;
import com.techeer.restaurant.global.result.ResultCode;
import com.techeer.restaurant.domain.Restaurant.dto.RestaurantDto;
import com.techeer.restaurant.domain.Restaurant.service.RestaurantService;
import com.techeer.restaurant.global.result.ResultResponse;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

import java.util.List;

import static com.techeer.restaurant.global.result.ResultCode.RESTAURANT_GET_SUCCESS;

@Api(tags = "레스토랑 API")
@RequestMapping("/api/v1/restaurants")
@RestController
@RequiredArgsConstructor(access = AccessLevel.PRIVATE)
public class RestaurantController {
    private final RestaurantService restaurantService;

    @ApiOperation(value = "레스토랑 등록")
    @PostMapping
    public ResponseEntity<ResultResponse> createRestaurant(
            @Valid @RequestBody RestaurantDto.CreateRequest createRequest) {
        restaurantService.createRestaurant(createRequest);
        return ResponseEntity.ok(ResultResponse.of(ResultCode.RESTAURANT_CREATE_SUCCESS));
    }
}
