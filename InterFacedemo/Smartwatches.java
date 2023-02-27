package com.project.InterfaceDemo;

public class Smartwatches implements GpsInterface{
	@Override
	public void getCoordinates() {
		System.out.println("Getting  Smartwatch Detailed Coordinates");
	}

	@Override
	public void start() {
		System.out.println("Turning on the Gps of smartwatch");
		
	}

	@Override
	public void stop() {
		System.out.println("Turning off the Gps of smartwatch");
		
	}
}
