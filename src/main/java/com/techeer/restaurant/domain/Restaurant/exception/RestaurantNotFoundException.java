package com.techeer.restaurant.domain.Restaurant.exception;

import com.techeer.restaurant.global.error.ErrorCode;
import com.techeer.restaurant.global.error.exception.BusinessException;

public class RestaurantNotFoundException extends BusinessException {
    public RestaurantNotFoundException() {
        super(ErrorCode.RESTAURANT_NOT_FOUND_ERROR);
    }
}
