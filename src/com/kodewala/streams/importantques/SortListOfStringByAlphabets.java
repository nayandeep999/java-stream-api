package com.kodewala.streams.importantques;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SortListOfStringByAlphabets {

	public static void main(String[] args) {
		List<String> randomNames = Arrays.asList("Nayandeep", "Satrugan", "Sambu", "Ram", "Baharat", "Lakshman");
		List<String> sortedListByAlphabetsRev = randomNames.stream()
				.sorted(Comparator.reverseOrder()/* (a,b) -> b.compareTo(a) */).toList();
		System.out.println("Reverse order: " + sortedListByAlphabetsRev);
		List<String> sortedListByAlphabets = randomNames.stream().sorted().toList();
		System.out.println("Normal ascending order: " + sortedListByAlphabets);
	}

}
