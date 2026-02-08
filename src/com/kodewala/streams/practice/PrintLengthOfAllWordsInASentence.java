package com.kodewala.streams.practice;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class PrintLengthOfAllWordsInASentence {

	public static void main(String[] args) {
		String str = "Hello my name is Seema Sen Gupta";
		Map<String, Integer> map = Arrays.stream(str.split(" "))
				.collect(Collectors.toMap(word -> word, word -> word.length()));
		map.forEach((k, v) -> System.out.println("Length of " + k + " is: " + v));

		System.out.println("--------------------------");
		Arrays.stream(str.split(" ")).forEach(w -> System.out.println("The length of " + w + " is: " + w.length()));
	}

}
