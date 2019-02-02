package oop.polymorphism;

public class ModernCalculator extends Calculator {
// Method Overriding: Method Name,Parameter,Return Type must be same as super class method and parameter order.

	@Override // Method override
	public int areaOfLand(int a, int b, int c, int d) {
		int rs = a + b + c + d - 1; // change in argument
		return rs;
	}

}
