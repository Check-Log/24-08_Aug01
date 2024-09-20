package P02;

import java.util.ArrayList;
import java.util.List;

public class Practical02_21 {

    public void run(){
        //https://www.codewars.com/kata/5877e7d568909e5ff90017e6
        //QUESTION: Why am i detecting 4 times more digit-combos for 10,3 than i should be?

        int sumDigits = 10;
        int numDigits = 3;
        System.out.println("P21, Given sumDigits: " + sumDigits
                + ", and numDigits: " + numDigits
                + ",\n answer is: " + findAll(sumDigits,numDigits));

    }

    /*
    for x < digitNum

     */




    public static List<Long> findAll(final int sumDigits, final int numDigits)
    {
        List<Integer> list1 = new ArrayList();
        List<Long> list2 = new ArrayList();
        int lowerLimit =  getLowerLimit(numDigits);
        int upperLimit = getUpperLimit(numDigits);

        for (int i = lowerLimit ; i <= upperLimit; i++)
        { //type fori
            int j=i; //variable for changing-index
            int sum = 0;
            list1 = new ArrayList();
            while (j > 0)
            {
                list1.add(j % 10); //501 -> 1 //50 -> 0 //5 -> 5
                j = j / 10;
            }

            if(i==333){
                System.out.println("bug");
            }

            for (int k = 0; k < list1.size(); k++)
            { //get sum of j's digits
                sum = sum + list1.get(k);
            }

            if (sum == sumDigits)
            {
                list2.add(Long.valueOf(i));
            }
        }

        return List.of(Long.valueOf(list2.size()), list2.get(0),list2.get(list2.size()-1));
    }

    public static int getLowerLimit(int numDigits){
        Integer num1=1;
        for(Integer x=0;x<numDigits-1;x++)
        {
            num1 = Integer.parseInt(num1 + "" + 0);
        }

        return num1;
    }

    public static int getUpperLimit(int numDigits){
        Integer num1 = 1;

        for(Integer x=0;x<numDigits;x++)
        {
            num1= num1 * 10;
        }
        --num1;

        return num1;
    }
}

    /*
        x=0 iterate through this until <1000
        118
        assign this value to num1
        y=0 iterate through num1.charAt until 2
        if num1.charat(0) + num1.charat(1) + num1.charat(2) = 10 then
        list.add(num1)
        return list

        sum = 11
       numDigits = 4

        getUpperLimit:
        limit =9
        for z =0; z < numDigits+1
        limit = limit.parseInt(9)
        return 9999

        getLowerLimit
        limit = 1
        for loop
        limit = limit.parse(0) until 3

        checkForTotalling numbers
        for(x=getLowerLimit(numDigits); x<getUpperLimit(numDigits); x++) 9999
            1180
            newSum = 0;
            for x.charAt(y)
            newSum = newSum + x.charAt(y)
            list1.add(newSum)

        x=0 iterate through this until =9999
        1118
        assign this value to num1

        y=0 iterate through num1.charAt until 2
        if num1.charat(0) + num1.charat(1) + num1.charat(2) = 10 then
        list.add(num1)
        return list


     */
