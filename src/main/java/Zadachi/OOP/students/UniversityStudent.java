package Zadachi.OOP.students;

public class UniversityStudent extends Student {
    private String major;

    public UniversityStudent(String name, int age, String course, String major) {
        super(name, age, course);
        this.major = major;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        if (major != null) {
            this.major = major;
        } else {
            System.out.println("Invalid input.");
        }
    }
}
