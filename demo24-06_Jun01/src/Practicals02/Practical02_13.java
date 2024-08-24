package Practicals02;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.stream.Stream;

import static java.util.Arrays.stream;

public class Practical02_13 {

    public void run(){
        //https://www.codewars.com/kata/search/java?q=&tags=Arrays&beta=false&order_by=popularity%20desc

        int arr1[] = {0,1,2,3,5};
        System.out.println("You provided: " + Arrays.toString(arr1) + ". Return: " + method02(arr1));


    }

    public int method02(int[]arr1){

        //Stream<Array> arr2 = Stream.<Array>builder().build(arr1);

        //stream(arr1).sum(arr1);
        return stream(arr1).sum();
        //return Arrays.stream(arr1).sum();
        //return Arrays.stream(arr1).asDoubleStream().sum();
    }

}
