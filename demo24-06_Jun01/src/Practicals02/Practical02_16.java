package Practicals02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


public class Practical02_16 {

    public void run(){
        //https://www.codewars.com/kata/56f3a1e899b386da78000732
        //return a list of each way a list can be split up with the following requisites
        // into at least 2 sections divide by a comma
        //where neither section is empty
        //the returned answer is a single string that contains each part
        //
        //so for 5 words that would be about 4 different answers
        //Current logic isn't correct.



        //List<String> arr = new ArrayList<>();
        //String[] arr = {"apple", "banana", "cantilope", "damson", "elderberry"};
        String[] arr = {"cdIw", "tzIy", "xDu", "rThG"};
        //arr.add("apple");
        //arr.add("banana");
        //arr.add("cantilope");
        //arr.add("damson");
        //arr.add("elderberry");


        System.out.println("Given: " + arr);

        List<List<String>> result2 = Arrays.stream(partList(arr)).map(Arrays::asList).collect(Collectors.toList());
        System.out.println("Becomes: " + result2);
    }

    public String[][] partList(String[] arr)
    {

        List<String> arr1 = Arrays.asList(arr);
        //ArrayList<ArrayList<String>> allPairs = new ArrayList<>();
        String[][] result =new String[arr.length-1][2];


        for(int x=1; x<arr1.size(); x++){
            //ArrayList<String> pair = new ArrayList<>();
            String[]pair = new String[2];
            pair[0] = getFirstPart(x,arr1);
            pair[1] = getSecondPart(x,arr1);
            result[x-1] = pair;
        }
        return result;
    }

    public String getFirstPart(int x, List<String> arr1){
        String s1 = "";

        for(int y=0; y<x;y++){
            s1 = s1 + arr1.get(y) + " ";
        }
        s1 = s1.substring(0,s1.length()-1);
        return s1;

    }

    public String getSecondPart(int x, List<String> arr1){
        String s1 = "";

        for(int y=x; y<arr1.size();y++){
            s1 = s1 + arr1.get(y) + " ";
        }
        s1 = s1.substring(0,s1.length()-1);
        return s1;
    }


    public ArrayList partList0(String[] arr)
    {

        List<String> arr1 = Arrays.asList(arr);
        ArrayList<ArrayList<String>> allPairs = new ArrayList<>();

        for(int x=1; x<arr1.size(); x++){
            ArrayList<String> pair = new ArrayList<>();
            pair.add(getFirstPart(x,arr1));
            pair.add(getSecondPart(x,arr1));
            allPairs.add(pair);
        }
        return allPairs;
    }

    //a handier solution
    public static String[][] partlist3(String[] arr) {
        String[][] returnArray = new String[arr.length - 1][2];
        for (int i = 0; i < arr.length - 1; ++i) {
            returnArray[i][0] = String.join(" ", Arrays.copyOfRange(arr, 0, i + 1));
            returnArray[i][1] = String.join(" ", Arrays.copyOfRange(arr, i + 1, arr.length));
        }

        return returnArray;
    }
}
