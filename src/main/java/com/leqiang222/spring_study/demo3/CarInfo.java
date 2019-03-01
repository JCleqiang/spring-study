package com.leqiang222.spring_study.demo3;

public class CarInfo {
	private String name;
	
	public String getName() {
		return "摩托车";
	}
	
	public Double calculatorPrice(){
		return Math.random() * 3000;
	}
}
