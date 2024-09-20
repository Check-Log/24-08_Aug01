package P02;

import java.util.*;

public class Practical02_22 {
    //https://www.codewars.com/kata/5877e7d568909e5ff90017e6/java
    //How many numbers III?
    /*




     */
     //System.out.println("Given: " + index1 + " answer is: " + getNth(list01, index1));

    public void run(){
        //https://www.codewars.com/kata/5877e7d568909e5ff90017e6
        //QUESTION: How to format this for the output?

        int sumDigits = 10;
        int numDigits = 3;
        System.out.println("P21, Given sumDigits: " + sumDigits
                + ", and numDigits: " + numDigits
                + ",\n answer is: " + findAll(sumDigits,numDigits));

    }



    public static int[] findAll(final int sumDigits, final int numDigits)
    {
        int lowest= 10^numDigits; //1000 or 1
        int highest=0;
        int[] arr01 = new int[numDigits]; //need to define an array of a certain predetermined size.
        int remainingDigits = numDigits-1;

        for (int x=0; x< arr01.length; x++){
            arr01[x] = 0;
        }
        int finalCount=0; //create default 0 return in format with given variables
        //container for 3d arr elements

        ArrayList<int[]> arr03 = new ArrayList<>(); //containers for all the arrays
        //ArrayList<Integer> arr03 = Arrays.stream(int)



        ArrayList<int[]> list04 = new ArrayList<>();
        for(int x=arr01.length-1; x > 0; x--)
        {
            //arr01= [000]
            int a1 =0; //reset to outer for-loop scope, ready for
            while(a1 <= 9)
            {
                for(int y=0;y<10;  y++)
                {
                    //{0,0,1},{0,0,2},{0,0,3},{0,0,4},{0,0,5}
                    arr01[numDigits-1] =y;
                    System.out.println("total is now: " + Arrays.stream(arr01).sum());
                    if(Arrays.stream(arr01).sum()==sumDigits)
                    { //need to increment through each value and reset previous array

                        //You can't just add an array-values to an arrayList, all it will do is add the memory-location
                        //So you can just do list04.add(arr01)
                        list04.add(Arrays.stream(arr01).toArray());

                        String num1 = String.valueOf(arr01[0]); //num1 = 0
                        for (int i = 1; i < arr01.length; i++) {
                            num1 = num1 + String.valueOf(arr01[i]);
                        }
                        int num2 = Integer.valueOf(num1);

                        if(num2 < lowest){ //starts at 1000
                            lowest = num2;
                        }
                        if(num2 > highest){
                            highest = num2;
                        }
                        finalCount++;

                        System.out.println("found sum"); //arr03 isn't stacking because it isn't being incremented?
                    }
                    System.out.println("bug");
                    //need separate count for the next inner-index, only increment x once the inner counter has been finished

                }
                arr01[numDigits-1]=0;
                a1++;
                if(a1 < 10){
                    arr01[x-1] = a1;
                }
                else if(remainingDigits==1){
                    break;
                }
                else{
                    arr01[x-remainingDigits]++; //go from [0,9,9] -> [1,0,0]
                    arr01[x-1]=0;
                    remainingDigits--;
                }

                //when you reach 0,9,9, increment to 1,0,0
                 //this should only happen once per inner for-loop
            }
        }

        int[]arr02 ={finalCount,lowest, highest};
        return arr02; //x,y,z;
    }
}
