package com.kodewala.streams.practicev2;

public class CheckNonReapeatingChar {

	public static void main(String[] args) {

		String str = "nayandeep";
		System.out.println("Original string: " + str);

		char firstNonRepeatingChar = str.chars().mapToObj(c -> (char) c)
				.filter(c -> str.indexOf(c) == str.lastIndexOf(c)).findFirst().get();
		System.out.println("First non repeating char: " + firstNonRepeatingChar);

		char secondNonRepeatingChar = str.chars().mapToObj(c -> (char) c)
				.filter(c -> str.indexOf(c) == str.lastIndexOf(c)).skip(1).findFirst().get();
		System.out.println("Second non repeating char: " + secondNonRepeatingChar);

		char thirdNonRepeatingChar = str.chars().mapToObj(c -> (char) c)
				.filter(c -> str.indexOf(c) == str.lastIndexOf(c)).skip(2).findFirst().get();
		System.out.println("Third non repeating char: " + thirdNonRepeatingChar);
	}

}
