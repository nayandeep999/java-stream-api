package com.kodewala.streams.flatmap;

import java.util.Arrays;
import java.util.List;

public class FindTheLowestNum {

	public static void main(String[] args) {
		List<List<Integer>> dupArr = Arrays.asList(Arrays.asList(11, 2, 3, 4, 66, 6), Arrays.asList(2, 2, 3, 4, 6, 6),
				Arrays.asList(1, 2, 4, 4, 6, 6));

		List<Integer> sortedAndNoDup = dupArr.stream().flatMap(list -> list.stream()).distinct().sorted().toList();

		System.out.println(sortedAndNoDup);

		int lowestNum = sortedAndNoDup.stream().findFirst().get();
		System.out.println("Lowest num: " + lowestNum);

		int secondLowest = sortedAndNoDup.stream().skip(1).findFirst().get();
		System.out.println("Second lowest: " + secondLowest);

		// find first is a terminal operation because it returns an object not stream
		int thirdLowest = sortedAndNoDup.stream().skip(2).findFirst().get();
		System.out.println("Third lowest: " + thirdLowest);
	}

}
