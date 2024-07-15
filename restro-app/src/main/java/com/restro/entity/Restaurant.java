package com.restro.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Restaurant {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer restaurantId;
	private String restaurantName;
	private String restaurantCuisine;
	private String restaurantCity;

	public Restaurant() {
		// TODO Auto-generated constructor stub
	}

	public Restaurant(Integer restaurantId, String restaurantName, String restaurantCuisine, String restaurantCity) {
		super();
		this.restaurantId = restaurantId;
		this.restaurantName = restaurantName;
		this.restaurantCuisine = restaurantCuisine;
		this.restaurantCity = restaurantCity;
	}

	public Integer getRestaurantId() {
		return restaurantId;
	}

	public void setRestaurantId(Integer restaurantId) {
		this.restaurantId = restaurantId;
	}

	public String getRestaurantName() {
		return restaurantName;
	}

	public void setRestaurantName(String restaurantName) {
		this.restaurantName = restaurantName;
	}

	public String getRestaurantCuisine() {
		return restaurantCuisine;
	}

	public void setRestaurantCuisine(String restaurantCuisine) {
		this.restaurantCuisine = restaurantCuisine;
	}

	public String getRestaurantCity() {
		return restaurantCity;
	}

	public void setRestaurantCity(String restaurantCity) {
		this.restaurantCity = restaurantCity;
	}

	@Override
	public String toString() {
		return "Restaurant [restaurantId=" + restaurantId + ", restaurantName=" + restaurantName
				+ ", restaurantCuisine=" + restaurantCuisine + ", restaurantCity=" + restaurantCity + "]";
	}

}
