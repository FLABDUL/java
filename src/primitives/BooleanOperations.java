package primitives;

public class BooleanOperations {
    public static void main(String[] args) {
        boolean bool1 = true;
        boolean bool2 = false;

        // Print boolean values
        System.out.println("bool1: " + bool1);
        System.out.println("bool2: " + bool2);

        // AND operation
        System.out.println("\nbool1 AND bool2: " + (bool1 && bool2)); // Expected: false

        // OR operation
        System.out.println("bool1 OR bool2: " + (bool1 || bool2)); // Expected: true

        // NOT operation on bool1
        System.out.println("NOT bool1: " + !bool1); // Expected: false
    }
}
