package oop.inheritance;

public class TestMain {

    public static void main(String[] args) {

        Teacher tc = new Teacher();
        tc.name = "karim";
        tc.age = 21;
        tc.qualification = "MSC in CSE";
        // tc.disInfo();
        tc.disInfo1();
        tc.name = "jamil";
        tc.age = 31;
        tc.qualification = "BSC in CSE";
        tc.disInfo1();

        DesignerTeam dTeam = new DesignerTeam();
        dTeam.dAddress = "Queens , NY";
        dTeam.dMobile = "016816694";
        dTeam.designerInfo();
        dTeam.dTeamAddress = "80 Ave apt#125 ";
        dTeam.dTeamLocation = "Elmhurst,Queens,NY";
        dTeam.dTeamInfo();

        System.out.println("*****************");

        dTeam.setdName("Mrs John");
        dTeam.setdAge(25);
        dTeam.setdMobile("017155698");
        dTeam.setdTeamLeader("Mr William");
//		dTeam.designerInfo();
//		dTeam.dTeamInfo();

//		System.out.println(
//				dTeam.getdName() + " " + dTeam.getdAge() + " " + dTeam.getdMobile() + " " + dTeam.getdTeamLeader());

        dTeam.designerWithLeader();

        // instance of means object. dTeam is the object of Designer because
        // DesignerTeam extends Designer.
        System.out.println(dTeam instanceof Designer);
        System.out.println(dTeam instanceof DesignerTeam);
        System.out.println("***************************************");


        StudentParents studentParents = new StudentParents();
        studentParents.stMother = "Mrs Alex";
        studentParents.stFather = "Mr Alex";
        studentParents.stParents();

        Student student = new Student();
        student.stFather = "Mr Jack";
        student.stMother = "Mrs Jack";
        student.stParents();


        // Aggregate
        Address address1 = new Address("Queens", "New York", "USA");
        Address address2 = new Address("gno", "UP", "india");

        Emp e = new Emp(111, "varun", address1); // Aggregate used in here
        Emp e2 = new Emp(112, "arun", address2);

        e.display();
        e2.display();

        System.out.println("*****************");

        Argentina arg = new Argentina();
        arg.fbteamRank = "1";
        arg.fbteamName = "Argentina";
        arg.argentina();
        arg.fbteamInfo();

        System.out.println("*****************");

        Bangladesh bd = new Bangladesh();
        bd.teamRanking = 8;
        bd.cricketTeamName = "Bangladesh";
        bd.cricketTeamCaptain = "Mushfiqur Rahman";
        bd.cricketTeamCoach = "David Whitemore";
        bd.bangladeshTeamInfo();
    }

}
