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
        int level = 0;
        int valley = 0;

        for (int i = 0; i < steps; i++) {
            if (path.charAt(i) == 'U') level++;
            if (path.charAt(i) == 'D') level--;
            // if we just come up from valley
            if (level == 0 && path.charAt(i) == 'U') valley++;
        }



        return valley;

    }

    public static void main(String[] args) throws IOException {
//        int result = CountingValleys.countingValleys();
//        System.out.println(result);
//
//        int result2 = CountingValleys.countingValleys();
//        System.out.println(result2);

    }
}

