package com.techeer.restaurant.domain.Restaurant.repository;

import com.techeer.restaurant.domain.Restaurant.entity.Restaurant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

public interface RestaurantRepository extends JpaRepository<Restaurant, Long> {
    Optional<List<Restaurant>> findByType(String type);
}
