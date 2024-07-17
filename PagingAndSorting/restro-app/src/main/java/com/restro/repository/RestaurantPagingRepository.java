package com.restro.repository;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.restro.entity.Restaurant;

public interface RestaurantPagingRepository extends PagingAndSortingRepository<Restaurant, Integer> {

}
