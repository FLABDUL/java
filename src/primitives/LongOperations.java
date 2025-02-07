package primitives;

public class LongOperations {
    public static void main(String[] args) {
        long long1 = 10000000000L;
        long long2 = 5000000000L;

        // Print long values
        System.out.println("long1: " + long1);
        System.out.println("long2: " + long2);

        // Addition of long values
        long sum = long1 + long2;
        System.out.println("\nSum of long1 and long2: " + sum); // Expected: 15000000000

        // Subtraction of long values
        long diff = long1 - long2;
        System.out.println("Difference between long1 and long2: " + diff); // Expected: 5000000000

        // Multiplication of long values
        long prod = long1 * long2;
        System.out.println("Product of long1 and long2: " + prod); // Expected: 50000000000000000000

        // Division of long values
        long quotient = long1 / long2;
        System.out.println("Quotient of long1 divided by long2: " + quotient); // Expected: 2
    }
}
