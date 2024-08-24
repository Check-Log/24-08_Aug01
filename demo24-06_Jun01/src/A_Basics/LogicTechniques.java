package A_Basics;


import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
import java.util.random.RandomGenerator;

public class LogicTechniques {


    //constructor
    //getters setters
    //run method

    public void run()
    {
        System.out.println("------------------Logic Techniques-------------------------");
        //------------------------------------------------
        //Logic techniques:
        //if else break elif

        //switch case
        //idle, social, attacking, bumble
        String state ="idle";
        int stateNum =1;
        switch (stateNum){
            case 0:
                state = "idle";
                break;
            case 1:
                state = "social";
                break;
            case 2:
                state = "attack";
                break;
        }
        System.out.println("\n" + "Switch-case-break, NPC State is: " + state);

        String playState = "";
        Random rn =  new Random(); //class used to generate a stream of pseudorandom numbers
        int answer = rn.nextInt(4); //from 0 to 3
        System.out.println("random number is: " + answer);

        switch(answer){
            case 0:
                playState = "reasoned with";
                break;
            case 1:
                playState = "frozen";
                break;
            case 2:
                playState = "saved";
                break;
            case 3:
                playState = "diverted";
                break;
        }

        System.out.println("Subject is to be: " + playState);

    }
}
