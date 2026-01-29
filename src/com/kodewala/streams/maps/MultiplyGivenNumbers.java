package com.kodewala.streams.maps;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MultiplyGivenNumbers {

	public static void main(String[] args) {

		// to transform all the elements we use map
		List<Integer> randomIntegers = Arrays.asList(1, 2, 3, 4);
		List<Integer> multiplyIntegers = randomIntegers.stream().map(i -> i * 5).collect(Collectors.toList());
		System.out.println(multiplyIntegers);
	}

}
