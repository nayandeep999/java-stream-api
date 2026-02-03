package com.kodewala.streams.practice;

import java.util.stream.Stream;

public class PrintStrByLetters {

	public static void main(String[] args) {
		String str = "name";
		Stream<Character> letters = str.chars().mapToObj(c -> (char) c);
		letters.forEach(c -> System.out.println(c));

	}

}
