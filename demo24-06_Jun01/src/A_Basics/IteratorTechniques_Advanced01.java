package A_Basics;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class IteratorTechniques_Advanced01 {

    public void run(){
        System.out.println("------------------Iterator Techniques, Advanced-------------------------");
        //1. Foreach & Lambda, (stupid arrow thing), (NO STREAM YET)
        //How to get map of Country and a count of cities that begin with L?
        /*
        Foreach Is very useful for checking each object in a List/ArrayList
        Foreach often means using lambda expressions
        Lambda expressions always involves user-term: “result”
        Lambda expressions with maps involves user-terms: “key, value”
         */

        Map<String, ArrayList> countries = new HashMap<>();
        ArrayList irishCities = new ArrayList();
        irishCities.add("Cork");
        irishCities.add("Dublin");
        irishCities.add("Limerick");
        irishCities.add("Mayo");
        ArrayList englishCities = new ArrayList();
        englishCities.add("London");
        englishCities.add("Liverpool");
        englishCities.add("Nottingham");
        countries.put("Ireland",irishCities);
        countries.put("England",englishCities);
        countries.forEach((key,value) -> {//use for-each to iterate through each countries element in turn
            for(int i=0; i<value.size(); i++){ //use for-loop to iterate through each xCities element in turn
                if(value.get(i).toString().charAt(0) == 'L') {
                    System.out.println(value.get(i).toString() + " begins with L"); //check to see if list element begins with L
                }
            }
        });

        //--------------------------------------
        //2. Stream, mapping to Integer,  How to get all the irish cities?
        int sum = countries.values().stream().mapToInt(List::size).sum(); //sum all the countries
        System.out.println("Total sum of elements in countries: " + sum);

        //-----------------------------------------
        //3. Stream, use of foreach to print stuff, making a bunch of List-collections
        //A stream is a sequence of elements from a data-source; often a collection or an array.
        // The sequence uses the data-source wrappers to do bulk-processing on the data-source.
        //Streams never edit the data source. And this originates from java.util.stream
        System.out.println("Stream-Iterator techniques");
        List<String> list1 = Arrays.asList("9", "A", "Z", "1", "B", "Y", "4", "a", "c"); //make an arrayList
        List<String> collectedList1 = list1.stream().collect(Collectors.toList()); //make a stream based on a collection list based on the arrayList
        System.out.print("collectedList1:");
        collectedList1.forEach(System.out::print);//forEach

        List<String> sortedList2a = collectedList1.stream().sorted().collect(Collectors.toList()); //make a stream based on an existing collection list
        System.out.print("\n" + "sortedList2a:   ");
        sortedList2a.forEach(System.out::print); //forEach

        List<String> sortedList2b = list1.stream().sorted().collect(Collectors.toList()); //make a stream based on a collection based on the arrayList
        System.out.print("\n" + "sortedList2ab:   ");
        sortedList2b.forEach(System.out::print); //forEach

        //-----------------------------------------------------------------
        //https://stackify.com/streams-guide-java-8/ (ctrl+f for builder)
        //create an array of FortnitePlayers

        FortnitePlayer[] fortnitePlayers ={ //make new playerList arrayList
                new FortnitePlayer(1,"Monkey Luffy",20000.00), //add each element (a new object)
                new FortnitePlayer(2,"Nami Satsume",15000.00),
                new FortnitePlayer(3,"Usopp Yessap",10000.00)
        };
        List<FortnitePlayer> fortnitePlayersList = Arrays.asList(fortnitePlayers); //create new list
        fortnitePlayersList.stream(); //perform stream on list
        Stream.Builder<FortnitePlayer> playStreamBuilder = Stream.builder(); //create a stream-builder
        //Stream<FortnitePlayer>playStream = playStreamBuilder.build(); //create stream
        //public void whenIncrementSalaryForEachEmployee_thenApplyNewSalary() {
        // 			fortnitePlayersList.stream().forEach(e -> e.salaryIncrement(10.0));
        //}
        //-----------------------a
        //I can make a stream-builder and accept array elements into it, but what work can I do with it?
        Stream.Builder<FortnitePlayer> fortnitePlayerStreamBuilder = Stream.builder();
        fortnitePlayerStreamBuilder.accept(fortnitePlayers[0]);
        fortnitePlayerStreamBuilder.accept(fortnitePlayers[1]);
        fortnitePlayerStreamBuilder.accept(fortnitePlayers[2]);
        Stream<FortnitePlayer>fortnitePlayerStream = fortnitePlayerStreamBuilder.build(); //I can't do anything with this Stream interface!

        //check Coderbytye,
        //bracketcombinations, min window substring, tree constructor bracket matcher, codeland username validation,
        // find intersection, questions Marks, First reverse, first factorial, longest word. react button toggle
        //So far, foreach only prints stuff with that double-colon thing.

        //4a
        //start here with
        //https://www.digitalocean.com/community/tutorials/java-8-stream
        Stream<Integer> stream4a = Stream.of(1,2,3,4);
        Stream<Integer> stream4b = Stream.of(new Integer[]{1,2,3,4});

        List<Integer> myList = new ArrayList<>(); //create new array List
        for(int i=0; i<100; i++) myList.add(i);

        //4b, Spliterator, this cannot be used for map-implemented classes
        List<String> playerNames = new ArrayList<>(); //create new list, sub-type arrayList
        playerNames.add("Isabelle");
        playerNames.add("Digby");
        playerNames.add("Tom");
        Spliterator<String> namesSpliterator = playerNames.spliterator(); //Create Spliterator
        System.out.println();
        namesSpliterator.forEachRemaining(System.out::println); //use foreach remaining to perform actions on Spliterator

        List<Object> arr1 = List.of(1, 2, "a","b","aasf","1", "123", 123);
        //https://www.codewars.com/kata/53dbd5315a3c69eed20002dd/java
        System.out.println("Given a list, " + " the answer is: " + filterList(arr1));



    }

    public List<Integer> filterList(List<Object> arr1) {
                /*
        Filter some objects from an List based on their object-type
        Check each object in turn with a foreach statement
        if result's class equals Integer,
        assign desired-objects to a new List
        */
        List<Integer> arr2 = new ArrayList<>();
        arr1.forEach(result ->
        {
            if(result.getClass() == Integer.class){
                arr2.add((Integer)result);
            }
        });
        System.out.println("bug");
        return arr2;
    }

}
