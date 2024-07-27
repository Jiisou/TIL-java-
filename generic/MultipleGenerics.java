package org.opentutorials.generic;
// [youtube 생활코딩] Java - 제네릭  

class StudentInfo{
  public int grade;
  StudentInfo(int grade){ this.grade = grade;}
}
class EmployeeInfo{
  public int rank;
  EmployeeInfo(int rank) { this.rank = rank; }
}

// class StudentPerson{
//   public StudentInfo info;
//   public StudentInfo(StudentInfo info){ this.info = info; } // 생성자
// }
// class EmployeePerson {
//   public EmployeeInfo info;
//   EmployeePerson(EmployInfo info) {this.info = info; }
// // }
// class Person {
//   public Object info; 
//   Person(Object info) { this.info=info; }
// }
class Person<T, S> { // 콤마로 구분하고 서로 다른 이름을 붙여 서로 다른 타입의 제네릭을 지정해줄 수 있다!! 
  public T info;
  public S id;
  Person(T info, S id) { 
    this.info = info;
    this.id = id;
  }
}

// Generic을 도입해 타입 안정성을 확보하면서 코드의 중복을 극복하자!!
public class GenericDemo {
  
  public static void main(String[] args) {
    // Person p1 = new Person("인턴");
    // EmployeeInfo ei = (EmployeeInfo)p1.info; -> (!) ClassCastException 발생 (runtimeException)

    // Person<EmployeeInfo, int> p1 = new Person<EmployeeInfo, int>(new EmployeeInfo(1), 1);    
    // 이때 *참조형 데이터 타입만 올 수 있다(즉, 기본형 int, char 타입은 제네릭으로 설정할 수 x) 
    // => Wrapper 클래스를 이용하자; 기본 데이터 타입은 자바에서 객체로 취급x, 기본 데이터 타입도 객체인 양 사용할 수 있게 만든 것이 'Wrapper Class'
    

    Integer id = new Integer(1);  // int 1을 wrapper class인 Integer의 생성자로 전달해서, 숫자 1을 의미하는 '객체' 인스턴스를 만들어서 제네릭으로 전달한다!!
    Person<EmployeeInfo, Integer> p1 = new Person<EmployeeInfo, Integer>(new EmployeeInfo(1), id);
    System.out.pringln(p1.id.intValue()); // Integer wrapper class가 가진 메서드 중 intValue를 호출해 wrapper class가 담고 있는 원래 숫자(1)를 원시 데이터 타입 int 1로 돌려줌.
  
  }
}
