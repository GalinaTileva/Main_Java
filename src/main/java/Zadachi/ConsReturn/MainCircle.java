package Zadachi.ConsReturn;

public class MainCircle {
    public static void main(String[] args) {


        Circle circle1 = new Circle();
        Circle circle2 = new Circle(4.5);

        double area = circle2.calculateArea();
        System.out.println(area);

        //или
        double perimeter = circle2.calculatePerimeter();
        System.out.println(perimeter);


    }
}
