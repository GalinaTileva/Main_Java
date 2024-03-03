package Zadachi.OOP;

import Zadachi.OOP.students.HighSchoolStudent;
import Zadachi.OOP.students.Student;
import Zadachi.OOP.students.StudentManagementSystem;
import Zadachi.OOP.students.UniversityStudent;

public class Main {
  /*  private String name;
    private Address address;

    public User(String name, Address address) {
        this.name = name;
        this.address = address;
    }*/
  public static void main(String[] args) {

/*      Cat cat = new Cat();
 *//*     cat.name = "";
      cat.age = -1000;
      cat.weight = 0;*//*

      cat.setName("");
      cat.setAge(-1000);
      cat.setWeight(0);*/


      StudentManagementSystem system = new StudentManagementSystem(); //конструктор по подразбиране и създава нов arrayList

      Student alice = new HighSchoolStudent("Alice", 16, "Math", 10);
      Student bob = new UniversityStudent("Bob", 26, "Computer Science", "QA Automation");
      system.addStudent(alice);
      system.addStudent(bob);
      system.displayAllStudents();




  }


}
