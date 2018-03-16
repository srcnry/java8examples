package com.missingartifacts.streamexamples;

import com.missingartifacts.objectstouse.Student;
import com.missingartifacts.objectstouse.StudentUtils;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Filter05 {
    public static void main(String args[]) {
        List<Student> students = StudentUtils.createStudentList();

        Map<String,List<Student>> groupByGender =
                students.stream().collect(Collectors.groupingBy(Student::getGender));

        System.out.println(groupByGender);
    }
}
