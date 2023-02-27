package com.project.InterfaceDemo;

public class Smartphone implements GpsInterface {

	@Override
	public void getCoordinates() {
		System.out.println("Getting  Smartphone Detailed Coordinates");
	}

	@Override
	public void start() {
		System.out.println("Turning on the Gps of Smartphone");
		
	}

	@Override
	public void stop() {
		System.out.println("Turning off the Gps of smartphone");
		
	}

	
}
