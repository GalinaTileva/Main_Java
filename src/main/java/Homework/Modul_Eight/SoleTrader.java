package Homework.Modul_Eight;

import java.time.LocalDate;
import java.util.regex.Pattern;

public class SoleTrader extends Company implements Companies, Companies.Services {

    private String owner;
    private double initialCapital;
    private double actualCapital;
    private String companyName;
    private String startingDate;
    private String bulstat;



    public SoleTrader(String owner, double initialCapital, double actualCapital, String companyName,
                      String startingDate, String bulstat) {
        this.owner = owner;
        this.initialCapital = initialCapital;
        this.actualCapital = actualCapital;
        this.companyName = companyName;
        this.startingDate = startingDate;
        this.bulstat = bulstat;
    }



    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        if (owner != null) {
            this.owner = owner;
        } else {
            System.out.println("Enter name of owner.");
        }
    }

    public double getInitialCapital() {
        return initialCapital;
    }

    public void setInitialCapital(double initialCapital) {
        if (initialCapital > 0) {
            this.initialCapital = initialCapital;
        } else {
            System.out.println("Enter amount of initial capital.");
        }
    }

    public double getActualCapital() {
        return actualCapital;
    }

    public void setActualCapital(double actualCapital) {
        if (actualCapital > 0) {
            this.actualCapital = actualCapital;
        } else {
            System.out.println("Enter amount of actual capital.");
        }
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        if (companyName != null) {
            this.companyName = companyName;
        } else {
            System.out.println("Enter name of company.");
        }
    }

    public String getStartingDate() {
        return startingDate;
    }

    public void setStartingDate(String startingDate) {
        if (startingDate != null) {
            this.startingDate = startingDate;
        } else {
            System.out.println("Enter starting date.");
        }
    }

    public String getBulstat() {
        return bulstat;
    }

    public void setBulstat(String bulstat) {
        String bulstatRegex = "\\d{9}";
        if (!Pattern.matches(bulstatRegex, bulstat)) {
            System.out.println("Invalid bulstat format.");
        } else if (bulstat == null || bulstat.trim().isEmpty()) {
            System.out.println("Enter bulstat number.");
        } else {
            this.bulstat = bulstat;
        }
    }


    public double calculateProfit() {
        LocalDate today = LocalDate.now();
        double profit = actualCapital - initialCapital;
        return profit;
    }

    public SoleTrader(String bookAnAppointment, String payment, String refundPolicy) {
        this.bookAnAppointment = bookAnAppointment;
        this.payment = payment;
        this.refundPolicy = refundPolicy;
    }


}
