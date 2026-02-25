package com.kodewala.streams.practicev2;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class PrintLengthOfAllWordsInASentence {

	public static void main(String[] args) {

		// just printing not storing
		String str = "Hello, how are you doing today";
		Arrays.stream(str.split(" ")).forEach(w -> System.out.println("Length of " + w + " : " + w.length()));

		System.out.println("--------------------------");

		// storing in a map <String,Integer>
		Map<String, Integer> map = Arrays.stream(str.split(" "))
				.collect(Collectors.toMap(word -> word, word -> word.length()));
		map.forEach((k, v) -> System.out.println("Length of " + k + " : " + v));
	}

}
