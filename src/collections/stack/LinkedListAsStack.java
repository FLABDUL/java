package datastructures;

import java.util.LinkedList;

public class LinkedListAsStack {

    public static void main(String[] args) {
        // Create a LinkedList behaving as a stack
        LinkedList<Integer> stack = new LinkedList<>();

        System.out.println("Demonstrating LinkedList as a Stack:");

        // Push elements onto the stack
        System.out.println("\n1. Pushing elements onto the stack:");
        stack.push(10); // Push 10
        System.out.println("Pushed: 10");
        stack.push(20); // Push 20
        System.out.println("Pushed: 20");
        stack.push(30); // Push 30
        System.out.println("Pushed: 30");
        System.out.println("Stack after push operations: " + stack);

        // Peek at the top element of the stack
        System.out.println("\n2. Peeking at the top element:");
        System.out.println("Top of the stack (peek): " + stack.peek());

        // Pop elements from the stack
        System.out.println("\n3. Popping elements from the stack:");
        int popped = stack.pop(); // Pop the top element
        System.out.println("Popped: " + popped);
        System.out.println("Stack after pop: " + stack);

        popped = stack.pop(); // Pop the next top element
        System.out.println("Popped: " + popped);
        System.out.println("Stack after pop: " + stack);

        // Push more elements
        System.out.println("\n4. Pushing more elements onto the stack:");
        stack.push(40);
        System.out.println("Pushed: 40");
        stack.push(50);
        System.out.println("Pushed: 50");
        System.out.println("Stack now: " + stack);

        // Check if the stack is empty
        System.out.println("\n5. Checking if the stack is empty:");
        System.out.println("Is stack empty? " + stack.isEmpty());

        // Clear the stack
        System.out.println("\n6. Clearing the stack:");
        stack.clear();
        System.out.println("Stack after clearing: " + stack);
        System.out.println("Is stack empty? " + stack.isEmpty());
    }

    /*
     * =========================
     * Key Methods Demonstrated:
     * =========================
     * 1. push(E element): Adds an element to the top of the stack.
     * 2. pop(): Removes and returns the top element of the stack.
     * 3. peek(): Retrieves the top element without removing it.
     * 4. isEmpty(): Checks if the stack is empty.
     * 5. clear(): Removes all elements from the stack.
     *
     * =====================
     * Pros of LinkedList as Stack:
     * =====================
     * 1. Dynamic size: Can grow or shrink as needed.
     * 2. Efficient LIFO operations: Push and pop are O(1).
     * 3. Versatile: Can also be used as a queue or deque.
     *
     * =====================
     * Cons of LinkedList as Stack:
     * =====================
     * 1. More memory overhead: Each element stores pointers to the next and previous nodes.
     * 2. Slightly slower than ArrayDeque for stack operations due to pointer dereferencing.
     *
     * ==================
     * Use Cases:
     * ==================
     * 1. Backtracking: Undo operations, recursive calls, and navigating mazes.
     * 2. Expression evaluation: Converting infix to postfix, parsing arithmetic expressions.
     * 3. Depth-first search (DFS) in graphs or trees.
     */
}
