package com.kodewala.streams.flatmap;

import java.util.Arrays;
import java.util.List;

public class FindTheHighestNumber {

	public static void main(String[] args) {
		List<List<Integer>> dupArr = Arrays.asList(Arrays.asList(1, 2, 3, 4, 6, 6), Arrays.asList(2, 2, 3, 4, 6, 6),
				Arrays.asList(1, 2, 4, 4, 6, 6));

		List<Integer> flattenedArr = dupArr.stream().flatMap(list -> list.stream()).toList();
		List<Integer> removedDup = flattenedArr.stream().distinct().toList();
		List<Integer> sortedArr = removedDup.stream().sorted((a, b) -> (b - a)).toList();

		System.out.println(sortedArr);

		int highestNum = sortedArr.stream().findFirst().get();
		System.out.println("Highest number: " + highestNum);

		int secondHighest = sortedArr.stream().skip(1).findFirst().get();
		System.out.println("Second highest: " + secondHighest);

		int thirdHighest = sortedArr.stream().skip(2).findFirst().get();
		System.out.println("Third highest: " + thirdHighest);

	}

}
