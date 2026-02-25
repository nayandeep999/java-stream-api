package com.kodewala.streams.practicev2;

import java.util.Arrays;
import java.util.List;

public class SplitWordsFromASentence {

	public static void main(String[] args) {

		String str = "Hello! I'm Nayandeep nice to meet you.";

		List<String> splittedWords = Arrays.stream(str.split(" ")).toList();
		splittedWords.forEach(w -> System.out.println(w));

	}

}
