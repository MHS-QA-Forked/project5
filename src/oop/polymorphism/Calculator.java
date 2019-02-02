package oop.polymorphism;

public class Calculator {

//	Method Overloading: Methods names are same in a class but parameter in different order.

	public int areaOfLand(int a, int b) {
		int rs = a + b;
		return rs;
	}

	public int areaOfLand(int a, int b, int c) {
		int rs = a + b + c;
		return rs;
	}

	public int areaOfLand(int a, int b, int c, int d) {
		int rs = a + b + c + d;
		return rs;
	}

	public int areaOfLand(int a, String b) {
		int rs = a;
		return rs;
	}

	public int areaOfLand(String b, int a) {
		int rs = a;
		return rs;
	}

	public void show(String name, int mobile) {

	}

	public void show(String address, String school) {

	}

}
