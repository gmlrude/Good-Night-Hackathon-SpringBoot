package com.techeer.restaurant.domain.Review.service;

import com.techeer.restaurant.domain.Restaurant.dto.RestaurantDto;
import com.techeer.restaurant.domain.Restaurant.entity.Restaurant;
import com.techeer.restaurant.domain.Restaurant.service.RestaurantService;
import com.techeer.restaurant.domain.Review.dto.ReviewDto;
import com.techeer.restaurant.domain.Review.entity.Review;
import com.techeer.restaurant.domain.Review.mapper.ReviewMapper;
import com.techeer.restaurant.domain.Review.repository.ReviewRepository;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor(access = AccessLevel.PROTECTED)
public class ReviewService {
    private final ReviewRepository reviewRepository;
    private final ReviewMapper reviewMapper;

    public Review createReview(ReviewDto.CreateRequest requestDto, Restaurant restaurant) {
        Review review = reviewMapper.toEntity(requestDto, restaurant);
        Review createdReview = reviewRepository.save(review);

        return createdReview;
    }
}
