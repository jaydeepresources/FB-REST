package com.restro.repository;

import org.springframework.data.repository.CrudRepository;

import com.restro.entity.Restaurant;

public interface RestaurantRepository extends CrudRepository<Restaurant, Integer> {

	Integer deleteByRestaurantId(Integer restaurantId);
	
}
