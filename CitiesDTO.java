package com.xworkz.cities;
import java.io.Serializable;


public class CitiesDTO implements Serializable {

	private int id;
	private String name;
	private long population;
	private String famous;

public CitiesDTO() {
}


public CitiesDTO(int id, String name, long population, String famous) {
	super();
	this.id = id;
	this.name = name;
	this.population = population;
	this.famous = famous;
}


public int getId() {
	return id;
}

public String getName() {
	return name;
}

public long getpopulation() {
	return population;
}

public String getfamous() {
	return famous;
}

@Override
public String toString() {
	return "CitiesDTO [id=" + id + ", name=" + name + ", population=" + population + ", famous=" + famous + "]";
}

}


