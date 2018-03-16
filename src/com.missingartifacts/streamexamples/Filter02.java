package com.missingartifacts.streamexamples;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Filter02 {
    public static void main(String args[]){
        List<String> programmingLanguages = Arrays.asList("Java","C#","Objective-C","Ruby","Python","Scala","JavaScript");

        List<String> result = programmingLanguages.stream()
                            .filter(pl -> pl.startsWith("J"))
                            .collect(Collectors.toList());

        result.forEach(System.out::println);
    }

}
