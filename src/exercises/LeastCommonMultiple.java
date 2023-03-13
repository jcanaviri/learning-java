package exercises;

/* This Java program calculates the least common multiple (LCM) of two numbers
    using the Euclidean algorithm. */
@SuppressWarnings("unused")
public class LeastCommonMultiple {

    /* The gcd function calculates the greatest common divisor (GCD)
    of two numbers using recursive subtraction.
    The GCD is used to calculate the LCM in the lcm function,
    which simply divides the product of the two numbers by their GCD. */
    static int gcd(int a, int b) {
        if (a == 0)
            return b;
        else if (b == 0)
            return a;
        else if (a > b)
            return gcd(a - b, b);
        else
            return gcd(a, b - a);
    }

    /* Euclidean algorithm with modulo operator:
        This algorithm is based on the observation that if "a" is divided by "b" to produce a remainder "r", then gcd(a,b) is equal to gcd(b,r).
        This allows the algorithm to quickly reduce the input numbers to smaller values by repeatedly computing the remainder of a divided by b, swapping a and b if necessary to ensure that "a" is the larger of the two, and applying the formula b = a % b to reduce the problem to a smaller problem.
        This process is repeated until b is zero, at which point "a" is the GCD*/
    static int gcd2(int a, int b) {
        if (a == 0)
            return b;

        if (b == 0)
            return a;

        // Euclidean algorithm with modulo operator
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }

        return a;
    }


    static int lcm(int a, int b) {
        return a * b / gcd2(a, b);
    }

    public static void main(String[] args) {
        int a = 13, b = 2;

        System.out.println("Least common multiple is: " + lcm(a, b));
    }

}
