package P2409_Sep03;
/*
Last time this program worked, i had project structure:
SDK:
Language Level:

https://www.simplilearn.com/tutorials/java-tutorial/multithreading-in-java
Scroll down until "Example for Multithreading in Java"
this example isn't working yet, look closer. check the tutorial link above


Multithreading: Executing a process using virtual-processing-entities
independent of each other. These are called threads.
Threads share the same memory location of the process.
Since they're virtual, they are a safer way of executing a process.

Multitasking: minimize execution-time and maximize CPU-utilization
by executing multiple tasks simultaneously. You can achieve the process of multitasking
in Java using two methods, as described below...??

Multiprocessing: purely based on the number of processors available on the host computer.
Every process initiated by the user is sent to the CPU (processor). It loads the registers on the
CPU with the data related to the assigned process.
To perform multiprocessing in Java, the user needs one processor. Therefore, when the
user requests the simultaneous execution of the second process,
the alternate CPU core gets triggered and executes the process.
*/


public class LoginRequest implements Runnable{
    public void run()
    {
        try
        {
            Thread.sleep(100);
            System.out.println("I'm starting some bullshit.");
        } catch (InterruptedException i)
        {
            i.printStackTrace();
        }
        System.out.println("The state of thread t1 while it invoked the method join() on thread t2 -"+ Login.t1.getState());

        try
        {
            Thread.sleep(200);
        }
        catch (InterruptedException ie)
        {
            ie.printStackTrace();
        }
    }
}

