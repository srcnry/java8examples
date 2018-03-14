package com.missingartifacts;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Arrays;
import java.util.stream.IntStream;

public class Filter {
    private static int[] values = {
            943, 522, 670, 154, 122, 531, 924, 735, 403, 952,
            664, 947, 217, 369, 103, 300, 784, 320, 307, 247,
            641, 985, 900, 824, 567, 325, 866, 572, 620, 722,
            318, 660, 821, 398, 287, 929, 746, 979, 504, 377,
            291, 571, 478, 390, 290, 731, 297, 598, 685, 112,
            941, 502, 221, 339, 637, 958, 622, 846, 586, 796,
            664, 451, 215, 681, 734, 104, 226, 819, 181, 174,
            554, 805, 816, 929, 955, 170, 607, 609, 634, 836,
            127, 367, 887, 608, 781, 816, 539, 581, 760, 329,
            406, 899, 492, 707, 712, 839, 455, 796, 656, 286};

    private static int threshold = 0;
    private static String type ="";

    public static void main(String[] args) {
        checkValuesInTraditionalWay();
    }

    private static void checkValuesInTraditionalWay(){

        readParameters();

        for (int i = 0; i < 100; i++) {
            checkValue(values[i]);
        }
        // JAVA 8 Stream API usage
        checkValuesWithStream();
    }

    private static void readParameters() {
        try {
            BufferedReader reader =
                    new BufferedReader(new FileReader("C:\\filter.txt")); // Upper;312

            String line = reader.readLine();

            type = line.split(";")[0];
            threshold = Integer.parseInt(line.split(";")[1]);

        } catch (Exception exception) {
            System.out.println("File not found");
        }
    }

    private static void checkValue(int value){
        if (type.equals("Upper")) {
            if (value >= threshold) {
                System.out.println(value + ": PASSED");
            }
            else {
                System.out.println(value + ": FAILED");
            }
        }
        else if (type.equals("Lower")) {
            if (value <= threshold ) {
                System.out.println(value + ": PASSED");
            }
            else {
                System.out.println(value + ": FAILED");
            }
        }
    }

    private static void checkValuesWithStream(){
        IntStream intStream = Arrays.stream(values);

        if (type.equals("Upper")) {
           intStream.forEach( i -> { if(i>= threshold){
                                        System.out.println(i + " : PASSED (Java 8)");
                                    } else {
                                        System.out.println(i + " : FAILED (java 8)");
                                    }
           });
        }
        else if (type.equals("Lower")) {
            intStream.forEach( i -> { if(i <= threshold){
                System.out.println(i + " : PASSED (Java 8)");
            } else {
                System.out.println(i + " : FAILED (Java 8)");
            }
            });
        }
    }
}


