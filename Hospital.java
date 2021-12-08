package com.xworkz.clonaeble;
public class Hospital  implements Cloneable{
private String name;
private String address;
private String gstNo;
private String owner;
private boolean isOpen;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public String getGstNo() {
	return gstNo;
}
public void setGstNo(String gstNo) {
	this.gstNo = gstNo;
}
public String getOwner() {
	return owner;
}
public void setOwner(String owner) {
	this.owner = owner;
}
public boolean isOpen() {
	return isOpen;
}
public void setOpen(boolean isOpen) {
	this.isOpen = isOpen;
}
@Override
public String toString() {
	return "Hospital [name=" + name + ", address=" + address + ", gstNo=" + gstNo + ", owner=" + owner + ", isOpen="
			+ isOpen + "]";
}
@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
}


