package com.xworkz.streams;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Birthyear{
	public static void main(String[] args) {
		Stream<Integer> birthYearStream=Stream.of(1996,2021,2000,2005,1994,1997,1945,1987,1992,2017,2015,2014,2004,2009,2003,2007,2006,1995,2002,2020);
		List<Integer> tempList=birthYearStream
		           .filter((p)->p>1996)
		           .sorted()
		           .collect(Collectors.toList());
		           tempList.forEach((p)->System.out.println(p));
	}

}

