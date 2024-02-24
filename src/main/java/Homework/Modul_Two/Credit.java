package Homework.Modul_Two;
/*Напишете метод с 2 параметъра - сума и период (месеци) и след извикване да принтира в конзолата
колко е месечната вноска за дадения период. Добавете годишен лихвен процент 7% и
изкарайте в конзолата колко пари ще върне клиента.*/

public class Credit {
    public static void main(String[] args) {

        double loan = 5000;
        double period = 12;
        double monthlyPayment = loan / period;

        System.out.println("Monthly Payment: " + monthlyPayment);
        System.out.println("Interest rate: 7%");

        double interestRate = 0.07;
        double totalPayback = loan + (loan * interestRate);

        System.out.println("Total payback in 12 months: " + totalPayback);

        double perMonth = totalPayback / period;
        System.out.println("Total per month: " + perMonth);



    }

}
