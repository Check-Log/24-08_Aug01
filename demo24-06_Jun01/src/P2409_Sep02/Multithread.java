package P2409_Sep02;

public class Multithread {
    /*
    Program's purpose is to demonstrate multithreads.
    Unclear if this is currently working.

     */

    public static void main(String[]args){
        Multithread m1 = new Multithread();
        m1.run();
    }

    public void run(){

        System.out.println("Given: " + "  answer is: ");
        createMultithread();
    }

    public void createMultithread()
    {
        int n = 8; // Number of threads
        for (int i = 0; i < n; i++) {
            MultiThreadingDemo object
                    = new MultiThreadingDemo();
            object.run();
        }
        System.out.println("grasp it firmly");
    }

}
