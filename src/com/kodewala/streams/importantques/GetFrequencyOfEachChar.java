package com.kodewala.streams.importantques;

import java.util.Map;
import java.util.stream.Collectors;

public class GetFrequencyOfEachChar {

	public static void main(String[] args) {
		String str = "Gaurav";
		Map<Character, Long> map = str.chars().mapToObj(e -> (char) e)
				.collect(Collectors.groupingBy(c -> c, Collectors.counting()));
		System.out.println(map);
	}

}
