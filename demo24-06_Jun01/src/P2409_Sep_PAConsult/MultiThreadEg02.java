package P2409_Sep_PAConsult;

public class MultiThreadEg02 {

    public static void main(String[] args) {
        run();
        //https://www.w3schools.com/java/java_threads.asp
    }

    public static void run(){

        //use IsAlive to avoid concurrency problems
        int ammoCount = 9;
        AdderThread th1 = new AdderThread(33);
        th1.start();


        while(th1.isAlive()){
            System.out.println("Waiting...");
        }
        //this statement won't occur until the previous thread has finished.
        System.out.println("Ammo-count: " + ammoCount);
    }
}