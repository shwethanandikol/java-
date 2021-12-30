package com.xworkz.icecream;
import java.io.Serializable;


public class IcecreamDTO implements Serializable {

	private int id;
	private String name;
	private String flavour;
	private int price;

public IcecreamDTO() {
}


public IcecreamDTO(int id, String name, String flavour, int price) {
	super();
	this.id = id;
	this.name = name;
	this.flavour = flavour;
	this.price = price;
}


public int getId() {
	return id;
}

public String getName() {
	return name;
}

public String getFlavour() {
	return flavour;
}

public int getPrice() {
	return price;
}

@Override
public String toString() {
	return "IcecreamDTO [id=" + id + ", name=" + name + ", flavour=" + flavour + ", price=" + price + "]";
}
}

