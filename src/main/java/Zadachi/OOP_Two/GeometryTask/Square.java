package Zadachi.OOP_Two.GeometryTask;

public class Square extends Shape {
    private double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    public double calculateArea() {
        return side * side;
    }

    @Override
    public double calculatePerimeter() {
        return 4 * side;
    }

    public void setSide(double side) {
        this.side = side;
    }
}
