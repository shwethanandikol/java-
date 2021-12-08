package com.xworkz.clonaeble;

public class BottleStater {


	public static void main(String[] args) throws CloneNotSupportedException {
		Bottle bottle =new Bottle();
		bottle.setColor("red");
		bottle.setName("CELLO");
		bottle.setPrice(1200);
		bottle.setSize(30);
		bottle.setVaccum(true);
		Object object = bottle.clone();
		Bottle bottle1 =(Bottle)object;
		System.out.print(bottle1);
	}
}


