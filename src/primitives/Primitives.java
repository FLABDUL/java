package primitives;

public class Primitives {

    public static void main(String[] args) {
        // 1. Integer types
        byte aByte = 10; // 8-bit integer
        short aShort = 32000; // 16-bit integer
        int anInt = 100000; // 32-bit integer
        long aLong = 10000000000L; // 64-bit integer

        // Arithmetic operations
        int sum = anInt + 50;
        long product = aLong * 2;

        System.out.println("Byte value: " + aByte);
        System.out.println("Short value: " + aShort);
        System.out.println("Int sum: " + sum);
        System.out.println("Long product: " + product);

        // 2. Floating-point types
        float aFloat = 5.75f; // 32-bit floating-point
        double aDouble = 19.99; // 64-bit floating-point

        // Precision and operations
        double division = aDouble / 3;

        System.out.println("Float value: " + aFloat);
        System.out.println("Double division: " + division);

        // 3. Character type
        char aChar = 'A';
        char unicodeChar = '\u0041'; // Unicode representation

        System.out.println("Character: " + aChar);
        System.out.println("Unicode Character: " + unicodeChar);

        // 4. Boolean type
        boolean isJavaFun = true;
        boolean isFishTasty = false;

        System.out.println("Is Java fun? " + isJavaFun);
        System.out.println("Is fish tasty? " + isFishTasty);

        // Common string methods (non_primitive.Strings are not primitives but widely used)
        String example = "Hello, World!";
        System.out.println("String length: " + example.length());
        System.out.println("Substring: " + example.substring(7));
        System.out.println("Uppercase: " + example.toUpperCase());

        // Wrappers and utility methods for primitives
        Integer wrappedInt = Integer.valueOf(anInt);
        System.out.println("Wrapped Int: " + wrappedInt);
        System.out.println("Parsed Int: " + Integer.parseInt("12345"));
        System.out.println("Max value of Integer: " + Integer.MAX_VALUE);

        // Auto-boxing and unboxing
        Integer autoBoxed = anInt; // Auto-boxing
        int unboxed = autoBoxed; // Unboxing
        System.out.println("Auto-boxed: " + autoBoxed + ", Unboxed: " + unboxed);
    }
}

