package com.kodewala.streams.practicev2;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupWordsInASentenceByLength {

	public static void main(String[] args) {

		// Integer caching in java
		// Java caches Integer objects from -128 to 127 for performance.
		// For 127: Both a and b point to the same cached object, so == returns true
		// For 200: c and d are separate objects, so == returns false

		// Why does Java cache?
		// Small integers (-128 to 127) are used frequently in programs. Caching saves
		// memory by reusing objects instead of creating new ones.

		Integer a = 127;
		Integer b = 127;
		System.out.println("a == b :" + (a == b));

		Integer c = 200;
		Integer d = 200;

		// Best practice use equals on Integer wrapper class
		System.out.println("c == d :" + (c == d));

		System.out.println("c.equals(d): " + c.equals(d));

		String str = "Hello, how are you doing today";
		Map<Integer, List<String>> map = Arrays.stream(str.split(" ")).collect(Collectors.groupingBy(w -> w.length()));
		System.out.println(map);

	}

}
