package A_Principles;

public class OOP_Principles {

    public void run(){

        Rectangle rectangle = new Rectangle();
        rectangle.setHeight(5);
        rectangle.setWidth(4);
        System.out.println("Arena area is: " + rectangle.calculateArea());

        Circle circle = new Circle();
        circle.setRadius(3);
        System.out.println("Battle-Ring area is: " + circle.calculateArea());
        System.out.println("-------------------------");

        //e.g. classes rectangle, rectangle  contains 2 methods one
        //e.g. classes rectangle, rectangle  contains 2 methods one




    }
}
