package com.example.demo;

import org.springframework.stereotype.Component;

@Component
public class Devices {
	public String getBrand_name() {
		return brand_name;
	}
	public void setBrand_name(String brand_name) {
		this.brand_name = brand_name;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	private String brand_name;
	private int quantity;
	public void trial() {
		System.out.println("Using the device");
	}
}
