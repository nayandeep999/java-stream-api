package com.kodewala.streams.practice;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupingByLength {

	public static void main(String[] args) {
		List<String> randomWords = Arrays.asList("Momo", "Khokho", "Soho", "Nacho", "Khelo", "Solo");
		Map<Integer, List<String>> groupedByStrLength = randomWords.stream()
				.collect(Collectors.groupingBy(w -> w.length()));
		System.out.println(groupedByStrLength);

	}

}
