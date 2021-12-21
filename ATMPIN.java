package com.xworkz.streams;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ATMPIN {
	public static void main(String[] args) {
		Stream<Integer> pincodeStream=Stream.of(855102,577549,567313,577201,583103,560002,456897,787456,898723,345098,123456,678098,567098,234765,566679,345098,123450,456098,345456,456709,345876,890765);
List<Integer> tempList=pincodeStream
           .filter((p)->p>580000)
           .sorted()
           .collect(Collectors.toList());
           tempList.forEach((p)->System.out.println(p));
	}

}

