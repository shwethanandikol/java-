package com.xworkz.waterfall;
import java.io.Serializable;
public class waterfallDTO implements Serializable {

	private int id;
	private String name;
	private String location;
	private int height;

public waterfallDTO() {
}

public waterfallDTO(int id, String name, String location, int height) {
	super();
	this.id = id;
	this.name = name;
	this.location = location;
	this.height = height;
}

public int getId() {
	return id;
}

public String getName() {
	return name;
}

public String getLocation() {
	return location;
}

public int getHeight() {
	return height;
}

@Override
public String toString() {
	return "waterfallDTO [id=" + id + ", name=" + name + ", location=" + location + ", height=" + height + "]";
}

}
