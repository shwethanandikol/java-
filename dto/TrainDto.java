package com.xworkz.train.dto;

public class TrainDto {
	private Integer id;
	private Integer trainNo;
	private String boarding;
	private String destination;
	private Integer seatno;
	private Integer price;
	private String cls;
	private String name;

	public TrainDto(Integer id, Integer trainNo, String boarding, String destination, Integer seatno, Integer price,
			String cls, String name) {
		super();
		this.id = id;
		this.trainNo = trainNo;
		this.boarding = boarding;
		this.destination = destination;
		this.seatno = seatno;
		this.price = price;
		this.cls = cls;
		this.name = name;
	}

	public TrainDto() {
		// TODO Auto-generated constructor stub
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getTrainNo() {
		return trainNo;
	}

	public void setTrainNo(Integer trainNo) {
		this.trainNo = trainNo;
	}

	public String getBoarding() {
		return boarding;
	}

	public void setBoarding(String boarding) {
		this.boarding = boarding;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public Integer getSeatno() {
		return seatno;
	}

	public void setSeatno(Integer seatno) {
		this.seatno = seatno;
	}

	public Integer getPrice() {
		return price;
	}

	public void setPrice(Integer price) {
		this.price = price;
	}

	public String getCls() {
		return cls;
	}

	public void setCls(String cls) {
		this.cls = cls;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		String trainNo = null;
		return "TrainDto [id=" + id + ", trainNo=" + trainNo + ", boarding=" + boarding + ", destination=" + destination
				+ ", seatno=" + seatno + ", price=" + price + ", cls=" + cls + ", name=" + name + "]";
	}

	public void setSeatno(String string) {
		// TODO Auto-generated method stub
		
	}
}
