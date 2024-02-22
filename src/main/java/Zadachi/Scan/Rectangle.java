package Zadachi;

import java.util.Scanner;

public class Rectangle {
    private static Scanner keyboard;
    public static void main(String[] args) {
        keyboard = new Scanner(System.in);
        System.out.println("Entry height: ");
        int a = keyboard.nextInt();
        while (a <= 0) {
            System.out.println("Entry positive numbers!");
            a = keyboard.nextInt();

        }
        System.out.println("Entry width: ");
        int b = keyboard.nextInt();

        while (b <= 0) {
            System.out.println("Entry positive numbers!");
            b = keyboard.nextInt();
        }
        int perimeter = 2 * (a + b);
        int area = a * b;
        System.out.println("Perimeter is: " + perimeter);
        System.out.println("Area is: " + area);

    }
}
