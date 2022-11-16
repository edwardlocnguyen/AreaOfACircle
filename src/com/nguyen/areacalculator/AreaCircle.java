package com.nguyen.areacalculator;

public class AreaCircle {

	public static double area;
	public static double radius = 1;
	public static double PI = 3.14;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		calcAreaOfCircle(PI, radius);
		displayArea();
		
	}
	
	public static void calcAreaOfCircle(double PI, double radius) {
		area = PI * (radius * radius);
	}

	public static void displayArea() {
		System.out.println(area);
	}
	
}
