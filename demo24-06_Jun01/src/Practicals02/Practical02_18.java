package Practicals02;

import java.lang.reflect.Array;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;


public class Practical02_18 {
    public void run(){
        //ArrayList arr1 = new ArrayList();
        //arr1.add(3, -1, -1, -1, 2, 3, -1, 3, -1, 2, 4, 9, 3);
        int[] arr1 = {3, -1, -1, -1, 2, 3, -1, 3, -1, 2, 4, 9, 3}; // 5 occurrence of -1
        //System.out.println("Given " + arr1 + " the answer is: " + countMostFrequent(arr1));
        System.out.println("Given " + arr1 + " the answer is: " + countMostFrequent2(arr1));

        //QUESTION: How do i use IntStream Collectors.groupingBy to find the highest value?


    }


    public int countMostFrequent2(int[] collection){
        int highestCount =0;

        //can be done with streams
        // use group by collection
        // then stream again over values of the map we produced from group by, and sort by descending value to give List<Integer> descendingValueList
        // lastly return first element
        // lastly lastly test with empty array {}

        //CONTINUE HERE
        //List<Integer> list = Arrays.stream(collection).mapToObj(Integer::valueOf)
        Map<Integer,Integer> map1 = Arrays.stream(collection).mapToObj(Integer::valueOf)
                .collect(Collectors.groupingBy(i->i, Collectors.reducing(
                0, (whatWeHaveGotSoFar, nextElement) -> whatWeHaveGotSoFar + 1 //reduction for counting
//                        0, (whatWeHaveGotSoFar, nextElement) -> whatWeHaveGotSoFar + 1 //reduction for summing
        )));

        Map<Integer,Long> map2 = Arrays.stream(collection).mapToObj(Integer::valueOf)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        //stream1.collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));


        //OptionalInt op1 = stream1.max();
        //highestCount = op1.getAsInt();

        return highestCount;
    }


    public int countMostFrequent(int[] collection){
        //https://www.codewars.com/kata/56582133c932d8239900002e
        //iterate through array
        //if hashmap does not contain any value equal to arr1[x]
        //then add key arr1[x] to hashmap with value 1
        //if hashmap does contain a value equal to arr1[x], then increment value of hashmap.get(arr1[x])
        //return  hashmap.highestNumber
        // (doesn't seem possible to use hashmap, what data structure type has a getHighestValue method?)


        //Arrays.stream(collection) //RONAN's CODE





        Integer highestValue = null;
        int highestCount = 0;

        Map<Integer,Integer> map1 = new HashMap();
        for(int x=0; x<collection.length;x++){
            int value = collection[x]; //current value
            if(map1.containsKey(value)){
                int count = map1.get(value);
                map1.put(value,++count); //increment counter for known value
                if (count > highestCount){
                    highestCount = count;
                    highestValue = value;
                }
            }
            else {
                map1.put(value,1); //else create new key pair of 1 occurrence
                if (1 > highestCount){
                    highestCount = 1;
                    highestValue = value;
                }
            }
        }
        System.out.println(map1);

        return highestCount;
    }
}
