package Practicals02;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.stream.Stream;

public class Practical02_15 {
    public void run(){

        //https://www.codewars.com/kata/545cedaa9943f7fe7b000048
        String str1 = "The quick brown fox jumps over the lazy dog";

        System.out.println("Given: " + str1  + ", checking if this is a pangram: " + method02(str1));
    }

    public boolean method02(String str1){
        boolean b1 = false;
        //store string in arrayList
        //stream. check lambda expression against codex
        //if yes then true
        //for each value of codex, check it str1.contains
        ArrayList<Character> arr1;
        Array[] arr2;
        String str2 = "abcdefghihjklmnopqrstuvwxyz";

        //create stream of string
        Stream<String> str3 = Stream.<String>builder().build();
        //str3.forEach(str1 -> str1.);


        for (int x=0;x<str1.length(); x++){
            for(int y=0; y<str2.length(); y++){
                if(str1.indexOf(x) == str2.indexOf(y)){

                }
            }
        }

        //arr2 = str2.toCharArray();
        //arr1
        //arr1.add();



        return false;

    }

}
