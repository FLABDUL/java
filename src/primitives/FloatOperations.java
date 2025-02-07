package primitives;

public class FloatOperations {
    public static void main(String[] args) {
        float float1 = 10.5f;
        float float2 = 4.2f;

        // Print float values
        System.out.println("float1: " + float1);
        System.out.println("float2: " + float2);

        // Addition of float values
        float sum = float1 + float2;
        System.out.println("\nSum of float1 and float2: " + sum); // Expected: 14.7

        // Subtraction of float values
        float diff = float1 - float2;
        System.out.println("Difference between float1 and float2: " + diff); // Expected: 6.3

        // Multiplication of float values
        float prod = float1 * float2;
        System.out.println("Product of float1 and float2: " + prod); // Expected: 44.1

        // Division of float values
        float quotient = float1 / float2;
        System.out.println("Quotient of float1 divided by float2: " + quotient); // Expected: 2.5
    }
}
