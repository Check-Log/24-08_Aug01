package Practicals02;

import java.sql.SQLOutput;

public class Practical02_30 {

    /*
        This file explores java 17 introduced "pattern-matching"
        Pattern Matching: Process of getting a type name and bing a variable to it??
        Well basically...
        Allows you...
        Check out these links: https://www.baeldung.com/java-switch-pattern-matching

        Java 17 offers sealed classes, pattern-matching and enhanced switch-expressions.

    */


    public void run(){
        String flag = "B";
        System.out.println("Given: " + flag + ", answer is: " + method02(flag));

    }

    public String method02(String flag){
        //String flag = "b";
        String output = null;

        switch(flag){
            case "A" -> output = "Spit";
            case "B" -> output ="Kick";
            case "C" -> output ="Talk";
            default -> output ="Flee";
        };


        return output;
    }


}
