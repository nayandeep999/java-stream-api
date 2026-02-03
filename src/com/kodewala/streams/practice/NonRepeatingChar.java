package com.kodewala.streams.practice;

import java.util.Arrays;
import java.util.List;

public class NonRepeatingChar {

	public static void main(String[] args) {
		String str = "nayandeep";

		// str.chars().forEach(e -> System.out.println(e));
		// returns IntStream (integer of streams basically ascii // numbers)

		List<Character> strToCharList = str.chars().mapToObj(e -> (char) e).toList();
		System.out.println(str);
		System.out.println(strToCharList);

		char firstNonRepeatingChar = strToCharList.stream().filter(c -> str.indexOf(c) == str.lastIndexOf(c))
				.findFirst().get();
		System.out.println("First Non Repeating Char: " + firstNonRepeatingChar);

		char secondNonRepeatingChar = strToCharList.stream().filter(c -> str.indexOf(c) == str.lastIndexOf(c)).skip(1)
				.findFirst().get();

		System.out.println("Second Non Repeating Char: " + secondNonRepeatingChar);

		char thirdNonRepeatingChar = strToCharList.stream().filter(c -> str.indexOf(c) == str.lastIndexOf(c)).skip(2)
				.findFirst().get();

		System.out.println("Third Non Repeating Char: " + thirdNonRepeatingChar);

	}

}
