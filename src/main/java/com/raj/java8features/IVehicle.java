package com.raj.java8features;

public interface IVehicle {

	static String manufacturer() {

		return "Raj Vehicles";
	}

	default int getNumberOfTyre() {

		return 4;
	}
	
	public String getVehicleName();
}
