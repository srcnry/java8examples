package com.missingartifacts.streamexamples;

import com.missingartifacts.objectstouse.Student;
import com.missingartifacts.objectstouse.StudentUtils;

import java.util.List;

public class Filter03 {

    public static void main(String args[]){
        List<Student> students = StudentUtils.createStudentList();

        Student s1 = students.stream()
                    .filter(s->"Mehmet".equalsIgnoreCase(s.getFirstName()))
                    .findAny()
                    .orElse(null);

        System.out.println(s1.toString());

        Student s2 = students.stream()
                .filter(s->"Orta".equalsIgnoreCase(s.getLastName()))
                .findAny()
                .orElse(null);

        System.out.println(s2.toString());

    }
}
