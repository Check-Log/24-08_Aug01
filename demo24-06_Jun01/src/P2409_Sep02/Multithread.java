package P2409_Sep02;

public class Multithread {

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
    }

}
