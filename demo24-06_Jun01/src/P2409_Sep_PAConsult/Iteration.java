package P2409_Sep_PAConsult;

import javax.swing.text.html.HTMLDocument;
import java.util.ArrayList;
import java.util.Iterator;

public class Iteration {

    /*
    Used to help swot for PA-consulting technical challenge, 28th Sep 2024
     */

    public static void main(String[] args) {
        run();
    }

    public static void run(){

        //Iteration is used to process data. So let's make some data
        ArrayList<String> employees = new ArrayList<>();
        employees.add("Luffy"); //arraylists are allocated dynamic memory in the heap that allows them to add on new data unconstrained
        employees.add("Roronoa");
        employees.add("Usopp");
        employees.add("Nami");
        employees.add("Chopper");



        //now that we have some data let's print it to console:
        //For this we'll use a for-loop
        for (int i = 0; i < employees.size(); i++) {
            System.out.println("Ahoy there, i'm " + employees.get(i));
        }
        System.out.println("------------------------------------------------------");

        //Let's get trickier, and use a foreach lambda expression
        employees.forEach(result -> System.out.println("Ahoy! This is: " + result));

        System.out.println("------------------------------------------------------");
        //Okay now a basic while loop:
        int count = 0;
        while(count < employees.size()){
            System.out.println("Ahoy there! I'm " + employees.get(count));
            count++;
        }

        //do-while TBC

        System.out.println("------------------------------------------------------");
        //Finally, let's make an iterator object (these can only be used once.)
        Iterator<String> iter = employees.iterator();
        while(iter.hasNext()){
            System.out.println("Ahoy there landlubber, I'm " + iter.next());
        }


        System.out.println("------------------------------------------------------");
        //how about we remove any employee who's name starts with n?
        Iterator<String> iter2 = employees.iterator(); // you need to make a new iterator, since these can only be used once (predates java 8)
        while(iter2.hasNext())
        {
            String e = iter2.next();
            if(e.charAt(0)=='N'){
                iter2.remove();
            }
        }
        employees.forEach(result -> System.out.println("Avast landlubber, I'm " + result));
    }
}
