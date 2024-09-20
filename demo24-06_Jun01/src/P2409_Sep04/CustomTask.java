package P2409_Sep04;

public class CustomTask implements Runnable{
/*
https://medium.com/@jbhyunikim/5-multithreading-options-in-java-54905c657b2b

Multithreading: Executing a process using independent virtual-objects that run separate instances. These are called threads.
Threads share the same memory location of the process.

There are two ways to use threads in java, implement runnable interface, or extend from a thread superclass.
The example below uses a run method
 */

    private final String name;
    private final int count;

    public CustomTask(String name, int count) {
        this.name = name;
        this.count = count;
    }

    @Override
    public void run() {
        for (int i = 0; i < count; i++) {
            System.out.println(name + "-" + i + " from " + Thread.currentThread().getName() + ", which has ID: " + Thread.currentThread().getId());
            try {
                Thread.sleep(50); //
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }



    }
}
