package primitives;

public class ShortOperations {
    public static void main(String[] args) {
        short short1 = 1000;
        short short2 = 2000;

        // Print short values
        System.out.println("short1: " + short1);
        System.out.println("short2: " + short2);

        // Addition of short values
        short sum = (short) (short1 + short2);
        System.out.println("\nSum of short1 and short2: " + sum); // Expected: 3000

        // Subtraction of short values
        short diff = (short) (short2 - short1);
        System.out.println("Difference between short2 and short1: " + diff); // Expected: 1000

        // Multiplication of short values
        short prod = (short) (short1 * short2);
        System.out.println("Product of short1 and short2: " + prod); // Expected: 2000000

        // Division of short values
        short quotient = (short) (short2 / short1);
        System.out.println("Quotient of short2 divided by short1: " + quotient); // Expected: 2
    }
}
