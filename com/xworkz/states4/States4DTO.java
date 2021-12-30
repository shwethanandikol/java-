package com.xworkz.states4;
import java.io.Serializable;


public class States4DTO implements Serializable {

	private int id;
	private String name;
	private int code;
	private String captial;

public States4DTO() {
}

public States4DTO(int id, String name, int code, String captial) {
	super();
	this.id = id;
	this.name = name;
	this.code = code;
	this.captial = captial;
}

public int getId() {
	return id;
}

public String getName() {
	return name;
}

public int getCode() {
	return code;
}

public String getCaptial() {
	return captial;
}

@Override
public String toString() {
	return "States4DTO [id=" + id + ", name=" + name + ", code=" + code + ", captial=" + captial + "]";
}

}



