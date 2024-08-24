package A_Basics;

public class MultiThread01 implements Runnable {

    /*
    follow this example:
    https://www.geeksforgeeks.org/multithreading-in-java/




    */

    public void run()
    {
        try
        {
            System.out.println("Thread[" + Thread.currentThread().getId() + "] is running.");
        }catch(Exception e){
            System.out.println("Exception is caught.");
        }
        finally {
            System.out.println("done");
        }

    }



    public void method02(){

    }
}
