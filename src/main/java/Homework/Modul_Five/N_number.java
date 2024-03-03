package Homework.Modul_Five;
/*Напишете програма, която отпечатва в конзолата числата от 1 до N.
  N се приема като параметър */

import java.util.Scanner;

public class N_number {
    private static Scanner scanner;

    public static void main(String[] args) {
        scanner = new Scanner(System.in);
        System.out.println("Enter number: ");
        int n = scanner.nextInt();

        while (n < 1) {
            System.out.println("Enter a number higher than 1. ");
            n = scanner.nextInt();
        }

        for (int i = 1; i <= n; i++) {
            System.out.println("Numbers from 1 to " + n + " are:");
            break;
        }

        for (int i = 1; i <= n; i++) {
            System.out.println(i);
        }
    }
}
