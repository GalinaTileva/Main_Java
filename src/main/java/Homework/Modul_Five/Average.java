package Homework.Modul_Five;
/*Програма, която намира средно аритметична стойност на всички отрицателни числа в масив.*/

public class Average {
    public static void main(String[] args) {
        int[] array = {-6, 3, 8, -7, -3, -4};

        int sum = 0;
        int count = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0) {
                sum += array[i];
                count++;
            }
        }

        if (count > 0) {
            double average = (double) sum / count;
            System.out.println("Arithmetic mean value of negative numbers is:  " + average);
        } else {
            System.out.println("There are no negative numbers in the array.");
        }

    }
}
