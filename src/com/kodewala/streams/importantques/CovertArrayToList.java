package com.kodewala.streams.importantques;

import java.util.Arrays;
import java.util.List;

public class CovertArrayToList {
	public static void main(String[] args) {
		List<List<String>> nestedWords = Arrays.asList(Arrays.asList("apple", "banana", "cherry"),
				Arrays.asList("dog", "cat", "mouse"), Arrays.asList("red", "green", "blue"));

		System.out.println("Nested list: " + nestedWords);

		List<String> flattendList = nestedWords.stream().flatMap(w -> w.stream()).toList();
		System.out.println("Flattened list: " + flattendList + "\n");

		String[][] nestedWordsArr = { { "apple", "banana", "cherry" }, { "dog", "cat", "mouse" },
				{ "red", "green", "blue" } };

		List<List<String>> nestedArrToNestedList = Arrays.stream(nestedWordsArr).map(arr -> Arrays.asList(arr))
				.toList();
		System.out.println("Nested arrays to nested list: " + nestedArrToNestedList + "\n");

		List<String> flattenedList = Arrays.stream(nestedWordsArr).flatMap(arr -> Arrays.stream(arr)).toList();
		System.out.println("Flattened list using flatmap: " + flattendList);

	}
}
