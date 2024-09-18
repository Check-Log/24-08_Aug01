package P01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Practice02 {



    public void run()
    {

        System.out.println("Start running...");

        //start by creating a list with identifier String, (remember that lists depend on the Collection library)
        List<String> list01 = Arrays.asList("Amy", "Cream", "Alison");
        ArrayList<String> arrayList01 = new ArrayList<>();
        arrayList01.add("Rouge");
        arrayList01.add("Surge");

        //print values in list01, iterate through using foreach method
        //we can use double-colon operator as a shorthand lambda-expression
        System.out.println("Print elements:");
        list01.forEach(System.out::print);
        System.out.println("\n-------------------------------");

        //Wanna add spaces? use the standard lambda expression result print and + " "
        list01.forEach(result -> System.out.print(result + ", "));
        System.out.println("\n-------------------------------");

        //Okay now let's take that list and filter any values that start with the letter S
        //take collection type list, use lambda expression on value
        //for loop through the data-set (x=0; x<value.size; x++)
        //if value.tostring.charat
        //if value.charAt(0)=="S"
        //then list01Filtered.addvalue
        //List<String> list01Filtered = Arrays.asList();
        List<String> list01Filtered = new ArrayList<>();
        list01.forEach((vagina) ->
        {
            if(vagina.charAt(0) == 'A')
            {
                System.out.println("test: " + vagina);
                list01Filtered.add(vagina);
                //list01Filtered.add("hello");
            }
        });
        System.out.println("The filtered list contains: ");
        list01Filtered.forEach(result -> System.out.print(result + ", "));


    }
}
