package P02;

import java.util.ArrayList;
import java.util.List;

public class ESO_02 {

    public void run()
    {

        String str1 = "raceecar";
        System.out.println("Given possible palindrome: " + str1 + ", check if this is palindrome: " + isPalindrome(str1));

    }

    public boolean isPalindrome(String str1){
        /*
        get string, middle letter is always the same
        no
        find middle character/s
        find size of str, it is 15
        find middle, separate into different substrings
        so count to middle which is 7 and 8 (0-7) (8-15)
        for str1 if size is 8, 8/2 = 2
        14 % 2 = 0
        if 0 then str2 =  str1.substring(0, division*2)
        and str3 = str1.substring(division*2, str1.length)

        else if remainder, then two middle characters
        race ecar



        //separate into  substrings str2 and str3
         */
        //assuming account for racecar or raceecar
        /*

        different method for each substring, count up or down from middle
        compare substrings,
        if true return true




         */
        int str_size =0;
        str_size = str1.length();
        String str2 =  "";
        String str3 = "";
        boolean result = false;

        if(str_size%2 ==0){ //if input results in no remainder (raceecar)
            str2 =  str1.substring(0, str_size/2);
            str3 = str1.substring((str_size/2)-1,str_size-1);//8/2 = 4
        } else if (str_size%2 ==1) //if uneven number of characters, midpoint will be x/2-1
        { //racecar racecar tseo

            str2 = str1.substring(0,str_size/2);
            str3 = str1.substring((str_size/2)+1, str_size); //
        }

        String str4 = inverseString(str3);

        for (int k = 0; k < str2.length(); k++) {
            //for
            if(str2.charAt(k) != str4.charAt(k)){
                result = false;
                break;
            }
            result = true;
        }





        return result;
    }

    public String inverseString(String str1){
        //take str1, read through it and store each character into a list
        //for loop back trhough list and append to a new string str2
        List list1 = new ArrayList<>();
        for (int i = 0; i < str1.length(); i++) {

            //char x = str1.charAt();
            list1.add(str1.charAt(i));
            //System.out.println("bug");

        }

        String str2="";
        //for loop back through list and append to a new string str2
        for (int j = list1.size()-1; j >= 0 ; j--) {
            str2 = str2+list1.get(j);
        }
        System.out.println("str2: " + str2);

        return str2;
    }


}
