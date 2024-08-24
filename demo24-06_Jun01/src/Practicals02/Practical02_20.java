package Practicals02;

import java.util.LinkedList;

public class Practical02_20 {

    //https://www.codewars.com/kata/55befc42bfe4d13ab1000007
    //LinkedList
    //QUESTION: How do i retrieve a specific value from a linkedList.

    public void run(){

        LinkedList<Integer> list01 = new LinkedList<Integer>();
        Integer index1=0;
        Integer index2=1;

        LinkedList<String>gang = new LinkedList<String>();
        gang.add("Fred");
        gang.add("Daphne");
        gang.add("Velma");
        gang.add("Shaggy");
        gang.add("Scooby");
        System.out.println(gang);


        System.out.println("Given: " + index1 + " answer is: " + getNth(list01, index1));
        System.out.println("Given: " + index2 + " answer is: " + getNth(list01, index2));

    }

    public int getNth(LinkedList list1, Integer index){
        //CONTINUE HERE
        //The example says the input should be type Node which is unknown//Why isn't it LinkedList?
        //What is Node and how do i use it?
        /*
        42, 13, 666


         */
        //Integer answer = (Integer) list1.getFirst();

        //Integer answer = list1.get(index); //GEt ronan's help for this




        return 0;
        //return answer;
    }
}
