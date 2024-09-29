package P2409_Sep_PAConsult;

import java.util.ArrayList;
import java.util.List;

public class DataSets {

    public static void main(String[] args) {
        run();
    }

    public static void run(){

        //first, lets make a list of data, contents can be either string or integer
        ArrayList<Object> smilingCritters = new ArrayList<Object>();
        smilingCritters.add("DogDay");
        smilingCritters.add("Bobby");
        smilingCritters.add(3);
        smilingCritters.add(4);
        smilingCritters.add("Bubba");
        smilingCritters.add(5);
        smilingCritters.add(6);
        smilingCritters.add(7);

        //create method that filters out numbers
        System.out.print("List contains: ");
        smilingCritters.forEach(result -> System.out.print(result + ", "));
        System.out.println();
        filterList01(smilingCritters).forEach(result -> System.out.println(result));
    }


    public static List<Object> filterList01(List<Object> list01){
        ArrayList<Object> list02 = new ArrayList<>();
        list01.forEach(result -> {
            if(result.getClass() == String.class){
                list02.add(result);
            }
        });
        return list02;
    }

}
