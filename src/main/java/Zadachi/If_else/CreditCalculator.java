package Zadachi;

public class CreditCalculator {
    public static void main(String[] args) {
        calculateCreditDetails("John Smith", 19, 2000, 24);
        calculateCreditDetails("Jane Smooth", 17, 2000, 12);
    }
    private static void calculateCreditDetails(String fullName, int age, int amount, int months) {
        if (age < 18) {
            System.out.println("You have to be 18 or more");
        } else {
            if (amount < 1000) {
                if (months > 12) {
                    System.out.println("You can not get amount less than 1000 for longer than 12 month payback plan");
                } else {
                    double monthlyPayment = amount / months;
                    System.out.println("Monthly payback equals " + monthlyPayment);
                }
            } else {
                double interestRate = getInterestRate(amount);
                double totalAmount = amount + (amount * interestRate * months / 12);
                double monthlyPayment = totalAmount / months;
                System.out.printf("Monthly payback for amount from %d leva for %d months with interest" +
                        "%.2f%% is %.2f leva.%n", amount, months, interestRate * 100, monthlyPayment);
            }
        }
    }

    private static double getInterestRate(int amount) {
        if (amount <= 5000) {
            return 0.05; // 5% interest rate for amount up to 5000
        } else if (amount <= 10000) {
            return 0.04; // 4% interest rate for amount up to 10000
        } else {
            return 0.03;
        }
    }
}

