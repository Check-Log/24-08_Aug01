package A_Basics;



import ABC_Principles_DependencyInversion.Entities.Customer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class BasicObjectInitialisation {

    public void run(){
        System.out.println("------------------Object Initialisation-------------------------");
        //------------------------------------
        //Object Types, initialisation
        //Methods can only accept raw data from a primitive-type

        //1. Basic types(Primitive/Non-primitive): int, float, double, char, String
        int a = 5;
        float fl = 5.75f; //data-type that can store fractional numbers
        double db= 19.999d;
        char ch = 'a';
        //also add  byte, short, long, double

        String str1 = "hello"; //non-primitive

        //2. Basic Arrays, int, string (you need to initialize their size)
        //you can't use add and put on these
        int[]numArray= new int[10];
        char[] charArray = new char[5];
        charArray[0] = 'a';
        String[] strArray = new String[100];
        strArray[0] = "Cause people called me a failure, i'll prove them wrong.";

        //4. Advanced Arrays, ArrayList and Map
        //ArrayList and Map, are not primitive, hence you can't pass them as raw data, it has to be an object
        ArrayList perksList = new ArrayList();
        perksList.add("IronSkin");
        Map<Integer,String> movesMap = new HashMap<>();
        var customers = new HashMap<Integer, Customer>(); //alternative way to initialise variables (Java 11 specific)
        movesMap.put(1,"Tackle");

        //5. Class initialisation, instantiate player
        Player player01 = new Player(01, "Red",8.7,677780,perksList,movesMap);
        //instantiate complex object array, Player array
        Player[] runescapePlayers ={
                new Player(01, "Hazel",9.5,677790,perksList,movesMap),
                new Player(02, "Walnut",6.3,134503,perksList,movesMap)
        };


        System.out.println("Player01 stats:");
        System.out.println("Id:" + player01.getPlayerId());
        System.out.println("Name:" + player01.getPlayerName());
        System.out.println("Power:" + player01.getPower());
        System.out.println("Experience Points:" + player01.getExperiencePoints());
        System.out.println("Perks:" + player01.getPerks());
        System.out.println("Moves:" + player01.getMoves().get(1));

        //5. Class initialisation, instantiate Enum.
        // Defines several constants that make up a class
        enum Level{
            LOW,MEDIUM,HIGH
        }
        Level lvl = Level.HIGH;
        System.out.println("lvl: " + lvl);
    }
}
