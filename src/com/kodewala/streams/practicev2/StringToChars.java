package com.kodewala.streams.practicev2;

public class StringToChars {

	public static void main(String[] args) {
		String str = "hello";
		str.chars().mapToObj(c -> (char) c).forEach(c -> System.out.println(c));
	}

}
