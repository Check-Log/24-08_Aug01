package Practicals02;

import java.util.ArrayList;

public class PA_Practical01 {
    public void run(){
        /*
        Write a method that checks for vowels (a,e,i,o,u) in a string (return boolean).

        boolean hasVowels(String input) {
        ---ANSWER HERE—


        }
        (e.g.: Input: “3JHAEOYuqpl8X”; Returns: true)

         */

        //String str1 = "3JHAEOYuqpl8X";
        String str1 = null;
        System.out.println("PA1, Given: " + str1 + ", answer is: " + hasVowels(str1));


    }

    boolean hasVowels(String input) {
        //---ANSWER HERE—
        /*
        check string for vowels
        put string in char array
        if array element is x == "a" || x == "e"  || x == "i"
        then flag = true

         */
        boolean flag = false;

        try{
            char[] arr1 = new char[input.length()];
            //ArrayList<String> arr1 = new ArrayList<String>();
            for (int i = 0; i < input.length(); i++) {
                //arr1.add(input.charAt(i));
                arr1[i] = input.charAt(i);
            }

            for (int i = 0; i < arr1.length; i++) {
                if(arr1[i] == 'a' || arr1[i] == 'e' || arr1[i] == 'i' || arr1[i] == 'o' || arr1[i] == 'u')
                {

                    flag = true;
                    break;
                }
            }
        }
        catch(NullPointerException ex){

        }

        return flag;
    }


}
