package com.raj.java8features;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

class Java8FeaturesTest {

	@Test
	void staticMethodInInterface() {

		System.out.println(IVehicle.manufacturer());
	}

	@Test
	void defaultMethodInInterface() {

		Bus bus=new Bus();
		
		System.out.println(bus.getNumberOfTyre());
	}
	
	@Test
	void overrideDefaultMethodInInterface() {

		Auto auto=new Auto();
		
		System.out.println(auto.getNumberOfTyre());
	}
	
	@Test
	void methodReference() {

		Auto auto=new Auto();
		Bus bus=new Bus();
		
		List<IVehicle> vehicleList = Arrays.asList(auto,bus);
		boolean match=vehicleList.stream().anyMatch(v->v.getNumberOfTyre()==4);
		System.out.println("any match>>>"+match);
	}
}
