package oop.inheritance;

public class Emp {
	int id;
	String name;
	Address address;// Aggregation / Reference Variable

	public Emp(int id, String name, Address address) {
		this.id = id;
		this.name = name;
		this.address = address;
	}

	void display() {
		System.out.println(id + " " + name + " " + address.city + " " + address.state + " " + address.country);
//		System.out.println(address.city + " " + address.state + " "+address.country);
	}
}
