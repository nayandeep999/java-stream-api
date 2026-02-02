package com.kodewala.streams.importantques;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupingByLength {

	public static void main(String[] args) {
		List<String> words = List.of("apple", "banana", "cherry", "dog", "elephant", "flower", "guitar", "house", "ice",
				"jungle", "kite", "lemon", "mountain", "notebook", "orange", "pencil", "queen", "river", "sun", "tree");

		Map<Integer, List<String>> groupByLength = words.stream().collect(Collectors.groupingBy(word -> word.length()));
		System.out.println(groupByLength);

		Map<Integer, List<String>> groupLengthMoreThan4 = words.stream().filter(word -> word.length() >= 4)
				.collect(Collectors.groupingBy(w -> w.length()));
		System.out.println(groupLengthMoreThan4);

	}

}
