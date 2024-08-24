package Practicals02;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Practical02_09 {

    //https://www.codewars.com/kata/523f5d21c841566fde000009/java
    /*
    Your goal in this kata is to implement a difference function, which subtracts one list from another and returns the result.
    It should remove all values from list a, which are present in list b keeping their order.
    Kata.arrayDiff(new int[] {1, 2}, new int[] {1}) => new int[] {2}
    If a value is present in b, all of its occurrences must be removed from the other:
    Kata.arrayDiff(new int[] {1, 2, 2, 2, 3}, new int[] {2}) => new int[] {1, 3}




     function which returns a list

     input 2 lists



     returns list


     */

    public void run(){

        int[] numArray01 = {3,2};
        int[] numArray02 = {2,1};

        ArrayList listA = new ArrayList<>();
        //listA.add(2);
        listA.add(2);
        listA.add(3);


        ArrayList listB = new ArrayList<>();
        //listA.add(2);
        listB.add(1);
        listB.add(2);

        arrayDiff02(numArray01,numArray02);



    }

    public ArrayList<String> arrayDiff02(int[] numArray01, int[] numArray02){


        int[] numArray03;
        //numArray03 = numArray01 - numArray02;


        //return numArray03;
        return null;
    }


    public ArrayList<String> arrayDiff01(ArrayList listA, ArrayList listB){



        ArrayList listC = new ArrayList();


        return listC;
    }



}
