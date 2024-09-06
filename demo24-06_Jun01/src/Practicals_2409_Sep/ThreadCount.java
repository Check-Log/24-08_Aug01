package Practicals_2409_Sep;


//https://www.simplilearn.com/tutorials/java-tutorial/multithreading-in-java
//this example isn't working yet, look closer. check the tutorial link above


public class ThreadCount extends Thread {
   public ThreadCount() {

        super("Overriding Thread Class");
        System.out.println("New thread created" + this);
        start();
    }


    public void run() { //Run Method

        try {

            for (int i = 0; i < 10; i++) {

                System.out.println("New thread created" + this);
                System.out.println("bug");

                Thread.sleep(1500);

            }

        } catch (InterruptedException e) {

            System.out.println("Currently executing thread is interrupted");

        }

        System.out.println("Currently executing thread run is terminated");

    }
}

