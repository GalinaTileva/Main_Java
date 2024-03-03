package Homework.Modul_Five;
/*Програма, която отпечатва на конзолата числата от 1 до N, които не се делят на 3 и 7.*/

import java.util.Scanner;

public class NN_number {
    private static Scanner scanner;

    public static void main(String[] args) {
        scanner = new Scanner(System.in);
        System.out.println("Enter number: ");
        int n = scanner.nextInt();

        while (n < 1) {
            System.out.println("Enter a number higher than 1.");
            n = scanner.nextInt();
        }

        for (int i = 1; i <= n; i++) {
            if (i % 3 != 0 && i % 7 != 0) {
                System.out.println("Numbers from 1 to " + n + ", that do not divide in 3 and 7 are:");
                break;
            }
        }

        for (int i = 1; i <= n; i++) {
            if (i % 3 != 0 && i % 7 != 0) {
                System.out.println(i);
            }
        }
    }
}
