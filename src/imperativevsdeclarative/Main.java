package imperativevsdeclarative;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Person> people = List.of(
                new Person("John", Gender.MALE),
                new Person("Mary", Gender.FEMALE),
                new Person("Dave", Gender.MALE),
                new Person("Susan", Gender.FEMALE),
                new Person("Alice", Gender.FEMALE)
        );

        // Well the task in find how many woman there are in the list
        // 1.- Imperative way
        System.out.println("Imperative way");
        List<Person> females = new ArrayList<>();

        for (Person person : people) {
            if (Gender.FEMALE.equals(person.gender))
                females.add(person);
        }

        for (Person female : females) {
            System.out.println(female);
        }

        // 2.- Declarative way
        System.out.println("\nDeclarative way");
        people.stream()  // Stream allow us to use functional programming
                .filter(person -> Gender.FEMALE.equals(person.gender))  // A single condition
                .toList()  // Convert to a List
                .forEach(System.out::println);  // for every item in the list apply this function
    }

    enum Gender {
        MALE, FEMALE
    }

    static class Person {
        private final String name;
        private final Gender gender;

        Person(String name, Gender gender) {
            this.name = name;
            this.gender = gender;
        }

        @Override
        public String toString() {
            return "Person{name='" + this.name + "', gender='" + this.gender + "'}";
        }
    }
}
