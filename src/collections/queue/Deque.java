package collections.queue;

import java.util.ArrayDeque;

public class Deque {
    public static void main(String[] args) {
        // Create a deque using ArrayDeque
        java.util.Deque<Integer> deque = new ArrayDeque<>();

        // Adding elements to the front and back of the deque
        System.out.println("Adding elements to the front and back:");
        deque.addFirst(10);  // Adds 10 at the front
        System.out.println("After addFirst(10): " + deque);
        deque.addLast(20);   // Adds 20 at the back
        System.out.println("After addLast(20): " + deque);
        deque.offerFirst(5); // Adds 5 at the front
        System.out.println("After offerFirst(5): " + deque);
        deque.offerLast(25); // Adds 25 at the back
        System.out.println("After offerLast(25): " + deque);

        // Removing elements from the front and back
        System.out.println("\nRemoving elements from the front and back:");
        System.out.println("Removed from front: " + deque.removeFirst()); // 5
        System.out.println("After removeFirst(): " + deque);
        System.out.println("Removed from back: " + deque.removeLast());  // 25
        System.out.println("After removeLast(): " + deque);

        // Accessing the first and last elements
        System.out.println("\nAccessing the first and last elements:");
        System.out.println("First element: " + deque.getFirst()); // 10
        System.out.println("Last element: " + deque.getLast());   // 20

        // Checking if deque is empty and printing its size
        System.out.println("\nIs the deque empty? " + deque.isEmpty());
        System.out.println("Deque size: " + deque.size());

        // Log: After all operations, final state of the deque
        System.out.println("\nFinal state of the deque: " + deque);
    }
}

/*
 * Time Complexity:
 * - Insertion and Removal at both ends (`addFirst()`, `addLast()`, `removeFirst()`, `removeLast()`) take O(1) time,
 *   because these operations only involve manipulating the ends of the deque.
 * - Accessing elements (`getFirst()`, `getLast()`) also takes O(1) time.
 *
 * Space Complexity:
 * - The space complexity of a `Deque` is O(n), where n is the number of elements, since all elements need to be stored in memory.
 *   - `ArrayDeque` may also have extra space overhead for resizing, but it is typically efficient with memory.
 *
 * Uses:
 * - A `Deque` is useful when you need efficient access to both ends of a collection. It is especially useful for:
 *   1. Implementing a queue that can insert or remove elements from both ends.
 *   2. Implementing a stack (using only `addFirst()` and `removeFirst()`).
 *   3. Solving problems like the sliding window, where you need to track elements in a window and pop elements from the front while adding new ones to the back.
 *
 * Pros:
 * - **Efficient**: Insertion and removal from both ends are O(1) operations, making `Deque` a very efficient structure.
 * - **Flexible**: Can be used as a queue (FIFO), stack (LIFO), or for any algorithm that requires access to both ends of a collection.
 * - **No Fixed Size**: `ArrayDeque` dynamically grows as needed, providing flexibility in capacity.
 *
 * Cons:
 * - **No Random Access**: Unlike an array or `List`, a `Deque` doesn't allow direct access to elements by index. You need to traverse it to access any element other than the first or last.
 * - **Memory Overhead**: For large deques, especially in `LinkedList`-based implementations, memory overhead can become significant.
 */
