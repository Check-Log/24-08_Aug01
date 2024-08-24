package A_Principles;

public class Circle extends Shape {
    private double radius;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return  ((Math.PI) * (radius * radius));
    }

    @Override
    public double calculateRectangleArea() {
        //return getHeight() * getWidth();
        return 5;
    }
}
