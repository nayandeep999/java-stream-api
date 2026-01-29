package com.kodewala.streams.filter;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class WordsLengthGreaterThan5 {

	public static void main(String[] args) {
		List<String> randomWords = Arrays.asList("hello", "hi", "noon");
		List<String> output = randomWords.stream().filter(w -> (w.length() >= 5)).map(w -> w.toUpperCase())
				.collect(Collectors.toList());
		System.out.println(output);
	}

}
