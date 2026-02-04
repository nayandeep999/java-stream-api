package com.kodewala.streams.practice;

import java.util.Map;
import java.util.stream.Collectors;

public class GetFreqOfEachCharatersInString {

	public static void main(String[] args) {
		String str = "Nayandeep";
		Map<Character, Long> map = str.chars().mapToObj(c -> (char) c)
				.collect(Collectors.groupingBy(c -> c, Collectors.counting()));
		System.out.println(map);
	}

}
