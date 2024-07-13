package collections;

import java.util.*;

public class TestCollections {
    public static void main(String[] args) {

        // List
        List<String> myList = new ArrayList<>();
        myList.add("Monday");
        myList.add("Tuesday");
        myList.add("Wednesday");
        myList.add("Thursday");
        myList.add("Friday");

        System.out.println("\tWith a for loop");
        for (String item : myList) {
            System.out.println("item = " + item);
        }

        System.out.println("\tWith a forEach loop");
        myList.forEach(item -> {
            System.out.println("item = " + item);
        });

        // Set
        Set<Integer> mySet = new HashSet<>();
        mySet.add(1);
        mySet.add(2);
        mySet.add(3);
        // Duplicates are not allowed
        // mySet.add(3);

        System.out.println("\tPrinting mySet");
        printCollection(mySet);

        // Map
        Map<String, Integer> myMap = new HashMap<>();
        myMap.put("Bolivia", 0);
        myMap.put("USA", 3);

        System.out.println("myMap = " + myMap);
        System.out.println("myMap.keySet() = " + myMap.keySet());
        System.out.println("myMap.values() = " + myMap.values());
    }

    public static void printCollection(Collection<?> collection) {
        collection.forEach(item -> System.out.println("item = " + item));
    }
}
