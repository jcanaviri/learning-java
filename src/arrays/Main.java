package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        int[] ages = new int[3];
        System.out.println("ages = " + Arrays.toString(ages));

        ages[0] = 10;
        ages[1] = 20;
        ages[2] = 23;

        // Using forEach
        Arrays.stream(ages).forEach(System.out::println);

        // Array of objects
        Customer[] customerList = new Customer[3];
        customerList[0] = new Customer("John");
        customerList[1] = new Customer("Karen");
        customerList[2] = new Customer("Peter");

        Arrays.stream(customerList).forEach(System.out::println);

        String[] fruits = {"orange", "watermelon", "strawberries"};
        Arrays.stream(fruits).forEach(System.out::println);

        ArrayList<String> names = new ArrayList<>();
        names.add("John");
        System.out.println("names = " + names);

        List<Customer> customerList1 = new ArrayList<>();
        customerList1.add(new Customer("Johnathan"));
        customerList1.add(new Customer("Diana"));

        customerList1.forEach(System.out::println);
    }
}
