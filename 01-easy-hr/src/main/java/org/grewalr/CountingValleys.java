package org.grewalr;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;

import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class CountingValleys {

    public static int countingValleys(int steps, String path) {
        // Write your code here
        int seaLevel = 0;
        int level = 0;

        for (int i = 0; i < steps; i++) {
            if (path.charAt(i) == 'U') level++;
            if (path.charAt(i) == 'D') level--;
        }

        return -1;

    }

    public static void main(String[] args) throws IOException {
        List<Integer> array = new ArrayList<>();
        array.add(0);
        array.add(1);
        array.add(0);
        array.add(0);
        array.add(0);
        array.add(1);
        array.add(0);

        List<Integer> array2 = new ArrayList<>();
        array2.add(0);
        array2.add(0);
        array2.add(1);
        array2.add(0);
        array2.add(0);
        array2.add(1);
        array2.add(0);

        int result = CountingValleys.jumpingOnClouds(array);
        System.out.println(result);

        int result2 = CountingValleys.jumpingOnClouds(array2);
        System.out.println(result2);

    }
}

