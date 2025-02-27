import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Main_P2 {
    public static void main(String[] args) {
        // 1. SingleThreadExecutor: Executes tasks one by one using a single thread
        System.out.println("SingleThreadExecutor");
        ExecutorService s0 = Executors.newSingleThreadExecutor(); // Creates an executor with 1 thread
        for (int i = 0; i < 5; i++) {
            s0.execute(new Problem_2()); //5 tasks to be executed one at a time
        }
        System.out.println("Thread Name: " + Thread.currentThread().getName()); // Main thread info
        s0.shutdown(); // Gracefully shuts down the executor after all tasks are done

        System.out.println("--------------------------------------------------------------------");

        // 2. FixedThreadPool: Executes tasks using a pool of threads
        System.out.println("FixedThreadExecutor");
        ExecutorService s1 = Executors.newFixedThreadPool(3); // 3 threads available for tasks
        for (int i = 0; i < 10; i++) {
            s1.execute(new Problem_2()); //10 tasks to the thread pool
        }
        System.out.println("Thread Name: " + Thread.currentThread().getName());
        s1.shutdown();

        System.out.println("--------------------------------------------------------------------");

        // 3. CachedThreadPool: Creates new threads as needed and reuses existing ones
        System.out.println("CachedThreadExecutor");
        ExecutorService s2 = Executors.newCachedThreadPool(); // Creates threads dynamically
        for (int i = 0; i < 10; i++) {
            s2.execute(new Problem_2()); // new threads are created as required
        }
        System.out.println("Thread Name: " + Thread.currentThread().getName());
        s2.shutdown();

        System.out.println("--------------------------------------------------------------------");

        // 4. ScheduledThreadPool: Executes tasks with a delay or at fixed intervals
        System.out.println("ScheduledThreadExecutor");
        ScheduledExecutorService s3 = Executors.newScheduledThreadPool(10); // Thread pool with 10 threads

        // Schedules tasks to run after a delay (5 seconds and 10 seconds)
        s3.schedule(new Problem_2(), 5, TimeUnit.SECONDS); // Task 1 executes after 5 seconds
        s3.schedule(new Problem_2(), 10, TimeUnit.SECONDS); // Task 2 executes after 10 seconds

        s3.shutdown();


    }
}
