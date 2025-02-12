import java.util.concurrent.*;

public class Concurrency {

    // Task to be executed by multiple threads
    static class Task implements Runnable {
        private final String taskName;

        Task(String taskName) {
            this.taskName = taskName;
        }

        @Override
        public void run() {
            // Simulating task execution by printing the task name and sleeping for 1 second
            System.out.println(Thread.currentThread().getName() + " is executing task: " + taskName);
            try {
                Thread.sleep(1000); // Simulate some work
            } catch (InterruptedException e) {
                System.out.println(taskName + " was interrupted.");
            }
        }
    }

    // Task that returns a value using Callable
    static class CallableTask implements Callable<String> {
        @Override
        public String call() throws Exception {
            // Simulating task execution and returning a result after sleeping for 1 second
            System.out.println(Thread.currentThread().getName() + " is executing Callable task");
            Thread.sleep(1000); // Simulate work
            return "Task Completed!"; // Return result
        }
    }

    // Shared resource for synchronization demonstration
    private static int counter = 0;

    // Synchronized method to safely increment the counter
    private synchronized static void incrementCounter() {
        counter++;
        System.out.println("Counter: " + counter);
    }

    // Demonstrating Thread communication (wait, notify, notifyAll)
    private static final Object lock = new Object();

    // Method to demonstrate thread communication
    private static void threadCommunication() {
        // Producer thread
        Thread producer = new Thread(() -> {
            synchronized (lock) {
                try {
                    System.out.println("Producer thread is producing...");
                    Thread.sleep(1000); // Simulate some work
                    lock.notify(); // Notify consumer that it's done
                    System.out.println("Producer thread has finished.");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        // Consumer thread
        Thread consumer = new Thread(() -> {
            synchronized (lock) {
                try {
                    System.out.println("Consumer thread is waiting...");
                    lock.wait(); // Wait for the producer to finish
                    System.out.println("Consumer thread is consuming.");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        // Start both threads
        producer.start();
        consumer.start();
    }

    // Main method to demonstrate concurrency
    public static void main(String[] args) {
        // 1. Thread creation using Thread class
        Thread thread1 = new Thread(new Task("Task 1"));
        Thread thread2 = new Thread(new Task("Task 2"));

        // Start threads
        thread1.start();
        thread2.start();

        // 2. Thread creation using ExecutorService (thread pool)
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        executorService.submit(new Task("Task 3"));
        executorService.submit(new Task("Task 4"));

        // 3. Using ExecutorService with Callable and Future for tasks with results
        ExecutorService executorServiceWithCallable = Executors.newFixedThreadPool(2);
        Future<String> future1 = executorServiceWithCallable.submit(new CallableTask());
        Future<String> future2 = executorServiceWithCallable.submit(new CallableTask());

        try {
            // Get the results from the Future objects
            System.out.println("Result from Future1: " + future1.get());
            System.out.println("Result from Future2: " + future2.get());
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }

        // 4. Demonstrating synchronization (counter increment)
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                incrementCounter();
            }
        });

        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                incrementCounter();
            }
        });

        // Start threads for incrementing counter
        t1.start();
        t2.start();

        // 5. Demonstrating thread communication (wait, notify, notifyAll)
        threadCommunication();

        // Shutdown the executor service
        executorService.shutdown();
        executorServiceWithCallable.shutdown();
    }
}

/*
 * Breakdown:
 * - **Task**: A simple class implementing `Runnable` to demonstrate basic task execution by threads.
 * - **CallableTask**: A class implementing `Callable` to show how to return values from tasks executed by threads.
 * - **ExecutorService**: Demonstrates how thread pool management simplifies thread management and task execution.
 * - **Synchronization**: Ensures thread-safe access to shared resources (`counter`) using the `synchronized` method.
 * - **Thread Communication**: Uses `wait()`, `notify()`, and `notifyAll()` to coordinate the producer-consumer interaction.
 *
 * Pros/Cons:
 * - **Pros**:
 *   - **Efficiency**: `ExecutorService` allows for managing a pool of threads that can be reused, reducing thread creation overhead.
 *   - **Thread Safety**: Using `synchronized` ensures that shared resources like `counter` are accessed safely, preventing race conditions.
 *   - **Ease of Use**: `ExecutorService` abstracts away low-level thread management and simplifies task execution.
 *   - **Communication**: `wait()` and `notify()` methods allow threads to communicate and synchronize efficiently.
 *
 * - **Cons**:
 *   - **Complexity**: Managing multiple threads and synchronizing them can introduce complexity and potential deadlocks.
 *   - **Performance**: Thread context-switching can introduce overhead, and improper management (e.g., too many threads) can reduce performance.
 *
 * Uses:
 * - Concurrency is essential for applications that need to perform multiple tasks concurrently, such as processing large amounts of data, handling multiple requests in web servers, or performing I/O-bound operations.
 * - `ExecutorService` is useful for thread pool management in applications that require executing multiple tasks concurrently.
 * - Synchronization is useful for protecting shared resources in multi-threaded environments.
 *
 * Time/Space Complexity:
 * - **Time Complexity**:
 *   - Thread creation and execution via `Thread` or `ExecutorService` are generally **O(1)**.
 *   - The time complexity of `Callable` tasks depends on the nature of the work being done in the task. In this example, it's **O(1)** for each task, but real-world tasks can vary.
 *   - The `wait()` and `notify()` operations have **O(1)** complexity in terms of time spent waiting or notifying, but they may block threads, causing delays.
 *
 * - **Space Complexity**:
 *   - The space complexity of creating threads is **O(n)**, where **n** is the number of concurrent threads running.
 *   - ExecutorService adds overhead for managing thread pools, but typically the space complexity is proportional to the number of active threads.
 *
 * - **Synchronization** adds minimal space overhead for lock management, but its time complexity could be influenced by the contention on the locked resource.
 */
