package com.xworkz.festival;
import java.io.Serializable;


public class festivalDTO implements Serializable {

	private int id;
	private String name;
	private String month;
	private String god;

public festivalDTO() {
}


public festivalDTO(int id, String name, String month, String god) {
	super();
	this.id = id;
	this.name = name;
	this.month = month;
	this.god = god;
}


public int getId() {
	return id;
}

public String getName() {
	return name;
}

public String getMonth() {
	return month;
}

public String getGod() {
	return god;
}

@Override
public String toString() {
	return "festivalDTO [id=" + id + ", name=" + name + ", month=" + month + ", god=" + god + "]";
}

}
