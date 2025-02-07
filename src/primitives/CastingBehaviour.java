package primitives;

public class CastingBehaviour {

    public static void main(String[] args) {
        // Example 1: Implicit Casting (Widening)
        int intVal = 100;
        long longVal = intVal;  // Implicit casting (int -> long)
        System.out.println("Implicit Casting (int -> long): " + longVal);  // Expected: 100

        double doubleVal = longVal;  // Implicit casting (long -> double)
        System.out.println("Implicit Casting (long -> double): " + doubleVal);  // Expected: 100.0

        // Example 2: Explicit Casting (Narrowing)
        double doubleVal2 = 100.99;
        int intVal2 = (int) doubleVal2;  // Explicit casting (double -> int)
        System.out.println("\nExplicit Casting (double -> int): " + intVal2);  // Expected: 100

        long longVal2 = 1500L;
        short shortVal = (short) longVal2;  // Explicit casting (long -> short)
        System.out.println("Explicit Casting (long -> short): " + shortVal);  // Expected: 1500

        // Example 3: Casting between char and numeric types
        char charVal = 'A';  // 'A' is 65 in ASCII
        int intFromChar = charVal;  // Implicit casting (char -> int)
        System.out.println("\nImplicit Casting (char -> int): " + intFromChar);  // Expected: 65

        char charFromInt = (char) intFromChar;  // Explicit casting (int -> char)
        System.out.println("Explicit Casting (int -> char): " + charFromInt);  // Expected: 'A'

        // Example 4: Casting between floating-point types
        float floatVal = 10.75f;
        double doubleVal3 = floatVal;  // Implicit casting (float -> double)
        System.out.println("\nImplicit Casting (float -> double): " + doubleVal3);  // Expected: 10.75

        // Example 5: Data Loss in Explicit Casting
        double doubleVal4 = 3.999;
        int intFromDouble = (int) doubleVal4;  // Explicit casting (double -> int)
        System.out.println("\nExplicit Casting (double -> int) with data loss: " + intFromDouble);  // Expected: 3

        // Example 6: Overflow during Explicit Casting (Narrowing)
        int largeInt = 130;
        byte byteVal = (byte) largeInt;  // Overflow happens when casting large int to byte
        System.out.println("\nOverflow during Explicit Casting (int -> byte): " + byteVal);  // Expected: -126 (overflow)
    }
}
