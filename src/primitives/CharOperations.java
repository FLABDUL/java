package primitives;

public class CharOperations {

    public static void main(String[] args) {
        // Initializing char variables
        char char1 = 'A';
        char char2 = 'B';
        char char3 = 'a';
        char char4 = 'z';

        // Printing char values
        System.out.println("char1: " + char1); // 'A'
        System.out.println("char2: " + char2); // 'B'
        System.out.println("char3: " + char3); // 'a'
        System.out.println("char4: " + char4); // 'z'

        // Comparing char values
        System.out.println("\nComparison of char1 and char2:");
        if (char1 < char2) {
            System.out.println(char1 + " is less than " + char2); // 'A' < 'B'
        }

        // Arithmetic operations on chars
        System.out.println("\nArithmetic Operations:");
        System.out.println("char1 + char2: " + (char1 + char2)); // 'A' + 'B' -> 65 + 66 = 131 (ASCII sum)
        System.out.println("char1 - char2: " + (char1 - char2)); // 'A' - 'B' -> 65 - 66 = -1 (ASCII difference)

        // Incrementing a char (char as a number)
        char1++;
        System.out.println("\nIncrementing char1 (A -> B): " + char1); // 'A' becomes 'B'

        // Converting a char to its integer (ASCII) value
        System.out.println("\nASCII value of char1 ('B'): " + (int)char1); // 'B' -> 66

        // Converting an integer to a char
        int asciiValue = 90;
        char charFromAscii = (char) asciiValue;
        System.out.println("\nChar corresponding to ASCII value 90: " + charFromAscii); // 90 -> 'Z'

        // Checking if a char is a letter (uppercase or lowercase)
        //Character is utility class
        System.out.println("\nIs char1 a letter? " + Character.isLetter(char1)); // 'B' is a letter

        // Checking if a char is a digit
        System.out.println("Is '5' a digit? " + Character.isDigit('5')); // true

        // Converting char to uppercase
        char lowerChar = 'd';
        char upperChar = Character.toUpperCase(lowerChar);
        System.out.println("\nLower case 'd' to upper case: " + upperChar); // 'd' -> 'D'

        // Converting char to lowercase
        char upperChar2 = 'F';
        char lowerChar2 = Character.toLowerCase(upperChar2);
        System.out.println("Upper case 'F' to lower case: " + lowerChar2); // 'F' -> 'f'
    }
}
