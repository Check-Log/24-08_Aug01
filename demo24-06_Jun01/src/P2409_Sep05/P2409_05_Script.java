package P2409_Sep05;

public class P2409_05_Script
{
    /*
https://www.w3schools.com/java/java_threads.asp

Multithreading: Executing a process using independent virtual-objects that run separate instances. These are called threads.
Threads share the same memory location of the process.
There are two ways to use threads in java, implement runnable interface, or extend from a thread superclass.
Both of these use "run" as a keyword
The example below implements extended superclass.

Create 3 threads that are defined by class CustomTask
CustomClass implements Library Runnable, which has a special/confusingly-vague method "run"
If a Runnable class is assigned to a thread, "run" can be activated by keyword "start"
You can do lots of things with threads: start, join

Start two of the threads but you don't want the third thread starting until the first thread is finished/rejoined

 */

    public void commence(){

        //create 3 threads
        Thread a = new Thread(new LoginRequest("apple", 5));
        Thread b = new Thread(new LoginRequest("banana", 10));
        Thread c = new Thread(new LoginRequest("carrot", 5));

        //threads can be interrupted and delay the program.
        //Hence you need a try catch block that can catch any interruptedException errors
        try
        {
            a.start();
            b.start();
            a.join();
            c.start();
            System.out.println("bug");
        }catch (InterruptedException iE)
        {
            iE.printStackTrace();
        }
    }
}
