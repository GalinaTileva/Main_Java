package Homework.Modul_Five;
/*Програма, която отпечатва сумата на първите N члена от редицата на Фибоначи.
Числата на Фибоначи започват от 0 и 1,
като всяко следващо се получава като сума от предходните две.*/

import java.util.Scanner;

public class Fibonacci {

    private static Scanner scanner;

    public static void main(String[] args) {
        scanner = new Scanner(System.in);
        System.out.println("Enter Fibonacci's sequence number: ");

        int n = scanner.nextInt();

        long sum = 0;
        long a = 0;
        long b = 1;

        for (int i = 0; i <= n; i++) {
            sum += a;
            long temp = a + b;
            a = b;
            b = temp;
        }

        System.out.println("Sum of first " + n + " numbers of Fibonacci's sequence is: " + sum);

    }
}
