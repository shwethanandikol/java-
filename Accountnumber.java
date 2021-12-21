package com.xworkz.streams;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Accountnumber {
public static void main(String[] args) {
	Stream<Long> accountNoStream=Stream.of(765544098776L,123677965359L,567809870432L,379087659076L,653456780987L,190765780984L,106787690987L,224567896549L,214367803214L,543215678906L,456789087654L,421167888767L,6556454457888L,4500078999655L,364646914567900L,69805346545788L,9654454334677L,6778898909790L,435678897897L,2226787689997L);
	List<Long> tempList=accountNoStream
	           .filter((p)->p>700000000000L)
	           .sorted()
	           .collect(Collectors.toList());
	           tempList.forEach((p)->System.out.println(p));
}
}
