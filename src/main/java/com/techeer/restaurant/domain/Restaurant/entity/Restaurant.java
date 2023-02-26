package com.techeer.restaurant.domain.Restaurant.entity;

import com.techeer.restaurant.domain.Review.entity.Review;
import com.techeer.restaurant.global.entity.BaseEntity;
import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Getter
@Entity
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Table(name = "restaurants")
public class Restaurant extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "restaurant_id")
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "type")
    private String type;

    private Boolean isDeleted;

    @OneToMany(mappedBy = "restaurant")
    private List<Review> reviews = new ArrayList<>();

    @Builder
    public Restaurant(String name, String type) {
        this.name = name;
        this.type = type;
        this.isDeleted = false;
    }

    public void update(String type) {
        this.type = type;
    }

    public void delete() { //soft delete
        this.isDeleted = true;
    }
}

