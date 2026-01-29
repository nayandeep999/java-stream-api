package com.kodewala.streams.filter;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

public class DuplicateArray {

	public static void main(String[] args) {
		List<Integer> randomIntegers = Arrays.asList(1, 2, 3, 4, 1);
		// List<Integer> sortedOutput =
		// randomIntegers.stream().sorted().collect(Collectors.toList());

		HashSet<Integer> duplicates = new HashSet<Integer>();

		List<Integer> output = randomIntegers.stream().filter(i -> !duplicates.add(i)).collect(Collectors.toList());
		System.out.println(output);

	}

}
