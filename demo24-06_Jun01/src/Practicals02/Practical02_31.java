package Practicals02;

import java.util.*;
import java.util.stream.Collectors;

public class Practical02_31 {

    public void run(){

        System.out.println("For 01 given: " + "answer is: " + method02());


    }

    public int method02(){

        Map<String, Integer> numbers = new HashMap<>();
        numbers.put("Luffy", 5);
        numbers.put("Zoro", 6);
        numbers.forEach((key,value) ->{
            System.out.println(key + " has a bounty of: "+ value);

        });

        List<Integer> list02 = Arrays.asList(8,1,3,4,2,9);
        List<Integer> list03 = list02.stream().toList();
        list03.forEach(System.out::print);
        System.out.println();
        list03.forEach(result -> System.out.print(result + " , "));
        List<Integer> list04 = list03.stream().sorted().collect(Collectors.toList());
        System.out.println();
        list04.forEach(result -> System.out.print(result + " , "));
        System.out.println();

        List<String> playerNames = new ArrayList<>(); //create new list, sub-type arrayList
        playerNames.add("Isabelle");
        playerNames.add("Digby");
        playerNames.add("Tom");
        Spliterator<String> namesSpliterator = playerNames.spliterator(); //Create Spliterator
        System.out.println("spliterator");
        namesSpliterator.forEachRemaining(System.out::println);



        return 0;
    }
}
