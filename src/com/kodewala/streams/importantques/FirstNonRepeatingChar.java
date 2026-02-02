package com.kodewala.streams.importantques;

import java.util.ArrayList;
import java.util.List;

public class FirstNonRepeatingChar {

	public static void main(String[] args) {
		String str = "hheelloi";
		char[] charArray = str.toCharArray();
		List<Character> charList = new ArrayList<Character>();

		for (char c : charArray) {
			charList.add(c);
		}

		System.out.println("Input string arr: " + charList);

		char firstNonRepeatingChar = charList.stream().filter(w -> str.indexOf(w) == str.lastIndexOf(w)).findFirst()
				.get();

		List<Character> listOfChar = charList.stream().filter(w -> str.indexOf(w) == str.lastIndexOf(w)).toList();
		System.out.println("List of non repeating characters: " + listOfChar);
		System.out.println("First non repeating char: " + firstNonRepeatingChar);

	}

}
