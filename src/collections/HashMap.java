package collections;

import java.util.LinkedList;

class LinkedListHashMap<K, V> {
    private static final int SIZE = 16; // Number of buckets (initial size)
    private LinkedList<Node<K, V>>[] buckets;

    // Node to hold key-value pairs
    static class Node<K, V> {
        K key;
        V value;

        Node(K key, V value) {
            this.key = key;
            this.value = value;
        }
    }

    public LinkedListHashMap() {
        buckets = new LinkedList[SIZE]; // Create an array of linked lists (buckets)
        for (int i = 0; i < SIZE; i++) {
            buckets[i] = new LinkedList<>(); // Initialize each bucket as an empty linked list
        }
    }

    // Hash function to calculate index based on key
    private int getBucketIndex(K key) {
        return key.hashCode() % SIZE; // Hashing the key to get an index in the bucket array
    }

    // Insert or update a key-value pair
    public void put(K key, V value) {
        int index = getBucketIndex(key); // Compute bucket index
        LinkedList<Node<K, V>> bucket = buckets[index]; // Retrieve the linked list at the computed index

        // Check if the key already exists in the bucket, update value if found
        for (Node<K, V> node : bucket) {
            if (node.key.equals(key)) { // If key found, update the value
                node.value = value;  // Update the value
                return; // Exit after updating
            }
        }

        // If key doesn't exist, add a new node with the key and value
        bucket.add(new Node<>(key, value)); // O(1) for insertion
    }

    // Get the value for a key
    public V get(K key) {
        int index = getBucketIndex(key); // Compute bucket index
        LinkedList<Node<K, V>> bucket = buckets[index]; // Retrieve the linked list at the computed index

        // Iterate through the linked list to find the key and return the value
        for (Node<K, V> node : bucket) {
            if (node.key.equals(key)) { // If key found, return corresponding value
                return node.value;
            }
        }

        return null; // Key not found
    }

    // Remove a key-value pair
    public void remove(K key) {
        int index = getBucketIndex(key); // Compute bucket index
        LinkedList<Node<K, V>> bucket = buckets[index]; // Retrieve the linked list at the computed index

        // Remove the node with the matching key from the bucket
        bucket.removeIf(node -> node.key.equals(key)); // O(n) in the worst case if the bucket has many elements
    }

    // Check if the map contains a key
    public boolean containsKey(K key) {
        int index = getBucketIndex(key); // Compute bucket index
        LinkedList<Node<K, V>> bucket = buckets[index]; // Retrieve the linked list at the computed index

        // Iterate through the linked list to find the key
        for (Node<K, V> node : bucket) {
            if (node.key.equals(key)) {
                return true; // Key found
            }
        }
        return false; // Key not found
    }

    // Check if the map contains a value
    public boolean containsValue(V value) {
        // Iterate through all buckets and linked lists to search for the value
        for (LinkedList<Node<K, V>> bucket : buckets) {
            for (Node<K, V> node : bucket) {
                if (node.value.equals(value)) { // Value found
                    return true;
                }
            }
        }
        return false; // Value not found
    }

    // Size of the map (number of key-value pairs)
    public int size() {
        int size = 0;
        // Iterate through all buckets and sum the sizes of the linked lists
        for (LinkedList<Node<K, V>> bucket : buckets) {
            size += bucket.size(); // O(n) for iterating through all elements in all buckets
        }
        return size; // Total number of elements
    }
}

public class HashMap {
    public static void main(String[] args) {
        LinkedListHashMap<String, Integer> map = new LinkedListHashMap<>();

        map.put("apple", 1);
        map.put("banana", 2);
        map.put("orange", 3);

        System.out.println("apple: " + map.get("apple")); // Output: 1
        System.out.println("banana: " + map.get("banana")); // Output: 2

        map.put("apple", 10);  // Update value for key "apple"
        System.out.println("apple (updated): " + map.get("apple")); // Output: 10

        map.remove("banana");
        System.out.println("banana (removed): " + map.get("banana")); // Output: null
    }
}

/*
Time Complexity:
- **put(K key, V value)**: O(1) on average, O(n) in worst case (if a bucket contains many elements, i.e., a collision).
- **get(K key)**: O(1) on average, O(n) in worst case (if a bucket contains many elements).
- **remove(K key)**: O(1) on average, O(n) in worst case (if a bucket has many elements).
- **containsKey(K key)**: O(1) on average, O(n) in worst case.
- **containsValue(V value)**: O(n) in the worst case, as it requires checking all elements in all buckets.
- **size()**: O(n) as it iterates over all the elements in all buckets.

Space Complexity:
- **O(n)** where n is the number of key-value pairs, as we store each pair in the buckets array.
- The space required by the underlying `LinkedList` for each bucket depends on the number of elements stored in that bucket.
*/
