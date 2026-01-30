package com.kodewala.streams.flatmap;

import java.util.Arrays;
import java.util.List;

public class WhenToUseFlatMap {

	public static void main(String[] args) {
		List<List<String>> twodArr = Arrays.asList(Arrays.asList("Hello", "Hi"), Arrays.asList("How", "Are", "You"));
		System.out.println("Input nested array: " + twodArr);

		// We use flat map to flatten the nested arrays or list
		List<String> flattenedArr = twodArr.stream().flatMap(e -> e.stream()).toList();
		System.out.println("Output flattened array: " + flattenedArr);

		// Now we can use normal map to transform all the elements
		List<String> output = flattenedArr.stream().map(e -> e.toLowerCase()).toList();

		System.out.println("Output lowercase: " + output);
	}

}
