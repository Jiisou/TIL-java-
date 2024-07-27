package org.opentutorials.generic;

class StudentInfo{
  public int grade;
  StudentInfo(int grade){ this.grade = grade;}
}
class StudentPerson{
  public StudentInfo info;
  public StudentInfo(StudentInfo info){ this.info = info; } // 생성자
}
class EmployeeInfo{
  public int rank;
  EmployeeInfo(int rank) { this.rank = rank; }
}
class EmployeePerson {
  public EmployeeInfo info;
  EmployeePerson(EmployInfo info) {this.info = info; }
}
public class GenericDemo {
  public static void main(String[] args) {
    StudentInfo si = new StudentInfo(2);
    StudentPerson sp = new StudentPerson(si);
    System.out.println(sp.info.grade); // 2

    EmployeeInfo ei = new EmployeeInfo(1);
    EmployeePerson ep = new EmployeePerson(ei);
    System.out.println(ep.info.rank); // 1
  }
}
