package com.xworkz.streams;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
public class Area {

public static void main(String[] args) {


	Stream<String> areaStream=Stream.of("Rajajinagar","Gayatri nagar","Ganesh nagar","Basava nagar","Vidya nagar","Jayanagar","Kormangal","Malleshwaram","Sadashivanagar","Maruthi nagar","HSR Layout","Chamundeshwari layout","Mahalaxmi layout","Basavangudi","Indira nagar","Akshay nagar","BCC Layout","Nagarbhavi","BTM Layout","WhiteField");
	List<String> tempList=areaStream
	           .map(String::toLowerCase)
	           .sorted()
	           .collect(Collectors.toList());
	           tempList.forEach((p)->System.out.println(p));

	 System.out.println("============");
	 System.out.println("Areas in descending order");

	 Stream<String> areaStream1=Stream.of("Rajajinagar","Gayatri nagar","Ganesh nagar","Basava nagar","Vidya nagar","Jayanagar","Kormangal","Malleshwaram","Sadashivanagar","Maruthi nagar","HSR Layout","Chamundeshwari layout","Mahalaxmi layout","Basavangudi","Indira nagar","Akshay nagar","BCC Layout","Nagarbhavi","BTM Layout","WhiteField");
	 List<String> tempList1=areaStream1
	       	           .map(String::toUpperCase)
	       	           .sorted(Collections.reverseOrder())
	       	           .collect(Collectors.toList());
	       	           tempList1.forEach((p)->System.out.println(p));
}
}
