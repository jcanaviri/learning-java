package enums;

public class Main {
    public static void main(String[] args) {
        System.out.println("The first day of the week is: " + Days.MONDAY);

        // Using format String
        String toFormat = "The continent %s has %d countries";
        String sentence = String.format(toFormat, Continents.AMERICA, Continents.AMERICA.getCountries());
        System.out.println(sentence);

        System.out.println("\nAll the days of the week:");
        for (Days day : Days.values()) {
            System.out.print(day + " ");
        }

        System.out.println("\nAll the continents in the world:");
        for (Continents continent : Continents.values()) {
            System.out.print(continent + " ");
        }
    }
}
