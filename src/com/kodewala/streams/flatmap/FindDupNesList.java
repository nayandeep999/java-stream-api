package com.kodewala.streams.flatmap;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindDupNesList {

	public static void main(String[] args) {
		List<List<Integer>> dupArr = Arrays.asList(Arrays.asList(1, 2, 3, 4, 6, 6), Arrays.asList(2, 2, 3, 4, 6, 6),
				Arrays.asList(1, 2, 4, 4, 6, 6));

		Set<Integer> res = new HashSet<Integer>();
		List<Integer> noDupList = dupArr.stream().flatMap(list -> list.stream()).filter(w -> res.add(w)).toList();
		System.out.println(noDupList);

	}

}
