package P2409_Sep_PAConsult;

public class MultiThreadEg01 {
    /*
    Multithreading is a Java feature that allows concurrent execution
    of two or more parts of a program for maximum utilization of CPU.
    Each part of such program is called a thread.
    So, threads are light-weight processes within a process.

    Threads allow a program to operate more efficiently by doing multiple things at the same time.
    Threads can be used to perform complicated tasks in the background without interrupting the main program.

    Threads can be created by using two mechanisms :
    Extending the Thread class
    Implementing the Runnable Interface

    New/born, Runnable, Waiting, TimedWaiting, Termindated
    setDaemon, setName, setPriority, thread.join,
    https://www.tutorialspoint.com/java/java_multithreading.htm
     */

    public static void main(String[] args) {
        run();
    }

    public static void run(){

        //Let's try making and running concurrent threads using the thread class
        int count = 8; // Number of threads
        for (int i = 0; i < count; i++) {
            AdderThread object = new AdderThread(i);
            object.start();
        }
    }
}
