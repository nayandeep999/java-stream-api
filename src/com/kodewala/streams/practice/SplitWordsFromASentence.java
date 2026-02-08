package com.kodewala.streams.practice;

import java.util.Arrays;

public class SplitWordsFromASentence {

	public static void main(String[] args) {
		String str = "Split this sentence and retrun the longest word";
		String longestWord = Arrays.stream(str.split(" ")).sorted((a, b) -> b.length() - a.length()).findFirst().get();
		System.out.println("Longest word in the sentence: " + longestWord);
	}

}
