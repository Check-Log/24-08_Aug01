package A_Basics;


import java.util.*;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Iteration02_Advanced02 {

    public void run(){
        System.out.println("------------------Iterator Techniques, Advanced 02-------------------------");
        /*
        What do you need? Below you is:
        Using streams.map.foreach with lambda expressions on a List (this isn't well-written yet.)
        using stream.filter.reduce....
        Using stream.sorted(Collect) to filter and store a list into a new list
        using stream.filter.collect



         */

        //--------------------------------------------------------
        // Stream-Technique 01: stream.map.foreach, stream.filter.reduce
        //print out the squared version of each number in the list
        List<Integer> number = Arrays.asList(2, 3, 4, 5);
        System.out.println("Number list: " + number);
        System.out.print("Number list stream.mapped (all numbers squared): ");
        number.stream()
                .map(x -> x * x)
                .forEach(y -> System.out.print(y + " "));

        int even
                = number.stream()
                .filter(x -> x % 2 == 0)
                .reduce(0, (ans, i) -> ans + i); //DON'T UNDERSTAND what filter reduce is doing, what is I?
        System.out.println();
        System.out.println("Numbers that are...?: " + even);
        //-------------------------------------
        // Stream-Technique 02: stream.filter.collect(Collectors.toList())
        //list of Strings, return all elements beginning with "s"
        List<String> names = Arrays.asList(
                "Raymond", "Stephanie", "Carl", "Steven");
        System.out.println("Names in list: " + names);
        List<String> result
                = names.stream()
                .filter(s -> s.startsWith("S"))
                .collect(Collectors.toList());
        System.out.println("Names beginning with s: " + result);
        //--------------------------------------------------------
        // Stream-Technique 03: stream.sorted.Collect(Collectors.toList)
        List<String> show //list of strings,
                = names.stream()
                .sorted()
                .collect(Collectors.toList());
        System.out.println("Names in natural order:" + show);
        //--------------------------------------------------------
        // Stream-Technique 04: stream.map.collect(Collectors.toSet)
        List<Integer> numbers //list of integers
                = Arrays.asList(2, 3, 4, 5, 2);

        Set<Integer> squareSet
                = numbers.stream()
                .map(x -> x * x)
                .collect(Collectors.toSet());
        System.out.println(squareSet);


        //--------------------------------------------------------
        // demonstration of map method, NO EXAMPLE?!!
        List<Integer> square //create another list using stream.map and collectors
                = number.stream()
                .map(x -> x * x)
                .collect(Collectors.toList());
        //--------------------------------------------------------

    }

    public void run02(){
        System.out.println("running 02...");
        System.out.println("This example is about Stream Objects, " +
                "you have no idea how they work.");

        System.out.println("Start with simplest example, instantiate String Array");
        System.out.println("First you instantiate the string Array in parenthesis, containing 3 characters");
        String[] arr = new String[]{"a", "b", "c"};

        System.out.println("Now instantiate a stream object of type string called schlong.");
        Stream<String> schlong = Arrays.stream(arr);

        String[] arr01 = new String[]{" clitoris", "labia"};
        Stream<String> stream02 = Arrays.stream(arr01);


        //schlong.parallel().forEach(element -> doWork(element));

        List<String> cockList = new ArrayList<>();

        //Arrays.stream(arr01).forEach();


        //-------------------------------------------------------------------------------------------------
        //-------------------------------------------------------------------------------------------------
        System.out.println("Follow this example (completed 17th Apr 2024)");
        /*
        * A Stream object is a wrapper that contains a data-source, typically Arrays, List or Maps.
        * You usually use it to iterate through and perform useful operations on complex objects with lots of elements.
        * It was introduced in Java 8 and still seems to be relevantly useful.
        */

        //https://stackify.com/streams-guide-java-8/

        //First create an ArrayList, input string, called perks
        ArrayList<String> perks = new ArrayList();
        perks.add("drunk");
        perks.add("stupid");

        //second  create a Map (value and key, integer and string) called moves, instantiate/cast as Hashmap
        Map<Integer, String> moves = new HashMap<>();
        moves.put(0,"strike");
        moves.put(1,"block");

        //instantiate an Array of type Player called arrayOfPlayers
        Player[] arrayOfPlayers = {
                new Player(01, "Adam", 50,5.75f,perks, moves),
                new Player(02, "Barbara", 100,5.75f,perks, moves),
                new Player(03, "Carol", 600,5.75f,perks, moves)
        };

        //Create list of type players, instantiate by using your array.asList()
        List<Player> listOfPlayers = Arrays.asList(arrayOfPlayers);

        //create Stream of type Player, instantiate with array of Players
        Stream<Player> stream03 = Stream.of(arrayOfPlayers);

        //create a Stream of type Player, instantiate it using your previous array.asList
        Stream<Player> stream04 = listOfPlayers.stream();

        //We can now use lambda expressions to manipulate this Stream object into doing something useful
        //we'll look at this tomorrow (currently 16th April 2024)

    }

    public void run03() {
        System.out.println("running 03...");
        //Stream objects are wrappers that contain a data-source often arrays or lists,
        // but we can use them for basic sets of data too.
        //You could create a Stream object, with data-source string


        System.out.println("---------------------------------------------------------------------");
        //TASK: Convert a string "lego,bionicle,k'nex" into a substrings-list based on regular expression ", " (REGEX)
        String brands = "lego, bionicle, k'nex";
        //first create a Pattern object called pattern, assign Pattern.compile(REGEX)
        //instantiate with a static call to Patterns class
        Pattern pattern = Pattern.compile(", ");
        //then create stream object, type string, called brandString and assign pattern.splitAsStream
        Stream<String> brandStream = pattern.splitAsStream(brands);
        //convert it to a string list, instantiate it with your stream.collect(Collectors.toList)
        List<String> list05  = brandStream.collect(Collectors.toList());
        //List<String> result = language.collect(Collectors.toList());
        //create arrayList, type String called arrayList05, populate with list05
        System.out.println("list05.size(): " + list05.size());
        System.out.println("list05 contains");
        list05.forEach(System.out::println);
        list05.forEach(result -> System.out.print("[" + result + "]"));
        System.out.println();

        System.out.println("---------------------------------------------------------------------");
        //TASK: Convert a fruit-stream into a list
        //first create a stream object, of type string called fruit
        Stream<String> fruit = Stream.of("apple", "banana", "orange");
        //Convert a Stream to List
        List<String> fruitList01 = fruit.collect(Collectors.toList());
        System.out.println("result.size: " + fruitList01.size());
        System.out.print("Fruit list01: ");
        fruitList01.forEach(System.out::print);


        System.out.println("---------------------------------------------------------------------");
        //TASK: Create a set of 10 players using a Stream wrapper, and print their names
        //Create a perks List
        ArrayList<String> perks = new ArrayList<>();
        perks.add("Strike");
        perks.add("Block");
        //create stream object, type player, called players09
        //instantiate using stream.generate, lambda expression
        Stream<Player> players09 = Stream.generate(() -> new Player(1,"Adam",perks)).limit(10);
        //use the aggregate function foreach to print the names
        //players09.forEach(System.out::println); //this does print, but it's pointless (shorthand lambda)
        players09.forEach(e -> System.out.println(e.getPlayerName())); //use this lambda expression ()

        System.out.println("---------------------------------------------------------------------");
        //TASK: Reverse a list of integers by using stream and sorted.comparator libraries
        //create list of of type integer, assign array.asList
        List<Integer> launchCodes = Arrays.asList(5, -10, 7, -18, 23);
        System.out.println("Launch codes: ");
        launchCodes.forEach(result -> System.out.print(result + ", "));
        //create stream object of type list, instantiate with stream.sorted (to convert to stream)
        Stream<Integer> launchCodeStream = launchCodes.stream().sorted();
        List<Integer> reverseLaunchCodes = (launchCodeStream.sorted(Comparator.reverseOrder())).collect(Collectors.toList());
        //List<Integer> reverseLaunchCodes = launchCodeStream.collect(Collectors.toList()); //This won't work, you can't multi-operate a stream
        System.out.println("\n" + "Reverse launch codes:");
        reverseLaunchCodes.forEach(result -> System.out.print(result + ", "));

        System.out.println("---------------------------------------------------------------------");
        //TASK: find one for stream filter



    }
}
