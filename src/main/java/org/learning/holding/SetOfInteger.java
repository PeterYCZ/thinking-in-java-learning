package org.learning.holding;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class SetOfInteger {
    public static void main(String[] args) {
        Random rand = new Random(50);
        Set<Integer> intset = new HashSet<>();
        for(int i = 0;i<10000;i++){
            intset.add(rand.nextInt(40));
        }
        System.out.println(intset);
    }
}
