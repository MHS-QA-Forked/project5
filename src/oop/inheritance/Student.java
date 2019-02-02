package oop.inheritance;

public class Student extends StudentParents {
    int stID;
    String stName, stAddress;

    public void stInfo() {
        System.out.println("Student ID: " + stID + " Student Name: " + stName + " Student Address: " + stAddress);
        stParents();
    }

}
