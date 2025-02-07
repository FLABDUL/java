package primitives;

public class ByteOperations {
    public static void main(String[] args) {
        byte byte1 = 10;
        byte byte2 = 20;

        // Print byte values
        System.out.println("byte1: " + byte1);
        System.out.println("byte2: " + byte2);

        // Addition of byte values
        byte sum = (byte) (byte1 + byte2);
        System.out.println("\nSum of byte1 and byte2: " + sum); // Expected: 30

        // Subtraction of byte values
        byte diff = (byte) (byte2 - byte1);
        System.out.println("Difference between byte2 and byte1: " + diff); // Expected: 10

        // Multiplication of byte values
        byte prod = (byte) (byte1 * byte2);
        System.out.println("Product of byte1 and byte2: " + prod); // Expected: 200

        // Division of byte values
        byte quotient = (byte) (byte2 / byte1);
        System.out.println("Quotient of byte2 divided by byte1: " + quotient); // Expected: 2
    }
}
