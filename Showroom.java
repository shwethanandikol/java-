package com.xworkz.clonaeble;

	public class Showroom implements Cloneable {
	private String name;
	private String id;
	private String gst;
	private boolean sales;
	private char hint;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getGst() {
		return gst;
	}
	public void setGst(String gst) {
		this.gst = gst;
	}
	public boolean isSales() {
		return sales;
	}
	public void setSales(boolean sales) {
		this.sales = sales;
	}
	public char getHint() {
		return hint;
	}
	public void setHint(char hint) {
		this.hint = hint;
	}
	@Override
	public String toString() {
		return "Showroom [name=" + name + ", id=" + id + ", gst=" + gst + ", sales=" + sales + ", hint=" + hint + "]";
	}

	@Override
		public  Object clone() throws CloneNotSupportedException {
			// TODO Auto-generated method stub
			return super.clone();
		}
	}

