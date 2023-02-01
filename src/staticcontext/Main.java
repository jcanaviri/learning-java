package staticcontext;

public class Main {
    public static void main(String[] args) {
        Person john = new Person("John");
        System.out.println("john = " + john);
        
        Person carlos = new Person("Carlos");
        System.out.println("carlos = " + carlos);

        showPerson(john);
        showPerson(carlos);
    }

    public static void showPerson(Person person) {
        System.out.println("person = " + person);
    }
}
