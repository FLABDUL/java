package non_primitive;

class Arrays {
    public static void main(String[] args) {
        // Example array
        int[] numbers = {5, 2, 8, 4, 1};
        int[][] matrix = {{1, 2}, {3, 4}, {5, 6}};

        // 1. Arrays.toString()
        System.out.println("Array as String: " + java.util.Arrays.toString(numbers));

        // 2. Arrays.deepToString()
        System.out.println("2D Array as String: " + java.util.Arrays.deepToString(matrix));

        // 3. Arrays.sort()
        java.util.Arrays.sort(numbers);
        System.out.println("Sorted Array: " + java.util.Arrays.toString(numbers));

        // 4. Arrays.binarySearch() - must be sorted first
        int index = java.util.Arrays.binarySearch(numbers, 4);
        System.out.println("Index of 4: " + index);

        // 5. Arrays.fill()
        int[] filledArray = new int[5];
        java.util.Arrays.fill(filledArray, 7);
        System.out.println("Array filled with 7: " + java.util.Arrays.toString(filledArray));

        // 6. Arrays.equals()
        int[] array1 = {1, 2, 3};
        int[] array2 = {1, 2, 3};
        System.out.println("Arrays are equal: " + java.util.Arrays.equals(array1, array2));

        // 7. Arrays.copyOf()
        int[] copiedArray = java.util.Arrays.copyOf(numbers, 3);
        System.out.println("Copied Array (first 3 elements): " + java.util.Arrays.toString(copiedArray));

        // 8. Arrays.copyOfRange()
        int[] rangeArray = java.util.Arrays.copyOfRange(numbers, 1, 4);
        System.out.println("Copied Array Range (index 1 to 3): " + java.util.Arrays.toString(rangeArray));

        // 9. Arrays.hashCode()
        System.out.println("Hash code of array: " + java.util.Arrays.hashCode(numbers));

        // 10. Arrays.stream()
        int sum = java.util.Arrays.stream(numbers).sum();
        System.out.println("Sum of Array Elements: " + sum);

        // 11. Arrays.parallelSort()
        int[] largeArray = {9, 7, 3, 1, 6, 8};
        java.util.Arrays.parallelSort(largeArray);
        System.out.println("Parallel Sorted Array: " + java.util.Arrays.toString(largeArray));

        // 12. Arrays.setAll()
        int[] squaredArray = new int[5];
        java.util.Arrays.setAll(squaredArray, i -> i * i); // Fills with squares of indices
        System.out.println("Squared Index Array: " + java.util.Arrays.toString(squaredArray));
    }
}

/*
This class demonstrates common methods in the `Arrays` utility class:
1. `toString()` - Converts an array to a readable string format.
2. `deepToString()` - Converts a multi-dimensional array to a readable string.
3. `sort()` - Sorts an array in ascending order.
4. `binarySearch()` - Searches for a key in a sorted array and returns its index.
5. `fill()` - Fills an array with a specific value.
6. `equals()` - Checks if two arrays are equal.
7. `copyOf()` - Creates a new array by copying the first `n` elements of an array.
8. `copyOfRange()` - Copies a range of elements into a new array.
9. `hashCode()` - Returns the hash code of the array.
10. `stream()` - Converts the array to a stream for operations like sum, filter, etc.
11. `parallelSort()` - Sorts an array using parallel sorting for large datasets.
12. `setAll()` - Fills an array based on a generator function.
*/
