package Zadachi.OOP.students;

import Zadachi.OOP.students.HighSchoolStudent;
import Zadachi.OOP.students.Student;
import Zadachi.OOP.students.StudentManagementSystem;
import Zadachi.OOP.students.UniversityStudent;

public class Main {

  public static void main(String[] args) {

      StudentManagementSystem system = new StudentManagementSystem();//конструктор по подразбиране и създава нов arrayList

      Student alice = new HighSchoolStudent("Alice", 16, "Math", 10);
      Student bob = new UniversityStudent("Bob", 26, "Computer Science", "QA Automation");
      system.addStudent(alice);
      system.addStudent(bob);
      system.displayAllStudents();



  }

}
