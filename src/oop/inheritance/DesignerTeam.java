package oop.inheritance;

public class DesignerTeam extends Designer {

	private String dTeamLeader;
	private String dTeamName;

	public String dTeamLocation;
	public String dTeamAddress;

	public void dTeamInfo() {
		System.out.println(dTeamLocation);
		System.out.println(dTeamAddress);
	}

	public void designerWithLeader() {
//		System.out.println(getdName());
//		System.out.println(getdAge());
//		System.out.println(getdMobile());
//		System.out.println(getdTeamLeader());
		System.out.println(getdName() + " " + getdAge() + " " + getdMobile() + " " + getdTeamLeader());
	}

	@Override
	public void designerInfo() {
		super.designerInfo();
		System.out.println("Designer Info Details");
	}

	// Getter Setter

	public String getdTeamLeader() {
		return dTeamLeader;
	}

	public void setdTeamLeader(String dTeamLeader) {
		this.dTeamLeader = dTeamLeader;
	}

	public String getdTeamName() {
		return dTeamName;
	}

	public void setdTeamName(String dTeamName) {
		this.dTeamName = dTeamName;
	}

	public String getdTeamLocation() {
		return dTeamLocation;
	}

	public void setdTeamLocation(String dTeamLocation) {
		this.dTeamLocation = dTeamLocation;
	}

	public String getdTeamAddress() {
		return dTeamAddress;
	}

	public void setdTeamAddress(String dTeamAddress) {
		this.dTeamAddress = dTeamAddress;
	}

}
