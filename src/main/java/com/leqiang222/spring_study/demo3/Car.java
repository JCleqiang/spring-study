package com.leqiang222.spring_study.demo3;

public class Car {
	private String name;
	private Double price;
	
	public Car(String name, Double price) {
		super();
		this.name = name;
		this.price = price;
	}

	@Override
	public String toString() {
		return "Car [name=" + name + ", price=" + price + "]";
	}
	
}
