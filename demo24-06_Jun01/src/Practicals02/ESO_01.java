package Practicals02;

import java.util.ArrayList;
import java.util.List;

public class ESO_01 {

    public void run()
    {

        String str1 = "apple";
        System.out.println("Given: " + str1 + ", answer is: " + inverseString(str1));


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
