package Homework.Modul_Six;

public class Car {
    // Instance variables
    String make;
    String model;
    int year;

    // Constructor
    public Car(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    // Method to display car information
    public void displayInfo() {
        System.out.println("Make: " + make);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
    }

    public static void main(String[] args) {
        // Creating an instance of Car using the constructor
        Car myCar = new Car("Toyota", "Camry", 2020);

        // Calling the displayInfo method to show car information
        myCar.displayInfo();
    }
}

