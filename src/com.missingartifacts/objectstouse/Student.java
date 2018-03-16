package com.missingartifacts.objectstouse;

public class Student {

    private String firstName;
    private String lastName;
    private double GPA;
    private String gender ;

    public Student(String firstName, String lastName, double GPA, String gender ) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.GPA = GPA;
        this.gender = gender ;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public double getGPA() {
        return GPA;
    }

    public void setGPA(double GPA) {
        this.GPA = GPA;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", GPA=" + GPA +
                ", gender='" + gender + '\'' +
                '}';
    }
}
