package com.kodewala.streams.maps;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MultiplyAndFilter {

	public static void main(String[] args) {
		List<Integer> randomIntegers = Arrays.asList(1, 2, 3, 4);
		List<Integer> output = randomIntegers.stream().map(i -> i * 5).filter(i -> i > 10).collect(Collectors.toList());
		System.out.println(output);
	}

}
