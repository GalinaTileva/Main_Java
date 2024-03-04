package Homework.Modul_Eight;

public class NirvanaSpa extends SoleTrader {

    public NirvanaSpa(String owner, double initialCapital, double actualCapital, String companyName,
                      String startingDate, String bulstat) {
        super(owner, initialCapital, actualCapital, companyName, startingDate, bulstat);
        owner = "Richard Steiner";
        initialCapital = 50000;
        actualCapital = 75000;
        companyName = "Nirvana";
        startingDate = "01.03.2016";
        bulstat = "123456789";

    }

    public NirvanaSpa(String bookAnAppointment, String payment, String refundPolicy) {
        super(bookAnAppointment, payment, refundPolicy);
        bookAnAppointment = "via phone, website, at a place";
        payment = "cash, card, via website";
        refundPolicy = "100% if done 24h before appointment";
    }
}


