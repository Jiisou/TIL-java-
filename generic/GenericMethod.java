package org.opentutorials.generic;
// [youtube 생활코딩] Java - 제네릭  

class EmployeeInfo{
  public int rank;
  EmployeeInfo(int rank) { this.rank = rank; }
}

class Person<T, S> {
  public T info;
  public S id;

  Person(T info, S id) { 
    this.info = info;
    this.id = id;
  }
  public <U> void printInfo(U info){ //메서드 레벨에서도 사용 가능한 제네릭 : 메서드 접근 제어자(public)과 리턴값(void) 사이에 표현.
    System.out.println(info);
  }
}

// Generic을 도입해 타입 안정성을 확보하면서 코드의 중복을 극복하자!!
public class GenericMethod {
  public static void main(String[] args) {
    EmployeeInfo e = new EmployeeInfo(1);
    Integer i = new Integer(3);
    // Person<EmployeeInfo, Integer> p1 = new Person<EmployeeInfo, Integer>(e, i);
    Person p1 = new Person(e, i); // 생성자에 전달되는 매개변수 e와 i를 통해 타입을 자바가 유추할 수 있으므로 <제네릭>을 생략해줘도 무방!

    // p1.<EmployeeInfo>printInfo(e);
    p1.printInfo(e); // 마찬가지로 인자로 전달된 e를 통해 <EmployeeInfo> 유추 가능하므로 생략 가능.
  
  }
}
