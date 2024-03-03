package Zadachi.OOP.students;
/*Да се създаде програма за управление на студенти в училище. В училището
има различни видове студенти - ученици от средното училище и студенти от университета.
1. Всеки студент трябва да има общи характеристики като име, възраст и учебен курс.
2. Учениците от средното училище трябва да имат информация за класа, в който учат.
3. Студентите от университета трябва да имат информация за специалността, която изучават.
4. Да се реализират методи за добавяне на нов студент, извеждане на
информация за всички студенти и търсене на студент по име.
5. Да се изгради подходяща йерархия от класове, като използвате наследяване за общите характеристики на студентите.*/

public class Student {
    private String name;
    private int age;

    private String course;

    public Student(String name, int age, String course) {
        this.name = name;
        this.age = age;
        this.course = course;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

}
