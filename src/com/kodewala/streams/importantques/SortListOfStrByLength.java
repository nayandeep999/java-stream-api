package com.kodewala.streams.importantques;

import java.util.Arrays;
import java.util.List;

public class SortListOfStrByLength {

	public static void main(String[] args) {
		List<String> names = Arrays.asList("Nayandeep", "Agnish", "Aishwary", "Gaurav");
		List<String> sortedByLength = names.stream().sorted((a, b) -> b.length() - a.length()).toList();
		System.out.println(sortedByLength);

		// longest string in the list
		String longestString = sortedByLength.stream().findFirst().get();
		System.out.println(longestString);
	}

}
