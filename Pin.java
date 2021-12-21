package com.xworkz.streams;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Pin {
	public static void main(String[] args) {
		Stream<Integer> pincodeStream=Stream.of(585102,577549,587313,577201,573103,560002,456897,987456,898723,345098,123456,678098,567098,234765,566679,345098,123450,456098,345456,456709,345876,890765);
List<Integer> tempList=pincodeStream
           .filter((p)->p>580000)
           .sorted()
           .collect(Collectors.toList());
           tempList.forEach((p)->System.out.println(p));
	}


}

