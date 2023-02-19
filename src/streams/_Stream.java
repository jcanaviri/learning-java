package streams;

import java.util.List;
import java.util.stream.Collectors;

public class _Stream {
    public static void main(String[] args) {
        List<Person> people = List.of(
                new Person("John", Gender.MALE),
                new Person("Dave", Gender.MALE),
                new Person("Susan", Gender.FEMALE),
                new Person("Alex", Gender.PREFER_NOT_TO_SAY),
                new Person("Jeffrey", Gender.MALE)
        );

        // The double :: is called "method reference"
        // it's just a syntactic sugar for expressions like this:
        //  x -> System.out.println(x)  -> System.out::println
        //  x -> x.length()             -> String::length

        people.stream()
                .map(person -> person.gender)
                .collect(Collectors.toSet())
                .forEach(System.out::println);

        people.stream()
                .map(person -> person.name)
                .mapToInt(String::length)
                .forEach(System.out::println);

        boolean hasOnlyFemales = people.stream()
                .allMatch(person -> Gender.FEMALE.equals(person.gender));

        System.out.println("The list contains only females: " + hasOnlyFemales);
    }

    enum Gender {
        MALE, FEMALE, PREFER_NOT_TO_SAY
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
            return "Person{" + "name='" + name + '\'' +
                    ", gender=" + gender +
                    '}';
        }
    }
}
