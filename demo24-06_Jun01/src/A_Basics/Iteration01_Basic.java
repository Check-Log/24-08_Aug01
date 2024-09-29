package A_Basics;

import java.util.*;

public class Iteration01_Basic {

    public void run(){
        System.out.println("------------------Iterator Techniques, Basic-------------------------");
        //Iterator techniques, Basic
        ArrayList<String> players = new ArrayList<String>();
        players.add("Red");
        players.add("Blue");
        players.add("Green");

        //1. For-loop
        System.out.println("For loop index:");
        for(int x=0; x<players.size();x++){
            System.out.print(players.get(x)+ " , ");
        }
        //2. For-loop advanced, colon
        System.out.println("\n" + "For loop Advanced:");
        for (String name : players) {
            System.out.print(name + " , ");
        }

        //3. while loop
        System.out.println("\n" + "While Loop:");
        int count = 0;
        while (players.size() > count) {
            System.out.print(players.get(count) + " , ");
            count++;
        }

        //4/ do-while loop

        //5. Iterator
        System.out.println("\n" + "Iterator: ");
        Iterator<String> iter = players.iterator();
        while(iter.hasNext()){
            System.out.print(iter.next() + " , ");
        }

        System.out.println("------------------------------------------------------");
        //remove any player who's name starts with b
        Iterator<String> iter2 = players.iterator(); // you need to make a new iterator, since these can only be used once (predates java 8)
        while(iter2.hasNext())
        {
            String e = iter2.next();
            if(e.charAt(0)=='B'){
                iter2.remove();
            }
        }
        players.forEach(result -> System.out.println("Avast landlubber, I'm " + result));

    }





}
