package non_primitive;

public class Strings {

    public static void main(String[] args) {
        // Example string
        String str = "  Hello, Java World!  ";

        // 1. Basic string properties and methods
        System.out.println("Original String: '" + str + "'");
        System.out.println("Length: " + str.length());
        System.out.println("Trimmed: '" + str.trim() + "'");
        System.out.println("Lowercase: " + str.toLowerCase());
        System.out.println("Uppercase: " + str.toUpperCase());

        // 2. Checking content
        System.out.println("Starts with '  Hello': " + str.startsWith("  Hello"));
        System.out.println("Ends with '!  ': " + str.endsWith("!  "));
        System.out.println("Contains 'Java': " + str.contains("Java"));

        // 3. Substring and character access
        System.out.println("Character at index 7: " + str.charAt(7));
        System.out.println("Substring (7 to 11): '" + str.substring(7, 11) + "'");

        // 4. Replacing content
        String replaced = str.replace("Java", "Programming");
        System.out.println("Replaced 'Java' with 'Programming': '" + replaced + "'");

        // 5. Splitting strings
        String[] words = str.trim().split(" ");
        System.out.println("Words:");
        for (String word : words) {
            System.out.println(word);
        }

        // 6. Comparing strings
        String anotherStr = "hello, java world!";
        System.out.println("Equals (case-sensitive): " + str.equals(anotherStr));
        System.out.println("Equals (ignore case): " + str.equalsIgnoreCase(anotherStr));

        // 7. StringBuilder for efficient manipulation
        StringBuilder sb = new StringBuilder("Hello");
        sb.append(", Java");
        sb.append(" World!");
        System.out.println("StringBuilder result: " + sb.toString());

        // 8. Joining strings
        String joined = String.join(" - ", "Java", "is", "fun");
        System.out.println("Joined String: " + joined);
    }
}
