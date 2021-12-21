package com.xworkz.streams;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PNR {
public static void main(String[] args) {
	Stream<Long> pnrStream=Stream.of(1234890876L,65790876908L,907987658903L,8342760921456L,1789074565432L,612690876504L,965678908765L,743890765478L,31245678907216L,976767890876890L,689864789065436L,238907654327L,9654087659087L,5123690908768L,312456767890L,6786545676L,8907689076L,56787644424L,4356789045L,8906547894L);
	List<Long> tempList=pnrStream
	           .filter((p)->p>4000000000L)
	           .sorted()
	           .collect(Collectors.toList());
	           tempList.forEach((p)->System.out.println(p));
}
}

