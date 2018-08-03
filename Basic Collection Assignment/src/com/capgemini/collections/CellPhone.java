package com.capgemini.collections;

public class CellPhone {
	String company;
	String model;
	String description;
	String operatingSystem;
	float price;

	public CellPhone(String company, String model, String description, String operatingSystem, float price) {
		this.company = company;
		this.model = model;
		this.description = description;
		this.operatingSystem = operatingSystem;
		this.price = price;

	}

	@Override
	public String toString() {
		return "CellPhone [company=" + company + ", model=" + model + ", description=" + description
				+ ", operatingSystem=" + operatingSystem + ", price=" + price + "]";
	}

}
