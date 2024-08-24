package Practicals02;

import java.util.ArrayList;
import java.util.Arrays;

public class Practical02_12 {
    public void run(){

        int[] numbers = {1,2,3,4,5,6,7,8,9,0};
        String str1 = "003392241";


        System.out.println("The phone number is: " + method02(numbers));

    }

    public String method02(int numbers[]){

        //Arrays.stream(numbers).filter()
        /*
        String str1 = "(";
        for (int x=0; x < numbers.length ;x++)
        {
            if(x==3){
                str1 = str1 + ") ";
                str1 = str1 + String.valueOf(numbers[x]);

            }
            else if(x==6){
                str1 = str1 + "-";
                str1 = str1 + String.valueOf(numbers[x]);
            }
            else {
                str1 = str1 + String.valueOf(numbers[x]);
            }
        }*/
        //pro way, use string.format, then replacement parenthesis (whatever it's called), then use an intStream.of().boxed.toArray
        return String.format("(%d%d%d) %d%d%d-%d%d%d%d", java.util.stream.IntStream.of(numbers).boxed().toArray());

        //return str1;

    }

}
