package A_Principles;

public class Rectangle extends Shape {

    private double width;
    private double height;

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return getHeight() * getWidth();
    }

    @Override
    public double calculateRectangleArea() {
        return getHeight() * getWidth();
    }
}
