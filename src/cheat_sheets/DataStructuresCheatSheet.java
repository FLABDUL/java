package cheat_sheets;

import java.util.*;
import java.util.HashMap;

public class DataStructuresCheatSheet {

    public static void main(String[] args) {
        // 1. Arrays
        // Create an integer array of size 5
        // Ordered: Yes (maintains insertion order)
        // Distinct: No (allows duplicates)
        int[] arr = new int[5];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        arr[3] = 4;
        arr[4] = 5;
        System.out.println("Array: " + Arrays.toString(arr));

        // 2. ArrayList
        // Declare and instantiate an ArrayList of Integers
        // Ordered: Yes (maintains insertion order)
        // Distinct: No (allows duplicates)
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);  // Add element to the list
        list.add(2);
        list.add(3);
        System.out.println("ArrayList: " + list);

        // 3. LinkedList
        // Declare and instantiate a LinkedList of Integers
        // Ordered: Yes (maintains insertion order)
        // Distinct: No (allows duplicates)
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(10);             // Add element at the end
        linkedList.addFirst(5);         // Add element at the beginning
        linkedList.addLast(20);         // Add element at the end
        System.out.println("LinkedList: " + linkedList);

        // 4. collections.HashMap
        // Declare and instantiate a collections.HashMap with Integer keys and String values
        // Ordered: No (does not guarantee order)
        // Distinct: Yes (keys must be distinct, values can be duplicated)
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "one");    // Add key-value pair
        map.put(2, "two");
        System.out.println("collections.HashMap: " + map);

        // 5. HashSet
        // Declare and instantiate a HashSet of Integers
        // Ordered: No (does not guarantee order)
        // Distinct: Yes (no duplicates allowed)
        HashSet<Integer> set = new HashSet<>();
        set.add(1);    // Add element to the set
        set.add(2);
        set.add(3);
        System.out.println("HashSet: " + set);

        // 6. TreeMap
        // Declare and instantiate a TreeMap with Integer keys and String values
        // Ordered: Yes (sorted by keys in ascending order)
        // Distinct: Yes (keys must be distinct, values can be duplicated)
        TreeMap<Integer, String> treeMap = new TreeMap<>();
        treeMap.put(1, "apple");    // Add key-value pair
        treeMap.put(2, "banana");
        System.out.println("TreeMap: " + treeMap);

        // 7. PriorityQueue
        // Declare and instantiate a PriorityQueue of Integers (min-heap by default)
        // Ordered: Yes (ordered based on the priority of elements)
        // Distinct: No (allows duplicates)
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(10);    // Add elements to the queue
        pq.add(5);
        pq.add(20);
        System.out.println("PriorityQueue (min-heap): " + pq);

        // 8. Stack
        // Declare and instantiate a Stack of Integers (LIFO)
        // Ordered: Yes (maintains insertion order with LIFO behavior)
        // Distinct: No (allows duplicates)
        Stack<Integer> stack = new Stack<>();
        stack.push(10);    // Push elements onto the stack
        stack.push(20);
        System.out.println("Stack (LIFO): " + stack);

        // 9. Queue
        // Declare and instantiate a Queue of Integers (FIFO)
        // Ordered: Yes (FIFO behavior)
        // Distinct: No (allows duplicates)
        Queue<Integer> queue = new LinkedList<>();
        queue.add(1);    // Add elements to the queue
        queue.add(2);
        System.out.println("Queue (FIFO): " + queue);

        // 10. Deque
        // Declare and instantiate a Deque of Integers (Double-ended)
        // Ordered: Yes (maintains insertion order)
        // Distinct: No (allows duplicates)
        Deque<Integer> deque = new ArrayDeque<>();
        deque.addFirst(1);   // Add element to the front
        deque.addLast(2);    // Add element to the back
        System.out.println("Deque (Double-ended): " + deque);

        // 11. TreeSet
        // Declare and instantiate a TreeSet of Integers (sorted)
        // Ordered: Yes (sorted in ascending order)
        // Distinct: Yes (no duplicates allowed)
        TreeSet<Integer> treeSet = new TreeSet<>();
        treeSet.add(10);    // Add elements
        treeSet.add(5);
        treeSet.add(15);
        System.out.println("TreeSet (Sorted): " + treeSet);
    }
}

/*
    Summary:
    - **Arrays**: Ordered (maintains insertion order), Not distinct (allows duplicates)
    - **ArrayList**: Ordered (maintains insertion order), Not distinct (allows duplicates)
    - **LinkedList**: Ordered (maintains insertion order), Not distinct (allows duplicates)
    - **collections.HashMap**: Not ordered (no guaranteed order), Distinct (keys must be distinct, values can be duplicated)
    - **HashSet**: Not ordered (no guaranteed order), Distinct (no duplicates allowed)
    - **TreeMap**: Ordered (sorted by keys in ascending order), Distinct (keys must be distinct, values can be duplicated)
    - **PriorityQueue**: Ordered (ordered based on the priority of elements), Not distinct (allows duplicates)
    - **Stack**: Ordered (maintains insertion order with LIFO behavior), Not distinct (allows duplicates)
    - **Queue**: Ordered (FIFO behavior), Not distinct (allows duplicates)
    - **Deque**: Ordered (maintains insertion order), Not distinct (allows duplicates)
    - **TreeSet**: Ordered (sorted in ascending order), Distinct (no duplicates allowed)
*/
