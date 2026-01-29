package com.kodewala.streams.practice;

import java.util.ArrayList;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamPractice1 {

	public static void main(String[] args) {
		ArrayList<String> subjects = new ArrayList<String>();
		subjects.add("CS");
		subjects.add("Maths");
		subjects.add("Science");

		Set<String> hs = subjects.stream().filter(s -> s.endsWith("s")).collect(Collectors.toSet());
		System.out.println(hs);
	}

}
