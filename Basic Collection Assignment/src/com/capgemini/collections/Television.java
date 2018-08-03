package com.capgemini.collections;

public class Television {
	String company;
	String type;
	boolean is3DEnabled;
	int price;

	public Television(String company, String type, boolean is3DEnabled, int price) {
		this.company = company;
		this.type = type;
		this.is3DEnabled = is3DEnabled;
		this.price = price;
	}

	@Override
	public String toString() {
		return "Television [company=" + company + ", type=" + type + ", is3DEnabled=" + is3DEnabled + ", price=" + price
				+ "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((company == null) ? 0 : company.hashCode());
		result = prime * result + (is3DEnabled ? 1231 : 1237);
		result = prime * result + price;
		result = prime * result + ((type == null) ? 0 : type.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Television other = (Television) obj;
		if (company == null) {
			if (other.company != null)
				return false;
		} else if (!company.equals(other.company))
			return false;
		if (is3DEnabled != other.is3DEnabled)
			return false;
		if (price != other.price)
			return false;
		if (type == null) {
			if (other.type != null)
				return false;
		} else if (!type.equals(other.type))
			return false;
		return true;
	}

}
