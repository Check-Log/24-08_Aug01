package Finalized_24;

public class ProgramStaticRun {
    /*
    Program purpose: Demonstrate how to make a class statically runnable
    "main" is a java keyword use this to make the program capable of static running.
     */
    public static void main(String[] args) {
        ProgramStaticRun p1 = new ProgramStaticRun();
        p1.run();
    }

    public void run(){
        System.out.println("given: " + ", answers is:" + method01());
    }
    public String method01(){
        return "Rigid and thick";
    }
}