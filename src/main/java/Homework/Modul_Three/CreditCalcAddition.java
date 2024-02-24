package Homework.Modul_Three;
/*Добавете параметър заплата. Ако кредита е повече от 50 000, проверете дали дохода е над 2000.
Ако е над 2000 покажете месечна вноска, ако не е изкарайте текст "Съжаляваме, максимума за такъв доход е 20 000.
Добавете още проверка дали дохода е над 5000, ако е да и кредита е под 100 000, изкарайте месечната вноска и текст
"С такъв доход предлагаме до 100 000.*/


public class CreditCalcAddition {

    public static void main(String[] args) {
        calculateCreditDetails("Jane Doe", 27, 50000, 24, 5500);

    }

    private static void calculateCreditDetails(String fullName, int age, int amount, int months, int wages) {
        if (age < 18) {
            System.out.println("You have to be 18 or more.");
        } else {
            if (amount < 1000) {
                if (months > 12) {
                    System.out.println("You can't apply for this amount for such period of time");
                } else {
                    double monthlyPayment = amount / months;
                    System.out.println("Monthly payback: " + monthlyPayment);
                }
            }
        }

        if (amount > 50000) {
            if (wages < 2000) {
                System.out.println("We are sorry, maximum for this wages is 20 000lv");
            } else {
                double monthlyPayment = amount / months;
                System.out.println("Monthly payback: " + monthlyPayment);
            }
        }

        if (wages > 5000) {
            if (amount < 100000) {
                double monthlyPayment = amount / months;
                System.out.println("Monthly payback: " + monthlyPayment);
                System.out.println("With this wages we can offer you loan up to 100 000 lv");
            }
        }
    }
}