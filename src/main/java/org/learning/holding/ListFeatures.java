package org.learning.holding;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class ListFeatures {
    public static void main(String[] args) {

        List<Integer> a = new ArrayList<>(Arrays.asList(1,2,3,4,5));
        List<Integer> b = new ArrayList<>(Arrays.asList(1,2,3,4,5));
        System.out.println( a.contains(b));
    }
}
