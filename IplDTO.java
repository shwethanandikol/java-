package com.xworkz.crud;

public class IplDTO {
	public static void main(String[] args) {
		IplDAO dao =new IplDAO();
		dao.save("CHENNAI SUPER KINGS");
		dao.save("ROYAL CHALLENGERS BANGLORE");
		dao.save(" KOLKATTA KNIGHT RIGHTERS");
		dao.save("RAJASTAAN ROYALS");
		dao.save("KINGS 11 PUNJAB");
		boolean found = dao.find("CHENNAI SUPER KINGS");
		System.out.println(found);
		found=dao.findByCaseInsensitive("CHENNAI SUPER KINGs");
		System.out.println(found);
		found=dao.findByCaseInSensitiveAndTrimmed("CHENNAISUPER KINGS");
		System.out.println(found);
	}
	}

