package P02;

public class Practical02_30 {

    /*
        This file explores java 17 introduced "pattern-matching"
        Pattern Matching: Detecting an object's type and binding a specific-type variable to it
        So if you have a generic class Object assigned a value, this helps you filter/assign it to a specific type.
        Typically code involves: (o instance of String s), it's also the hot new thing with switch-cases
        where o is generic class "Object."

        Well basically...
        Allows you...
        Check out these links: https://www.baeldung.com/java-switch-pattern-matching

        Java 17 offers sealed classes, pattern-matching and enhanced switch-expressions.

        covering all values
        ordering subclasses
        handling null values

        instanceof: binary operator used to detect if object is of a given type

        However, it is still a preview feature, so we need to enable preview to use it:
        java --enable-preview --source 17 PatternMatching.java
        java --enable-preview --source 17 Practical02_30.java
        java --enable-preview --source 17 runJunkHere.java

        Actually, it might be easier if you switch jdk to use openjdk-22



    */

    //Object o = 5;
    Object o = 5d;
    Object obj2 = 5f;

    public void run(){
        String flag = "B";
        System.out.println("Given: " + flag + ", answer is: " + method02(flag));
        System.out.println("Given: " + flag + ", answer is: " + method03(flag));
        System.out.println("Given: " + flag + ", answer is: ");
        method04();
        System.out.println("Given an object: " + ", answer is: " + getDoubleUsingIf(o));
        System.out.println("Given an object: " + " object is: " + getObjectType(obj2));
        //to use pattern-matching switch, you'll need to go to project structure, project settings, language level: 17(preview pattern switching)
    }

    public void method05(){

    }

    double getDoubleUsingIf(Object o){
        double result;
        if(o instanceof Integer){
            result = ((Integer) o).doubleValue();
        } else if (o instanceof Float) {
            result = ((Float) o).doubleValue();

        } else if (o instanceof String) {
            result = Double.parseDouble(((String) o));
        }else {
            result = 0d;
        }
        return result;
    }

    //Okay given an object, tell me if it's an integer or a float
    String getObjectType(Object obj){
        String str1 = "";
        /*
        switch(obj)
        {
            case Float f -> str1 = "float";
            case Integer i -> str1 = "integer";
            default -> str1 = "unknown";
        };*/

        return str1;
    }


    public void method04(){
        Object apple = 5; //you can change this between string or number
        if(apple instanceof String s)
        {
            System.out.printf("Object is a string %s", s);
        }else if (apple instanceof Number n)
        {
            System.out.printf("Object is a number %n", n); //what is this o?
        }
    }


    public String method03(String flag){
        String output = "";
        switch(flag)
        {
            case "A" -> output = "parry";
            case "2" -> output = "attack";
            case "3" -> output = "roll";
            default -> output = "goof around";
        }

        return output;
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
