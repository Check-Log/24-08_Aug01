package Practicals02;

import java.util.ArrayList;
import java.util.HashMap;

public class Practical02_26 {

    //https://www.codewars.com/kata/51e056fe544cf36c410000fb
    public void run(){

        String str1 = "In a village of La Mancha, the name of which I have no desire to call to " +
                "mind, there lived not long since one of those gentlemen that keep a lance " +
                "in the lance-rack, an old buckler, a lean hack, and a greyhound for " +
                "coursing. An olla of rather more beef than mutton, a salad on most " +
                "nights, scraps on Saturdays, lentils on Fridays, and a pigeon or so extra " +
                "on Sundays, made away with three-quarters of his income.";
        System.out.println("Given: " + "answer is: " + method02(str1));

    }

    public int method02(String str1){

        /*
        this will involve counting object instances
        first filter individual words from the string
        re-assign each word to a string array

       Reading strings and making substrings
       for string.charat(a)
       if == " "
       arr1.add (str1.substring(0,i))
       str2 = str1.substring(0,i)

        also assign each word to a string hashmap<string, int>
        foreach  string array
        for hashmap if hashmpa result == string array result
        increment hashmap value

       foreach hashap result -> if result > largestCount
       largestCount = x


         */
        String str2 = str1;
        String[]arr1;
        ArrayList<String> arr2 = new ArrayList<>();
        //for (int i = 0; i < str2.length()-1 ; i++) {
        int i=0;
        while(str2.length() !=0) {
            if(str2.length() < 20){
                System.out.println("bug");
            }
            if(str2.charAt(i)==' '){
                arr2.add(str2.substring(0,i));
                str2 = str2.substring(i+1);
                System.out.println("bug");
                i=0;
            }
            else if(str2.contains(" ") == false){
                arr2.add(str2);
                break;
            }
            else{
                i++;
            }

        }
        arr2.forEach(result -> System.out.print(result + " , "));
        System.out.println();
        HashMap<String, Integer> map1 = new HashMap<>();
        arr2.forEach(result -> map1.put(result,0));



        arr2.forEach(result -> {
            map1.forEach((key,value) -> {
                if(key == result){
                    value++;
                    System.out.println();
                }
            });
            System.out.println("bug");
        });

        System.out.println("bug");



        return 0;
    }


}
