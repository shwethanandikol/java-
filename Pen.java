package com.xworkz.clonaeble;

public class Pen implements Cloneable {
private String name;
private int rate;
private String mfgDate;
private boolean refillable;
private String type;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getRate() {
	return rate;
}
public void setRate(int rate) {
	this.rate = rate;
}
public String getMfgDate() {
	return mfgDate;
}
public void setMfgDate(String mfgDate) {
	this.mfgDate = mfgDate;
}
public boolean isRefillable() {
	return refillable;
}
public void setRefillable(boolean refillable) {
	this.refillable = refillable;
}
public String getType() {
	return type;
}
public void setType(String type) {
	this.type = type;
}
@Override
public String toString() {
	return "Penapp [name=" + name + ", rate=" + rate + ", mfgDate=" + mfgDate + ", refillable=" + refillable + ", type="
			+ type + "]";
}
@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}

}


