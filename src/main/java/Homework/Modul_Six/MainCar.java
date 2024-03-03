package Homework.Modul_Six;

public class MainCar {
    public static void main(String[] args) {

        Car car0 = new Car();
        Car car1 = new Car("Ford", "Sierra", 1990, 24900);
        Car car2 = new Car("Trabant", "601", 1984, 5500);
        Car car3 = new Car("Maserati", "Ghibli", 2018, 43500);

        int age = car1.calculateAge();
        double tax = car1.calculateTax();

        System.out.println("This car is " + age + " years old.");
        System.out.println("Tax for this car will be " + tax + " Euros.");


    }

}
