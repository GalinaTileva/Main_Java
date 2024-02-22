package Zadachi.If_Else;

public class AgeChecker {
    public static void main(String[] args) {
        checkAge(20);
        checkAge(16);
        checkAge(18);
    }

    private static void checkAge(int age) {
        if (age >= 18) {
            System.out.println("Person Over 18 years.");
        } else {
            System.out.println("Person Below 18 years.");
        }
    }
}