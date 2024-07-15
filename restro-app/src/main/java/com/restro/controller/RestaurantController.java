package com.restro.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.restro.entity.Restaurant;
import com.restro.repository.RestaurantRepository;

import jakarta.transaction.Transactional;

@RestController
@Transactional
public class RestaurantController {

	@Autowired
	RestaurantRepository restaurantRepository;

	// TODO: Get all restaurants
	@GetMapping("restaurants")
	public List<Restaurant> getRestaurants() {
		return (List<Restaurant>) restaurantRepository.findAll();
	}

	// TODO: Save a new restaurant
	@PostMapping("restaurants")
	public Restaurant saveRestaurant(@RequestBody Restaurant restaurant) {
		return restaurantRepository.save(restaurant);
	}

	// TODO: Delete a restaurant
	@DeleteMapping("restaurants/{restaurantId}")
	public String deleteRestaurant(@PathVariable int restaurantId) {
		Integer res = restaurantRepository.deleteByRestaurantId(restaurantId);
		if(res == 1)
			return "OK";
		return "NOT_OK";
	}

}
