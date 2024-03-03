package Zadachi.Masivi;

import java.util.Scanner;

public class Masiv_Scan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Entry number of array's elements: ");
        int size = scanner.nextInt();
        int[] array = new int[size];

        System.out.println("Entry array's elements: ");
        for (int i = 0; i < size; i++) {
            System.out.println("Element " + ( i + 1 ) + ": ");
            array[i] = scanner.nextInt();
        }
        int evenSum = 0;
        int oddSum = 0;

        for (int num : array) {
            if (num % 2 == 0) {
                evenSum += num;
            } else {
                oddSum += num;
            }
        }
        System.out.println("Total amount of even numbers in array is: " + evenSum);
        System.out.println("Total amount of odd numbers in array is: " + oddSum);

    }

}
