package A_Basics;

import java.util.*;

public class IteratorTechniquesBasic {

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
        Iterator iter = players.iterator();
        while(iter.hasNext()){
            System.out.print(iter.next() + " , ");
        }
    }


}
