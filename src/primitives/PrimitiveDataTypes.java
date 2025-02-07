package primitives;

public class PrimitiveDataTypes {

    public static void main(String[] args) {

        // 1. boolean (smallest)
        // Size: Not explicitly defined, typically 1 bit (depends on JVM implementation)
        // Range: true or false
        // Default Value: false
        // Use: For binary states (true/false) or flags, e.g., isActive, isLoggedIn.
        boolean booleanVal = true;

        // 2. byte
        // Size: 1 byte (8 bits)
        // Range: -128 to 127
        // Default Value: 0
        // Use: For saving memory in large arrays or when working with binary data, such as file I/O.
        byte byteVal = 100;

        // 3. char
        // Size: 2 bytes (16 bits)
        // Range: 0 to 65,535 (representing Unicode values)
        // Default Value: '\u0000' (null character)
        // Use: For storing single characters, symbols, or ASCII/Unicode values.
        char charVal = 'A';  // ASCII value of 'A' is 65

        // 4. short
        // Size: 2 bytes (16 bits)
        // Range: -32,768 to 32,767
        // Default Value: 0
        // Use: For saving memory in cases where the integer range of values is small, like in embedded systems.
        short shortVal = 3000;

        // 5. int
        // Size: 4 bytes (32 bits)
        // Range: -2^31 to 2^31 - 1 (approximately -2.14 billion to 2.14 billion)
        // Default Value: 0
        // Use: The most commonly used type for integer calculations, like counters, IDs, etc.
        int intVal = 100000;

        // 6. float
        // Size: 4 bytes (32 bits)
        // Range: ±1.4E-45 to ±3.4E38 (approx.)
        // Default Value: 0.0f
        // Use: For floating-point calculations where memory is constrained and precision is less critical.
        float floatVal = 10.5f;

        // 7. long
        // Size: 8 bytes (64 bits)
        // Range: -2^63 to 2^63 - 1 (approximately -9.22 quintillion to 9.22 quintillion)
        // Default Value: 0L
        // Use: For large integer values, e.g., timestamps, unique identifiers, or counters exceeding int range.
        long longVal = 10000000000L;

        // 8. double (largest)
        // Size: 8 bytes (64 bits)
        // Range: ±4.9E-324 to ±1.8E308 (approx.)
        // Default Value: 0.0d
        // Use: For high-precision floating-point calculations, such as in scientific or financial applications.
        double doubleVal = 1000000.123456;

        // Displaying values
        System.out.println("boolean value: " + booleanVal);
        System.out.println("byte value: " + byteVal);
        System.out.println("char value: " + charVal);
        System.out.println("short value: " + shortVal);
        System.out.println("int value: " + intVal);
        System.out.println("float value: " + floatVal);
        System.out.println("long value: " + longVal);
        System.out.println("double value: " + doubleVal);
    }
}
