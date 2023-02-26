package com.techeer.restaurant.domain.Review.repository;

import com.techeer.restaurant.domain.Review.entity.Review;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Optional;

public interface ReviewRepository extends JpaRepository<Review, Long> {
//    @Query("SELECT v FROM Review v JOIN v.restaurant vr WHERE vr.id = :restaurantId")
    List<Review> findByRestaurantId(@Param("restaurantId") Long restaurantId);
}
