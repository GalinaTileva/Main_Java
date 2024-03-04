package Zadachi.OOP.students;

public class HighSchoolStudent extends Student {
    private int grade;

    public HighSchoolStudent(String name, int age, String course, int grade) {
        super(name, age, course);
        this.grade = grade;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        if (grade > 8 && grade <= 13) {
            this.grade = grade;
        } else {
            System.out.println("Invalid input.");
        }
    }
}
