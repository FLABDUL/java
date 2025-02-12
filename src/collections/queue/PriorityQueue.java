package collections.queue;

public class PriorityQueue {

    public static void main(String[] args) {
        // Create a priority queue of integers (min-heap by default)
        java.util.PriorityQueue<Integer> pq = new java.util.PriorityQueue<>();//a-b

        // Adding elements to the priority queue
        pq.add(10);
        pq.add(5);
        pq.add(20);
        pq.add(15);

        // Log: Print the priority queue to show its internal state (heap structure)
        System.out.println("Priority Queue (Min-Heap): " + pq);
        // This will print an unordered list due to the nature of the heap, not necessarily sorted.

        // Retrieving and removing the elements from the priority queue
        System.out.println("\nRemoving elements from the priority queue (min-heap):");
        while (!pq.isEmpty()) {
            // Retrieve and remove the element with the highest priority (smallest element)
            System.out.println(pq.poll());
        }

        // Creating a priority queue with a custom comparator (max-heap)
        java.util.PriorityQueue<Integer> maxHeap = new java.util.PriorityQueue<>((a, b) -> b - a);

        // Adding elements to the max-heap priority queue
        maxHeap.add(10);
        maxHeap.add(5);
        maxHeap.add(20);
        maxHeap.add(15);

        // Log: Print the max-heap priority queue to show the internal state
        System.out.println("\nMax-Heap Priority Queue: " + maxHeap);
        // The internal order will be a heap structure, not necessarily sorted, but the largest value will have the highest priority.

        // Retrieving and removing the elements from the max-heap priority queue
        System.out.println("\nRemoving elements from the max-heap priority queue:");
        while (!maxHeap.isEmpty()) {
            // Retrieve and remove the element with the highest priority (largest element)
            System.out.println(maxHeap.poll());
        }
    }
}

/*
 * Time Complexity:
 * - Inserting an element: O(log n), where n is the number of elements in the priority queue.
 *   This is because the queue is a heap, and inserting requires placing the new element at the end and then bubbling it up.
 * - Removing the element (polling): O(log n), where n is the number of elements in the priority queue.
 *   This is because the queue needs to replace the root (highest or lowest priority element) and then bubble down to maintain heap properties.
 *
 * Space Complexity:
 * - O(n), where n is the number of elements in the priority queue.
 *   The priority queue stores all elements, so its space usage is proportional to the number of elements it holds.
 *
 * Uses:
 * - Priority Queues are used when we need efficient access to the largest or smallest element without needing to sort the entire collection.
 * - They are commonly used in scenarios like:
 *   1. Implementing scheduling algorithms (e.g., task scheduling with priority).
 *   2. Dijkstra's algorithm for finding the shortest path.
 *   3. Merging sorted streams (e.g., in external sorting).
 *
 * Pros:
 * - Efficient for retrieving the highest (or lowest) priority element in O(log n) time.
 * - Easy to implement using Java's `PriorityQueue` class with built-in heap functionality.
 * - Insertion and removal are much faster than sorting the entire collection.
 * - Can be used for both min-heaps and max-heaps by providing a custom comparator.
 *
 * Cons:
 * - Not suitable for scenarios where you need to access arbitrary elements efficiently, as it doesn’t support random access.
 * - The elements are not stored in a sorted order, so traversing them takes linear time.
 *
 * Summary:
 * - A `PriorityQueue` is useful for cases where the data needs to be processed according to priority (e.g., smallest or largest element).
 * - The time complexity for insertion and removal is O(log n), making it much faster than sorting the entire collection, but it lacks efficient random access.
 * - It is ideal for priority-based processing but not well-suited for applications where you need to frequently access arbitrary elements.
 */
