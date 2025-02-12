package cheat_sheets;

import java.util.*;
import java.util.HashMap;

public class TimeSpaceComplexityCheatSheet {

    public static void main(String[] args) {

        // 1. Array
        System.out.println("Array Operations:");
        int[] arr = new int[5];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        arr[3] = 4;
        arr[4] = 5;
        System.out.println("Array: " + Arrays.toString(arr));
        // Access, Insert, Delete are O(n) operations for Array

        // 2. ArrayList
        System.out.println("\nArrayList Operations:");
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);  // Insert O(1) amortized
        arrayList.add(2);
        arrayList.add(3);
        arrayList.remove(1);  // Delete O(n) as it involves shifting elements
        System.out.println("ArrayList after removal: " + arrayList);

        // 3. LinkedList
        System.out.println("\nLinkedList Operations:");
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(10);             // O(1)
        linkedList.addFirst(5);         // O(1)
        linkedList.addLast(20);         // O(1)
        linkedList.removeFirst();      // O(1)
        linkedList.removeLast();       // O(1)
        System.out.println("LinkedList after operations: " + linkedList);

        // 4. collections.HashMap
        System.out.println("\ncollections.HashMap Operations:");
        Map<Integer, String> hashMap = new HashMap<>();
        hashMap.put(1, "one");    // Insert O(1)
        hashMap.put(2, "two");
        hashMap.put(3, "three");
        System.out.println("collections.HashMap: " + hashMap);
        hashMap.remove(2);  // Delete O(1)
        System.out.println("collections.HashMap after removal: " + hashMap);

        // 5. HashSet
        System.out.println("\nHashSet Operations:");
        HashSet<Integer> hashSet = new HashSet<>();
        hashSet.add(1);    // Insert O(1)
        hashSet.add(2);
        hashSet.add(2);    // Duplicate, O(1) but will not be inserted
        System.out.println("HashSet (unique values): " + hashSet);
        hashSet.remove(1); // Delete O(1)
        System.out.println("HashSet after removal: " + hashSet);

        // 6. TreeMap
        System.out.println("\nTreeMap Operations:");
        TreeMap<Integer, String> treeMap = new TreeMap<>();
        treeMap.put(1, "apple");    // Insert O(log n)
        treeMap.put(2, "banana");
        treeMap.put(3, "cherry");
        System.out.println("TreeMap: " + treeMap);
        treeMap.remove(2);  // Delete O(log n)
        System.out.println("TreeMap after removal: " + treeMap);

        // 7. PriorityQueue (Min-Heap)
        System.out.println("\nPriorityQueue Operations:");
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(10);    // Insert O(log n)
        pq.add(5);
        pq.add(20);
        System.out.println("PriorityQueue: " + pq);
        pq.poll();  // Delete O(log n) (removes the smallest element)
        System.out.println("PriorityQueue after poll: " + pq);

        // 8. Stack (LIFO)
        System.out.println("\nStack Operations:");
        Stack<Integer> stack = new Stack<>();
        stack.push(10);    // Push O(1)
        stack.push(20);
        stack.push(30);
        System.out.println("Stack: " + stack);
        stack.pop();  // Pop O(1)
        System.out.println("Stack after pop: " + stack);

        // 9. Queue (FIFO)
        System.out.println("\nQueue Operations:");
        Queue<Integer> queue = new LinkedList<>();
        queue.add(1);    // Enqueue O(1)
        queue.add(2);
        queue.add(3);
        System.out.println("Queue: " + queue);
        queue.poll();  // Dequeue O(1)
        System.out.println("Queue after poll: " + queue);

        // 10. Deque (Double-ended Queue)
        System.out.println("\nDeque Operations:");
        Deque<Integer> deque = new ArrayDeque<>();
        deque.addFirst(1);   // O(1)
        deque.addLast(2);    // O(1)
        deque.addFirst(3);   // O(1)
        System.out.println("Deque: " + deque);
        deque.removeFirst();   // O(1)
        deque.removeLast();    // O(1)
        System.out.println("Deque after operations: " + deque);
    }
}

/*
Time Complexity Summary:
- Array: O(1) for access, O(n) for insertion/deletion.
- ArrayList: O(1) amortized for insertion at the end, O(n) for deletion and insertion at the middle.
- LinkedList: O(1) for insertion and deletion at both ends, O(n) for access.
- collections.HashMap: O(1) for access, insertion, and deletion (amortized).
- HashSet: O(1) for insertion, deletion, and searching.
- TreeMap: O(log n) for insertion, deletion, and access (sorted by key).
- PriorityQueue (Min-Heap): O(log n) for insertion and deletion, O(1) for access to the minimum element.
- Stack: O(1) for push and pop.
- Queue: O(1) for enqueue and dequeue.
- Deque: O(1) for add/remove at both ends.
*/
