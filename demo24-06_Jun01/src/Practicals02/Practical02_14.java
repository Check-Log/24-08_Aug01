package Practicals02;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

public class Practical02_14 {

    public void run(){
        //https://www.codewars.com/kata/53dbd5315a3c69eed20002dd/train/java

        HashMap map01 = new HashMap();
        map01.put(1, "kettle");
        map01.put(2, "Toaster");
        map01.put(3, "Cup");
        map01.put(4, "Basin");
        map01.put(5, "Fork");

        List<Integer> list1 = new ArrayList();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);
        list1.add(5);

        ArrayList<Object> arr01 = new ArrayList<>();
        arr01.add(1);
        arr01.add(2);
        arr01.add("a");
        arr01.add("b");





        System.out.println("You provided: " + arr01 + ". Return: " + filterList(arr01));

    }

    public List filterList(ArrayList<Object>arr01)
    {
        //List list02 = new ArrayList<>();
        //list02 = (arr01.stream().filter(result -> !(result instanceof String)).collect(Collectors.toList()));
        return arr01.stream().filter(result -> !(result instanceof String)).collect(Collectors.toList());

    }


}
