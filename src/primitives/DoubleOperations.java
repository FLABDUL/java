package primitives;

public class DoubleOperations {
    public static void main(String[] args) {
        double double1 = 10.5;
        double double2 = 4.2;

        // Print double values
        System.out.println("double1: " + double1);
        System.out.println("double2: " + double2);

        // Addition of double values
        double sum = double1 + double2;
        System.out.println("\nSum of double1 and double2: " + sum); // Expected: 14.7

        // Subtraction of double values
        double diff = double1 - double2;
        System.out.println("Difference between double1 and double2: " + diff); // Expected: 6.3

        // Multiplication of double values
        double prod = double1 * double2;
        System.out.println("Product of double1 and double2: " + prod); // Expected: 44.1

        // Division of double values
        double quotient = double1 / double2;
        System.out.println("Quotient of double1 divided by double2: " + quotient); // Expected: 2.5
    }
}
