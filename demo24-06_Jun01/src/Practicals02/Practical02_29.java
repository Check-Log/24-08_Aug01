package Practicals02;

public class Practical02_29 {

    public  void run(){

        /*
        This file explores java 17 introduced "sealed-classes"
        Well basically they give you more inheritance-control.
        Allows you to prevent loads of subclasses suddenly existing without a way to trace them back to the superclass
        https://medium.com/codex/sealed-classes-in-java-17-8f00351d27f4
        final: Class-annotation: forbids this class from being extended (from being a super class)
        non-sealed: Class annotation: the class is still allowed to be a super class (Shape, Circle, Dot)

        Java 17 offers sealed classes, pattern-matching and enhanced switch-expressions.
        */

        Circle circle = new Circle();
        Dot dot = new Dot();
        Square square = new Square();

        System.out.println("Given a circle: " + ", area is: " + circle.getArea());
        System.out.println("Given a dot: " + ", area is: " + dot.getArea());
        System.out.println("Given a square: " + ", area is: " + square.getArea());

    }

    public String method01(){

        return "testicles";
    }
}

sealed class Shape permits Circle, Square
{
    int getArea(){
        return 6;
    }
}

//You need to specify that Circle in non-sealed so that yo ucan still use it as a superclass
non-sealed class Circle extends Shape
{
    @Override
    int getArea() {
        return 6;
    }
}

class Dot extends Circle{
    @Override
    int getArea(){
        return 2;
    }
}
//if Circle was final then this wouldn't work because Circle cannot be used as a superclass

final class Square extends Shape{
    @Override
    int getArea() {
        return 4;
    }
}//now Square can't extend to anything











