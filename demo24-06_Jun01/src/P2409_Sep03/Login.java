package P2409_Sep03;

public class Login implements Runnable{
/*
https://www.javatpoint.com/life-cycle-of-a-thread

Multithreading: Executing a process using virtual-objects independent of each other. These are called threads.
Threads share the same memory location of the process. Since they're virtual, they are a safer way of executing this process.

there are two ways to use threads in java, implement runnable interface, or extend from a thread superclass.
The example below is a Steam login system. It uses threads to handle multiple users logging in at once.

Rubberduck: This example works but it's not understood.
Login-file creates and runs multiple threads. But so what?
Both of the files use Thread.sleep(200)
You also don't have a superclass example yet.


 */

    public static Thread t1;
    public static Login obj;

    // main method
    public void run01()
    {
    // creating an object of the class ThreadState
        obj = new Login();
        t1 = new Thread(obj);

    // thread t1 is spawned
    // The thread t1 is currently in the NEW state.
        //System.out.println("The state of thread t1 after spawning it - " + t1.getState());
        System.out.println("Started thread: " + t1.getId() + " , current state: " + t1.getState());
    // invoking the start() method on
    // the thread t1
        System.out.println("bug1");
        t1.start();

    // thread t1 is moved to the Runnable state
        System.out.println("Continue thread: " + t1.getId() + " , current state: " + t1.getState());
    }

    public void run() //happens because of runnable
    {
        LoginRequest myObj = new LoginRequest();
        Thread t2 = new Thread(myObj);

        // thread t2 is created and is currently in the NEW state.
        System.out.println("Started thread: " + t2.getId() + " , current state: " + t2.getState());
        //System.out.println("The state of thread t2 after spawning it - "+ t2.getState());
        t2.start();
        System.out.println("bug2");
        // thread t2 is moved to the runnable state
        System.out.println("Started thread: " + t2.getId() + " , current state: " + t2.getState());
        //System.out.println("the state of thread t2 after calling the method start() on it - " + t2.getState());

        // try-catch block for the smooth flow of the  program
        try
        {
        // moving the thread t1 to the state timed waiting
            Thread.sleep(200);
        }
        catch (InterruptedException ie)
        {
            ie.printStackTrace();
        }

        System.out.println("The state of thread t2 after invoking the method sleep() on it - "+ t2.getState() );

        // try-catch block for the smooth flow of the  program
        try
        {
        // waiting for thread t2 to complete its execution
            t2.join();
        }
        catch (InterruptedException ie)
        {
            ie.printStackTrace();
        }
        System.out.println("The state of thread t2 when it has completed it's execution - " + t2.getState());
    }
}
