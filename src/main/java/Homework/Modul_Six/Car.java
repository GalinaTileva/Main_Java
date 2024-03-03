package Homework.Modul_Six;
/*Създайте клас Car, който има следните характеристики:
● Марка (String)
● Модел (String)
● Година на производство (int)
● Цена (double)
Класът трябва да има конструктори както с параметри, така и без параметри, метод за
изчисляване на годините на колата от настоящето време (calculateAge()), който връща
цяло число - годините на колата, метод за изчисляване на данъка за кола (calculateTax()),
който връща данъка според следната формула:
● Данък = Цена * 0.05, ако колата е произведена преди 5 години или повече
● Данък = 0, ако колата е произведена преди 5 години или по-малко*/

import java.time.LocalDate;
import java.time.Period;

public class Car {

    private String brand;
    private String model;
    private int manifactureYear;
    private double price;

    public Car() {
        this.brand = " ";
        this.model = " ";
        this.manifactureYear = 0;
        this.price = 0.0;
    }

    public Car(String brand, String model, int manifactureYear, double price) {
        this.brand = brand;
        this.model = model;
        this.manifactureYear = manifactureYear;
        this.price = price;
    }

    public int calculateAge() {
        LocalDate currentDate = LocalDate.now();
        LocalDate carDate = LocalDate.of(this.manifactureYear, 1, 1);
        Period period = Period.between(carDate, currentDate);
        return period.getYears();

    }

    public double calculateTax() {
        int age = calculateAge();
        if (age >= 5) {
            return this.price * 0.05;
        } else {
            return 0.0;
        }

    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getManifactureYear() {
        return manifactureYear;
    }

    public void setManifactureYear(int manifactureYear) {
        this.manifactureYear = manifactureYear;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}

