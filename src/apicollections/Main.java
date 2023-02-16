package apicollections;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<String> myList = new ArrayList<>();
        myList.add("Monday");
        myList.add("Tuesday");
        myList.add("Wednesday");
        myList.add("Thursday");
        myList.add("Friday");

        System.out.println("myList = " + myList);

        Set<Integer> mySet = new HashSet<>();
        mySet.add(17);
        mySet.add(15);
        mySet.add(22);
        mySet.add(23);
        // This code throws a warning
        // because a set can only have unique values
        // mySet.add(15);
        System.out.println("mySet = " + mySet);

        Map<String, Integer> myMap = new HashMap<>();
        myMap.put("Bolivia", 1);
        myMap.put("Chile", 24);

        System.out.println("myMap = " + myMap);

        int chileResult = myMap.get("Chile");
        System.out.println(".get(\"Chile\") = " + chileResult);

        // Iterating over the map
        myMap.forEach((k, v) -> System.out.println(k + " -> " + v));
        System.out.println(myMap.keySet());
        System.out.println(myMap.values());
        System.out.println(myMap.entrySet());
    }
}
