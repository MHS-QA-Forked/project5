package oop.polymorphism;

public class Student extends StudentSchool {
    String stName,stAddress,stFather,stContact;
    int stID;

    public void stInfo(String stName, String stAddress){
        System.out.println("Student Name: "+stName+" Student Address: "+stAddress);
    }
    public void stInfo(String stName, int stID){
        System.out.println("Student Name: "+stName+" Student ID: "+stID);
    }
    public void stInfo(int stID,String stName,String stFather){
        System.out.println("Student ID: "+stID+" Student Name: "+stName+" Student Father Name: "+stFather);
    }
    public void stInfo(String stName, String stAddress, String stFather, String stContact ){
        System.out.println("Student Name: "+stName+" Student Address: "+stAddress+" Student Father Name: "+stFather+" Student Contact :"+stContact);
    }

    @Override
    public void stSchool(String stSchoolName, String stSchoolAddress) {
        super.stSchool(stSchoolName, stSchoolAddress);
    }
}
