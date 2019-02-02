package oop.inheritance;

public class StudentParents extends StudentSchool {
    String stFather, stMother;

    public void stParents() {
        System.out.println("Student Father Name: " + stFather + " Student Mother Name: " + stMother);
        super.stSchool();

    }
}
