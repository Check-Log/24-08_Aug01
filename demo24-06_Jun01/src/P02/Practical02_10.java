package P02;

import java.util.Arrays;

public class Practical02_10 {
    public void run(){

        int[] arr = {1,-4,7,12};

        System.out.println("Answer is: " + sum(arr));
        System.out.println("Answer2 is: " + sum2(arr));


    }

    public int sum(int[]arr){

        int total =0
                ;
        for(int x=0; x< arr.length; x++){
            if(arr[x] >0){
                total = total + arr[x];
            }

        }

        return total;
    }

    public static int sum2(int[] arr){
        return Arrays.stream(arr).filter(v -> v > 0).sum();
    }


}
