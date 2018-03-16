package com.missingartifacts.streamexamples;

import com.missingartifacts.objectstouse.Student;
import com.missingartifacts.objectstouse.StudentUtils;

import java.util.List;
import java.util.stream.Collectors;

public class Filter04 {

    public static void main(String args[]) {
        List<Student> students = StudentUtils.createStudentList();

        List<Double> collect = students.stream()
                            .map(x -> x.getGPA())
                            .filter(x->x>3.0)
                            .collect(Collectors.toList());

        System.out.println(collect);

    }
}
