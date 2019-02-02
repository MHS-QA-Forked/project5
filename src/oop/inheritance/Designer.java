package oop.inheritance;

public class Designer {

	private String dName;
	private String dDob;
	private int dAge;

	String dAddress;
	String dMobile;

	public void designerInfo() {
		System.out.println(dAddress);
		System.out.println(dMobile);

	}

	public String getdName() {
		return dName;
	}

	public void setdName(String dName) {
		this.dName = dName;
	}

	public String getdDob() {
		return dDob;
	}

	public void setdDob(String dDob) {
		this.dDob = dDob;
	}

	public int getdAge() {
		return dAge;
	}

	public void setdAge(int dAge) {
		this.dAge = dAge;
	}

	public String getdAddress() {
		return dAddress;
	}

	public void setdAddress(String dAddress) {
		this.dAddress = dAddress;
	}

	public String getdMobile() {
		return dMobile;
	}

	public void setdMobile(String dMobile) {
		this.dMobile = dMobile;
	}

}
