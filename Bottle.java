package com.xworkz.clonaeble;

public class Bottle implements Cloneable {

	

		private String name;
		private int price;
		private String color;
		private int size;
		private boolean isVaccum;
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getPrice() {
			return price;
		}
		public void setPrice(int price) {
			this.price = price;
		}
		public String getColor() {
			return color;
		}
		public void setColor(String color) {
			this.color = color;
		}
		public int getSize() {
			return size;
		}
		public void setSize(int size) {
			this.size = size;
		}
		public boolean isVaccum() {
			return isVaccum;
		}
		public void setVaccum(boolean isVaccum) {
			this.isVaccum = isVaccum;
		}
		@Override
		public String toString() {
			return "Bottle [name=" + name + ", price=" + price + ", color=" + color + ", size=" + size + ", isVaccum="
					+ isVaccum + "]";
		}

		@Override
		public Object clone() throws CloneNotSupportedException {
			// TODO Auto-generated method stub
			return super.clone();
		}
	}


