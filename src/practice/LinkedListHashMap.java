package practice;

import java.util.LinkedList;

public class LinkedListHashMap<K, V> {
    /*what is a hashmap?
    data structure to store key value pairs
    uses a hash function to compute index where value is stored
    O1 average time complexity insert, delete, lookups
    implement with array of linked lists to handle collisions
    each index in array is a bucket where values with same hash are stored

    SUMMARY:
    key pair valyes
    hash -> index -> value
    O1 time
    []LL = [bucket]
     */

    //set class bucket size
    //create array linkedlists or buckets
    private static final int SIZE = 16;//can lead to clustering is power of two is low, amplify collisions
    private final LinkedList<Node<K, V>>[] buckets;

    /*node static class key value*/
    private static class Node<K, V> {
        K key;
        V value;

        public Node(K key, V value) {
            this.key = key;
            this.value = value;
        }
    }

    /*constructor for LLHM class*/
        //create buckets of linkedlists of size set
        //for each bucket, create a new linkedlist
    public LinkedListHashMap() {
        buckets = new LinkedList[SIZE];
        for(int i = 0; i < SIZE; i++){
            buckets[i] = new LinkedList<>();
        }
    }

    //get bucket hashed index using key method MOST IMPORTANT
    public int getBucketIndex(K key){
//        return key.hashCode() % SIZE normal
//        return (key.hashCode() & 0x7FFFFFFF) & (SIZE - 1);minimise clustering, only for powers of two
        return Math.abs(key.hashCode() % SIZE);//so not to return negative values, can slightly bias hash, cause rare overflow
    }

    //put method
        //gets index for key
        //retrieve bucket from array
        //for each node in that bucket
            //check against key and update
        //else add it to bucket
    public void put(K key, V value){
        int index = getBucketIndex(key);
        LinkedList<Node<K, V>> bucket = buckets[index];
        for(Node<K, V> node : bucket){
            if(node.key.equals(key)) {
                node.value = value;
                return;
            }
        }
        bucket.add(new Node<>(key, value));
    }

    //get method
        //get index bucket
        //get bucket
        //for each node, get back value at key
        //else return nothing
    public V get(K key){
        int index = getBucketIndex(key);
        LinkedList<Node<K, V>> bucket = buckets[index];
        for(Node<K, V> node : bucket){
            if(node.key.equals(key)) {
                return node.value;
            }
        }
        return null;
    }

    //remove
//        get index
    //get node
    //remove if key exists
    public void remove(K key){
        int index = getBucketIndex(key);
        LinkedList<Node<K, V>> bucket = buckets[index];
        bucket.removeIf(node -> node.key.equals(key));
    }

    public static void main(String[] args) {
        LinkedListHashMap<String, Integer> map = new LinkedListHashMap<>();
        map.put("apple", 1);
        map.put("banana", 1);
        map.put("orange", 1);

        System.out.println("apple: " + map.get("apple")); // Output: 1
        System.out.println("banana: " + map.get("banana")); // Output: 2

        map.put("apple", 10);  // Update value for key "apple"
        System.out.println("apple (updated): " + map.get("apple")); // Output: 10

        map.remove("banana");
        System.out.println("banana (removed): " + map.get("banana"));

    }
}
