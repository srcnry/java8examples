package com.missingartifacts.lambdaexamples;

import com.missingartifacts.objectstouse.Student;
import com.missingartifacts.objectstouse.StudentUtils;

import java.util.*;

import static java.util.Comparator.*;

public class SortingTest {

    public static void main(String[] args){
        List<Student> listOfStudents = createStudentList();
        System.out.println("list before sorting");
        // before sorting
        listOfStudents.forEach(System.out::println);

        //sort by Name
        //listOfStudents = sortByGPA(listOfStudents);
        //listOfStudents = sortByNamewithLambaExp(listOfStudents);

        sortByGPAwithLambaExp(listOfStudents);
        System.out.println("List after sorting");
        // after sorting classical way of printing
        /*for (Student s: listOfStudents) {
            System.out.println(s.toString());
        }*/
        // java 8 equivalent of printing a list
        listOfStudents.forEach(System.out::println);
    }
    public static List<Student> createStudentList(){
        return StudentUtils.createStudentList();
    }

    public static List<Student> sortByName(List<Student> listOfStudents){
        Collections.sort(listOfStudents, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getFirstName().compareTo(o2.getFirstName());
            }
        });

        return listOfStudents;
    }

    public static List<Student> sortByGPA(List<Student> listOfStudents){
        Collections.sort(listOfStudents, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                if(o1.getGPA() > o2.getGPA())  return 1;
                if(o1.getGPA() < o2.getGPA())  return -1;

                return 0;
            }
        });
        return listOfStudents;
    }

    public static void sortByNamewithLambaExp(List<Student> studentList) {
        studentList.sort(comparing(Student::getFirstName));
    }

    public static void sortByGPAwithLambaExp(List<Student> studentList) {
        studentList.sort(comparingDouble(Student::getGPA));
    }
}
