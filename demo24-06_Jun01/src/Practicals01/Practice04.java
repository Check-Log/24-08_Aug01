package Practicals01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Practice04 {

    public void run() throws IOException {
        //https://www.codewars.com/kata/5cd4aec6abc7260028dcd942
        // Enter data using BufferReader, and read data with method readLine()
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Please provide a number.");
        String input = reader.readLine();
        int num = Integer.valueOf(input);

        System.out.println("You provided: " + num);

        int num2 = num;
        int count =0;
        while (num2 !=1){
            if(num2 %2 == 0){
                num2 = num2/2;
                count++;
            }
            else{
                num2--;
                count++;
            }

        }

        System.out.println("From 1, it takes " + count + " steps to reach "  + num);


        //This is what you need for passing the test in javascript
        /*
        function shortestStepsToNum(num) {
          // Good Luck!

                //int num2 = num;
                var count =0;
                while (num !=1){
                    if(num %2 == 0){
                        num = num/2;
                        count++;
                    }
                    else{
                        num--;
                        count++;
                    }
                }

          return count;
        }



         */

    }
}
