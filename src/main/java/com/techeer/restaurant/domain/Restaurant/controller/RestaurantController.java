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

    @ApiOperation(value = "레스토랑 카테고리별 목록 조회")
    @GetMapping
    public ResponseEntity<ResultResponse> findAllByType(@RequestParam(value="type") String type) {
        List<Restaurant> response = restaurantService.findAllByType(type);
        return ResponseEntity.ok(ResultResponse.of(RESTAURANT_GET_SUCCESS, response));
    }

    @ApiOperation(value = "레스토랑 목록 조회")
    @GetMapping("list")
    public ResponseEntity<ResultResponse> findAll() {
        List<Restaurant> response = restaurantService.findAll();
        return ResponseEntity.ok(ResultResponse.of(RESTAURANT_GET_SUCCESS, response));
    }

    @ApiOperation(value = "레스토랑 조회")
    @GetMapping("{restaurantId}")
    public ResponseEntity<ResultResponse> findAllById(@PathVariable Long restaurantId) {
        RestaurantDto.Response response = restaurantService.findById(restaurantId);
        return ResponseEntity.ok(ResultResponse.of(RESTAURANT_GET_SUCCESS, response));
    }

    @ApiOperation(value = "레스토랑 수정")
    @PutMapping("{restaurantId}")
    public ResponseEntity<ResultResponse> updateRestaurant(
            @PathVariable Long restaurantId,
            @Valid @RequestBody RestaurantDto.UpdateRequest updateRequest) {
        restaurantService.updateRestaurant(restaurantId, updateRequest);
        return ResponseEntity.ok(ResultResponse.of(ResultCode.RESTAURANT_UPDATE_SUCCESS));
    }

    @ApiOperation(value = "레스토랑 삭제")
    @DeleteMapping("{restaurantId}")
    public ResponseEntity<ResultResponse> deleteRestaurant(@PathVariable Long restaurantId) {
        restaurantService.deleteRestaurant(restaurantId);
        return ResponseEntity.ok(ResultResponse.of(ResultCode.RESTAURANT_DELETE_SUCCESS));
    }
}
