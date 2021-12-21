package com.xworkz.streams;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Rollnumber {
	public static void main(String[] args) {
		Stream<Integer> rollNoStream=Stream.of(2,51,15,20,16,19,16,25,67,27,10,42,61,89,11,18,56,84,38,33,49);
		List<Integer> tempList=rollNoStream
				.filter((p)->p>50)
				.sorted(Collections.reverseOrder())
				.collect(Collectors.toList());
		tempList.forEach((p)->System.out.println(p));
	}

}

