package P2409_Sep_PAConsult;

public class AdderThread extends Thread
{
    int input;
    public AdderThread(int input){
        this.input = input;
    }
    public void run()
    {
        try {
            // Displaying the thread that is running
            System.out.println("adderThread " + Thread.currentThread().getId() + ", input:" + input + ", output: " + add());
        }
        catch (Exception e) {
            // Throwing an exception
            System.out.println("Exception is caught"); //unhandled exception
        }
    }

    public int add(){
        return 3;
    }
}
