package P2409_Sep;

public class P01_MultiThreading
{
    /*
    Last time this program worked, i had project structure:
    SDK: "openjdk-18 oracle openjdk version18.0.1"
    Language Level: "SDK default 18 - No new..."

    Current theory:
    My intellij IDE is using a version of jdk, version 18.
    My project structure is saying it's using jdk 22 but this seems to be wrong.

    Solution: I switched my sdk to "openjdk-18",
    then i built, successfully
    then i ran, successfully
    Reason for why this works: Not understood at all.

     */


    public void run(){

        P01_ThreadCount threadCount = new P01_ThreadCount();

        try{

            while(threadCount.isAlive()){

                System.out.println("Main Method Thread will be alive, until it's Child Thread stays alive");

                Thread.sleep(2500); //Sleep method

            }

        }

        catch(InterruptedException e){

            System.out.println("Main Method thread is interrupted");

        }

        System.out.println("Main Method's thread run is terminated" );

    }

}
