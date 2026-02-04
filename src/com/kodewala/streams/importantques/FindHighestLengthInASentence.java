package com.kodewala.streams.importantques;

import java.util.Arrays;

public class FindHighestLengthInASentence {
	public static void main(String[] args) {
		String str = "Hello I'm Nayandeep, Nice to meet you";
		String res = Arrays.stream(str.split(" ")).sorted((a, b) -> b.length() - a.length()).findFirst().get();
		System.out.println(res);

		str.chars().mapToObj(c -> (char) c).forEach(c -> System.out.println(c));
	}
}
