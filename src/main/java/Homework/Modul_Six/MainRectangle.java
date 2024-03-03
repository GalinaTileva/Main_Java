package Homework.Modul_Six;
/*Създайте клас Rectangle (свойства: double ширина, double височина). Конструктор с и без параметри.
Методи за изчисление на площ и периметър.*/

public class MainRectangle {
    public static void main(String[] args) {

        Rectangle rect = new Rectangle();
        Rectangle rect2 = new Rectangle(4, 6);

        double area = rect2.calculateArea();
        System.out.println("The area of this rectangle is: " + area);

        double perimeter = rect2.calculatePerimeter();
        System.out.println("The perimeter of this rectangle is: " + perimeter);


    }
}
