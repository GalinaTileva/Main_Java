package Zadachi.OOP_Two.GeometryTask;

public class Rectangle extends Shape {

    private double length;
    private double height;

    public Rectangle(double length, double height) {
        this.length = length;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return length * height;
    }

    @Override
    public double calculatePerimeter() {
        return (length + height) * 2;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public void setHeight(double height) {
        this.height = height;
    }
}
