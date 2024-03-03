package Zadachi.Scan;

import java.util.Scanner;

public class WeekDays {
    private static Scanner scanner;

    public static void main(String[] args) {

        scanner = new Scanner(System.in);

        System.out.println("Enter a number from 1 to 7: ");

        int dayNumber = scanner.nextInt();

        String dayName;

        switch (dayNumber) {
            case 1:
                dayName = "Monday";
                break;
            case 2:
                dayName = "Tuesday";
                break;
            case 3:
                dayName = "Wednesday";
                break;
            case 4:
                dayName = "Thursday";
                break;
            case 5:
                dayName = "Friday";
                break;
            case 6:
                dayName = "Saturday";
                break;
            case 7:
                dayName = "Sunday";
                break;
            default:
                dayName = "Invalid input";
                break;
        }

        System.out.println("You entered " + dayNumber + ". Weekday is " + dayName + ".");

    }
}
