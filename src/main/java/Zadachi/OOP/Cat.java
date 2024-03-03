package Zadachi.OOP;

public class Cat {

    private String name;
    private int age;
    private int weight;
    public Cat(String name, int age, int weight) {
        setName (name);
        setAge (age);
        setWeight (weight);
    }

    public String getName() {
        return name;

    }

    public void setName(String name) {
        if (name != null && !name.isEmpty()) {
            this.name = name;
        } else {
            System.out.println("Name can not be empty!");
        }
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age >= 0) {
            this.age = age;
        } else {
            System.out.println("Unvalid age");
        }
        this.age = age;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        if (weight > 0) {
            this.weight = weight;
        } else {
            System.out.println("Weight should be more than 0.");
        }
        this.weight = weight;
    }

    public Cat() {

    }
    public void sayMeow() {
        System.out.println("Мяу!");
    }
}

