package com.raj.streams;

import java.util.Arrays;
import java.util.List;

//https://www.baeldung.com/java-8-streams
public class StreamsSample {

	public void arrayListLambda() {

		List<String> alphabets = Arrays.asList("a", "b", "c");

//		for (String alphabet : alphabets) {
//
//			System.out.println(alphabet);
//		}

		alphabets.stream().forEach(System.out::println);
		
		

	}
}
