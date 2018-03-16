package com.missingartifacts.objectstouse;

import java.util.ArrayList;
import java.util.List;

public class StudentUtils {
    public static List<Student> createStudentList(){
        List<Student> result = new ArrayList<Student>();

        result.add(new Student("Mehmet","Koca",2.40,"M"));
        result.add(new Student("Sedef","Zeki",3.75,"F"));
        result.add(new Student("Deniz","Orta",2.85,"F"));
        result.add(new Student("Ahmet","Yuksek",3.45,"M"));

        return result;
    }
}
