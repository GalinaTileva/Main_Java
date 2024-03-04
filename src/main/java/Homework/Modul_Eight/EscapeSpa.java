package Homework.Modul_Eight;

public class EscapeSpa extends SoleTrader {

    public EscapeSpa(String owner, double initialCapital, double actualCapital, String companyName,
                     String startingDate, String bulstat) {
        super(owner, initialCapital, actualCapital, companyName, startingDate, bulstat);
        owner = "Kate Winslet";
        initialCapital = 100000;
        actualCapital = 168000;
        companyName = "Escape";
        startingDate = "01.06.2018";
        bulstat = "987654321";
    }

    public EscapeSpa(String bookAnAppointment, String payment, String refundPolicy) {
        super(bookAnAppointment, payment, refundPolicy);
        bookAnAppointment = "by phone, via website";
        payment = "cash, card";
        refundPolicy = "no refund";
    }
}
