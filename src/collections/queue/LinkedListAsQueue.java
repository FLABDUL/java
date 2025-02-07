package collections.queue;

import java.util.LinkedList;
import java.util.Queue;

public class LinkedListAsQueue {

    public static void main(String[] args) {
        // Create a LinkedList behaving as a queue
        Queue<Integer> queue = new LinkedList<>();

        System.out.println("Demonstrating LinkedList as a Queue:");

        // Add elements to the queue
        System.out.println("\n1. Adding elements to the queue:");
        queue.add(10); // Add 10
        System.out.println("Enqueued: 10");
        queue.add(20); // Add 20
        System.out.println("Enqueued: 20");
        queue.add(30); // Add 30
        System.out.println("Enqueued: 30");
        System.out.println("Queue after enqueue operations: " + queue);

        // Peek at the front element of the queue
        System.out.println("\n2. Peeking the front element:");
        System.out.println("Front of the queue (peek): " + queue.peek());

        // Remove elements from the queue
        System.out.println("\n3. Dequeue operations:");
        int dequeued = queue.poll(); // Remove the front element
        System.out.println("Dequeued: " + dequeued);
        System.out.println("Queue after dequeue: " + queue);

        dequeued = queue.poll(); // Remove the next front element
        System.out.println("Dequeued: " + dequeued);
        System.out.println("Queue after dequeue: " + queue);

        // Add more elements
        System.out.println("\n4. Adding more elements:");
        queue.add(40);
        System.out.println("Enqueued: 40");
        queue.add(50);
        System.out.println("Enqueued: 50");
        System.out.println("Queue now: " + queue);

        // Check if the queue is empty
        System.out.println("\n5. Checking if the queue is empty:");
        System.out.println("Is queue empty? " + queue.isEmpty());

        // Clear the queue
        System.out.println("\n6. Clearing the queue:");
        queue.clear();
        System.out.println("Queue after clearing: " + queue);
        System.out.println("Is queue empty? " + queue.isEmpty());
    }

    /*
     * =========================
     * Key Methods Demonstrated:
     * =========================
     * 1. add(E element): Adds the specified element to the queue.
     * 2. poll(): Retrieves and removes the head of the queue (returns null if empty).
     * 3. peek(): Retrieves the head of the queue without removing it (returns null if empty).
     * 4. isEmpty(): Checks if the queue is empty.
     * 5. clear(): Removes all elements from the queue.
     *
     * =====================
     * Pros of LinkedList as Queue:
     * =====================
     * 1. Dynamic size: Can grow or shrink as needed.
     * 2. Efficient queue operations: Enqueue (add) and dequeue (poll) are O(1).
     * 3. Versatile: Can also be used as a stack or deque if needed.
     *
     * =====================
     * Cons of LinkedList as Queue:
     * =====================
     * 1. More memory overhead: Each element stores pointers to the next and previous nodes.
     * 2. Slightly slower than ArrayDeque in most cases due to pointer dereferencing.
     *
     * ==================
     * Use Cases:
     * ==================
     * 1. Handling first-in-first-out (FIFO) operations.
     * 2. Task scheduling or managing threads.
     * 3. Implementing breadth-first search (BFS) in graphs or trees.
     */
}
