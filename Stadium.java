package com.xworkz.clonaeble;

public class Stadium implements Cloneable {

		private String name;
		private int occupancy;
		private String location;
		private boolean isOpen;
		private String area;
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getOccupancy() {
			return occupancy;
		}
		public void setOccupancy(int occupancy) {
			this.occupancy = occupancy;
		}
		public String getLocation() {
			return location;
		}
		public void setLocation(String location) {
			this.location = location;
		}
		public boolean isOpen() {
			return isOpen;
		}
		public void setOpen(boolean isOpen) {
			this.isOpen = isOpen;
		}
		public String getArea() {
			return area;
		}
		public void setArea(String area) {
			this.area = area;
		}
		@Override
		public String toString() {
			return "Stadium [name=" + name + ", occupancy=" + occupancy + ", location=" + location + ", isOpen=" + isOpen
					+ ", area=" + area + "]";
		}
	 @Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
		
	}

