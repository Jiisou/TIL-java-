package org.opentutorials.generic;

class StudentInfo{
  public int grade;
  StudentInfo(int grade){ this.grade = grade;}
}
// class StudentPerson{
//   public StudentInfo info;
//   public StudentInfo(StudentInfo info){ this.info = info; } // 생성자
// }
class EmployeeInfo{
  public int rank;
  EmployeeInfo(int rank) { this.rank = rank; }
}
// class EmployeePerson {
//   public EmployeeInfo info;
//   EmployeePerson(EmployInfo info) {this.info = info; }
// }
class Person {
  public Object info; //
  Person(Object info) { this.info=info; }
}
public class GenericDemo {
  public static void main(String[] args) {
    // StudentInfo si = new StudentInfo(2);
    // StudentPerson sp = new StudentPerson(si);
    // System.out.println(sp.info.grade); // 2
    // EmployeeInfo ei = new EmployeeInfo(1);
    // EmployeePerson ep = new EmployeePerson(ei);
    // System.out.println(ep.info.rank); // 1
    
    Person p1 = new Person("인턴");
    // EmployeeInfo ei = (EmployeeInfo)p1.info; -> (!) ClassCastException 발생 (runtimeException)
    // JAVA의 데이터 타입 안정성 보장x, 컴파일타임 에러 발견의 컴파일언어 이점 활용x
    // Generic을 도입해 타입 안정성을 확보하면서 코드의 중복을 극복할 수 있다!!
  }
}
