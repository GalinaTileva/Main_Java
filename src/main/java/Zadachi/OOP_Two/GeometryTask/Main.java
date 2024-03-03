package Zadachi.OOP_Two.GeometryTask;

public class Main {
    public static void main(String[] args) {
        Shape square = new Square(4);
        double areaSq = square.calculateArea();
        System.out.println("Area is: " + areaSq);
        double perimeterSq = square.calculatePerimeter();
        System.out.println("Perimeter is: " + perimeterSq);


        Shape rectangle = new Rectangle (4, 8);
        double areaRect = rectangle.calculateArea();
        System.out.println("Rectangle area is: " + areaRect);
        double perimeterRect = rectangle.calculatePerimeter();
        System.out.println("Rectangle perimeter is: " + perimeterRect);


        Shape circle = new Circle (6);
        double areaCircle = circle.calculateArea();
        System.out.println("Circle area is: " + areaCircle);
        double perimeterCircle = circle.calculatePerimeter();
        System.out.println("Circle perimeter is: " + perimeterCircle);

    }

}
