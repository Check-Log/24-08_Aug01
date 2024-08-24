package A_Basics;

import java.util.*;

public class PracticeClass01 {

    //Let's start with for each
    //start by creating an object, a Map of type HashMap, which has string keys and stores values of type arrayList
    //How to get map of Country and a count of cities that begin with L?

    public void run(){

        Map<String, ArrayList> servicers = new HashMap(); //this is a complex object, it must be instantiated.
        //now create arrayList with identifier string
        ArrayList converted = new ArrayList();
        converted.add("Petal");
        converted.add("Lavender");
        converted.add("Marigold");

        ArrayList original = new ArrayList();
        original.add("Penelope");
        original.add("Laura");
        original.add("Mary");

        //now populate the Map of cast type HashMap.
        servicers.put("original",original);
        servicers.put("converted", converted);

        System.out.println("print out servicer.get(key).SecondValueOfArrayList: " + servicers.get("original").get(1));

        //lambda-expression is a block which takes parameters and returns a value
        //they don't need a name and you can implement them right into a method
        //use this lambda expression to process each value of servicers, and run a for-loop to iterate through each character of each arrayList.get(1)Value.toString
        // and identify those beginning with L
        servicers.forEach((key,value) -> {
            for(int x=0; x<value.size(); x++){
                if(value.get(x).toString().charAt(0)=='L')
                {
                    System.out.println(value.get(x).toString() + " begins with L");
                }
            }

        });

        //next get the sum of all the values in the servicers object.
        //Hmm...Servicer contains X arrayLists. get the values of servicer, and get the zie of each value.
        //You'll also need to map them to an int.
        //to do this we need to do an action(check) onthe values of Servicer
        //For such a complex object Servicer, we could do this as part of a stream
        //consider the servicer values, stream them, find sizes
        int sum = servicers.values().stream().mapToInt(List::size).sum();
        System.out.println("Servicers currently total at: " + sum);

        //let's continue with making some more complex objects, like a list
        List<String> appleList = Arrays.asList("a","b");

        //now make another list, and populate it with the values of that first list
        //you can do this using a stream method.
        List<String> import01 = appleList.stream().toList();
        System.out.println("import01 contains: " + import01);

        //you could print out each result by using import01.foreach
        //import01.forEach();







    }
}
