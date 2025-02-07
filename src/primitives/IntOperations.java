package primitives;

public class IntOperations {
    public static void main(String[] args) {
        int int1 = 100000;
        int int2 = 50000;

        // Print int values
        System.out.println("int1: " + int1);
        System.out.println("int2: " + int2);

        // Addition of int values
        int sum = int1 + int2;
        System.out.println("\nSum of int1 and int2: " + sum); // Expected: 150000

        // Subtraction of int values
        int diff = int1 - int2;
        System.out.println("Difference between int1 and int2: " + diff); // Expected: 50000

        // Multiplication of int values
        int prod = int1 * int2;
        System.out.println("Product of int1 and int2: " + prod); // Expected: 5000000000

        // Division of int values
        int quotient = int1 / int2;
        System.out.println("Quotient of int1 divided by int2: " + quotient); // Expected: 2
    }
}
