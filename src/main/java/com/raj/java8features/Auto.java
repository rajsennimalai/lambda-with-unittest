package com.raj.java8features;

public class Auto implements IVehicle{

	@Override
	public String getVehicleName() {
		return "Auto";
	}
	
	@Override
	public int getNumberOfTyre() {
		
		return 3;
	}

}
