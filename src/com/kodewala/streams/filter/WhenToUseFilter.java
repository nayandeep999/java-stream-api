package com.kodewala.streams.filter;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class WhenToUseFilter {

	public static void main(String[] args) {
		// find the words whose length is grater than 3
		List<String> randomWords = Arrays.asList("hello", "hi", "noon");
		List<String> output = randomWords.stream().filter(w -> (w.length() > 3)).collect(Collectors.toList());
		System.out.println(output);
	}

}
