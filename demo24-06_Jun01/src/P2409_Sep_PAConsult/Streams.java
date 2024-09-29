package P2409_Sep_PAConsult;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Streams {

   /*
    Used to help swot for PA-consulting technical challenge, 28th Sep 2024

     A stream is a sequence of elements from a data-set; often a collection, list or array.
     The sequence uses the data-set wrappers to process the data in bulk.
     Streams NEVER edit the data source. (originates from java.util.stream)
     Not typically used in Maps.

     */

    public static void main(String[] args) {
        run();
    }

    public static void run(){

        //Let's use streams, first we need a fancy dataset
        //make a Map for some complex objects (arrayLists)
        Map<String, ArrayList> teams = new HashMap<>();
        ArrayList red = new ArrayList<String>();
        ArrayList blue = new ArrayList<String>();
        red.add("scout");
        red.add("heavy");
        red.add("medic");
        blue.add("soldier");
        blue.add("engineer");
        blue.add("sniper");

        teams.put("Team Red",red);
        teams.put("team Blue",blue);

        Stream stream01 = Stream.of(teams);
        System.out.println("sum is: " + teams.values().stream().mapToInt(List::size).sum()); //.values is unique to Map Class
        System.out.println("is: " + teams.values());

        System.out.println("------------------------------------");
        //Make a new list from this map
        List<String> names =   new ArrayList(teams.values());
        //Use Stream to Sort/Collect these values into another list
        //List<String> names2 = names.stream().sorted().collect(Collectors.toList()); //THIS DOESN'T WORK PROPERLY AND I DON'T KNOW WHY.
        System.out.println("-----------------------------------");

        //Steam.sorted.collect, use it to collect a list, all names in natural order
        List<String> students = Arrays.asList("Milo","Ritchie","Reggie","Desmond");
        List<String> candidates02 = students.stream().sorted().collect(Collectors.toList());
        System.out.println("Candidates are: " + candidates02);

        //Stream.map.foreach, use it to print out every list-value where they've had 2 added to them.
        List<Integer> cockSizes = Arrays.asList(1, 4, 6, 11);
        cockSizes.stream().map(x -> x+2).forEach(y -> System.out.println("Wow, now i'm " + y + " inches!"));

        //Stream.filter.collect, use it to collect a list, all names beginning with D
        List<String> candidates = students.stream().filter(s->s.startsWith("D")).collect(Collectors.toList());
        System.out.print("Our candidates include: ");
        candidates.forEach(result -> System.out.println(result));









    }
}
