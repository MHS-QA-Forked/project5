package oop.inheritance;

public class Bangladesh extends Cricket {

	int teamRanking;

	public void bangladeshTeamInfo() {
		// super.cricketTeamInfo();
		cricketTeamInfo();
		System.out.println("Team Ranking " + teamRanking);

	}

	@Override
	public void cricketTeamInfo() {
		System.out.println(cricketTeamName + " " + cricketTeamCaptain + " " + cricketTeamCoach);
	}

}
