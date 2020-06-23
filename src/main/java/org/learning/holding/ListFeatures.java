package org.learning.holding;

import java.util.*;

public class ListFeatures {
    public static void main(String[] args) {

        List<Integer> a = new ArrayList<>(Arrays.asList(1,2,3,4,5));
        List<Integer> b = new ArrayList<>(Arrays.asList(1,2,3,4,5));
        System.out.println( a.contains(b));
        List<String> x = new ArrayList<>();
        String y = "test";
        x.add(y);
        String test = "test";
        System.out.println(x.contains(test));

    }
}
