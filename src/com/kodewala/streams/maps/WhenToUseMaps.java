package com.kodewala.streams.maps;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class WhenToUseMaps {
	public static void main(String[] args) {

		// we use map to transform all the elements
		// or change the state of the elements
		List<String> randomWords = Arrays.asList("hello", "hi", "how");
		List<Integer> lengthOfWords = randomWords.stream().map(w -> w.length()).collect(Collectors.toList());
		System.out.println(lengthOfWords);

	}

}
