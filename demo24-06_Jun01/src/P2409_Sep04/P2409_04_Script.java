package P2409_Sep04;

public class P2409_04_Script {
/*
https://medium.com/@jbhyunikim/5-multithreading-options-in-java-54905c657b2b

Multithreading: Executing a process using independent virtual-objects that run separate instances. These are called threads.
Threads share the same memory location of the process.

There are two ways to use threads in java, implement runnable interface, or extend from a thread superclass.
The example below implements library Runnable.

Create 3 threads that are defined by class CustomTask
CustomClass implements Library Runnable, which has a special/confusingly-vague method "run"
If a Runnable class is assigned to a thread, "run" can be activated by keyword "start"
You can do lots of things with threads: start, join

Start two of the threads but you don't want the third thread starting until the first thread is finished/rejoined

 */

    public void commence(){

        Thread a = new Thread(new CustomTask("Apple",5));
        Thread b = new Thread(new CustomTask("Banana", 10));
        Thread c = new Thread(new CustomTask("Carrot", 5));

        try {
            a.start();
            b.start();
            // c starts after a is finished.
            a.join(); //join: prevents any other thread from occurring until X is finished. ("c" can't start until "a" rejoins.)
            c.start();
        }catch(InterruptedException iE){
            iE.printStackTrace();
        }

        // a, b start running first.


        //a.run();
        //b.run();
        //c.run();
    }
}
