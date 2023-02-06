package basics;

public class TypeInference {
    public static void main(String[] args) {
        var isAvailable = true;
        System.out.println(isAvailable);

        // This code throws an error of type
        // isAvailable = "Jose";
        isAvailable = false;
        System.out.println(isAvailable);
    }
}
