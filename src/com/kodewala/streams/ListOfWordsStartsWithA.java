package com.kodewala.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ListOfWordsStartsWithA {

	public static void main(String[] args) {
		ArrayList<String> words = new ArrayList<String>();
		words.add("Hello");
		words.add("Apple");
		words.add("Aeroplane");
		words.add("Aeroplane");

		// Returns stream object
		Stream<String> stream = words.stream();

		// Intermediate operation (Lazy) -> again returns stream object
		Stream<String> filteredStream = stream.filter(w -> w.startsWith("A"));

		// Intermediate operation (Lazy) -> again returns stream object
		Stream<String> upperCaseStream = filteredStream.map(w -> w.toUpperCase());

		// Terminal operation (Not Lazy) -> it returns you a collection -> terminates
		// the stream api
		List<String> resultOg = upperCaseStream.collect(Collectors.toList());

		System.out.println(resultOg);

		List<String> result = words.stream().filter(w -> w.startsWith("A")).map(w -> w.toUpperCase())
				.collect(Collectors.toList());

		// Have unique values due to set (set of strings)
		Set<String> resultSet = words.stream().filter(w -> w.startsWith("A")).map(w -> w.toUpperCase())
				.collect(Collectors.toSet());

		System.out.println(resultSet);

		// System.out.println(result);
	}

}
