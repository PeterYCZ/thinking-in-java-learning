package org.learning.holding;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class SetOperrations {
    public static void main(String[] args) {
        Set<String> set1 = new HashSet<>();
        Collections.addAll(set1,"A B C D E F G H I J K L".split(" "));
        set1.add("M");
        System.out.println("H: "+set1.contains("H"));
        System.out.println("N: "+set1.contains("N"));
        Set<String> set2 = new HashSet<>();
        Collections.addAll(set1,"H I J K L".split(" "));
        System.out.println("set2 in set1: "+set1.containsAll(set2));
        set1.remove("H");
        System.out.println("set1: "+set1);
        System.out.println("set2 in set1: "+set1.containsAll(set2));
        set1.removeAll(set2);
        System.out.println("set2 removed set1: "+set1);
        Collections.addAll(set1, "X Y Z".split(" "));
        System.out.println("'X Y Z' added to set1: " + set1);
    }

}
