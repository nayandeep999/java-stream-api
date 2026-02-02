package com.kodewala.streams.importantques;

import java.util.Arrays;
import java.util.List;

public class FindTheLowestInList {

	public static void main(String[] args) {
		List<List<Integer>> listOfDup = Arrays.asList(Arrays.asList(1, 1, 265, 289, 514, 514, 00, 0),
				Arrays.asList(10, 20, 52, 52, 999, 10181, 10));

		System.out.println("Non flattened array with duplicates: " + listOfDup);

		List<Integer> noDupAndSorted = listOfDup.stream().flatMap(i -> i.stream()).distinct().sorted().toList();
		System.out.println("No duplicates & sorted array: " + noDupAndSorted);

		int lowestNum = noDupAndSorted.stream().findFirst().get();
		System.out.println("Lowest num: " + lowestNum);

		int secondLowest = noDupAndSorted.stream().skip(1).findFirst().get();
		System.out.println("Second lowest: " + secondLowest);

		int thirdLowest = noDupAndSorted.stream().skip(2).findFirst().get();
		System.out.println("Third lowest: " + thirdLowest);

	}

}
