package com.kodewala.streams.practice;

import java.util.List;

public class StrToChr {

	public static void main(String[] args) {
		String name = "demo";
		List<Character> listOfChar = name.chars().mapToObj(c -> (char) c).toList();
		listOfChar.forEach(System.out::println);
	}

}
