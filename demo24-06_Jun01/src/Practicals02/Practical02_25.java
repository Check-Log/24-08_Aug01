package Practicals02;

import java.util.ArrayList;
import java.util.List;

public class Practical02_25
{
    public void run(){

        ArrayList<Object> arr1 = new ArrayList();
        //ArrayList<Object> arr1;
        arr1.add(1);
        arr1.add(2);
        arr1.add("a");
        arr1.add("b");

        List<Object> arr2 = List.of(1, "a","b",0,15);
        List<Object> arr3 = List.of(1, 2, "a","b","aasf","1", "123", 123);

        //https://www.codewars.com/kata/53dbd5315a3c69eed20002dd/java

        System.out.println("Given: " + "answer is: " + filterList(arr3));



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

    public ArrayList<Integer> filterArrayList(ArrayList<Object> arr1)
    {

        ArrayList<Integer> arr2 = new ArrayList<>();
        arr1.forEach(result ->
        {
            if(result.getClass() == Integer.class){
                arr2.add(((Integer)result));
            }

        });

        arr2.forEach(result -> System.out.print(result + " , "));
        return arr2;
    }
}
