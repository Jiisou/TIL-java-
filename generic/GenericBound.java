package org.opentutorials.generic;
// [youtube 생활코딩] Java - 제네릭  

// interface Info
abstract class Info{
    public abstract int getLevel();
}
// class EmployeeInfo implements Info {~
class EmployeeInfo extends Info{
    public int rank;
    EmployeeInfo(int rank){ this.rank = rank; } //생성자
    public int getLevel(){ //상속 받은 메서드 구현
        return this.rank;
    }
}
class Person<T extends Info>{ //abstract class든 interface든 제네릭에 대한 것은 'extends'로 표현
    public T info;
    Person(T info){ 
      this.info = info; 
      info.getLevel(); // Info를 부모로 지정함으로써 Info의 메서드를 사용할 수 있다
    }
}
public class GenericBound {
    public static void main(String[] args) {
        Person<EmployeeInfo> p1 = new Person<EmployeeInfo>(new EmployeeInfo(1));
        // Person<String> p2 = new Person<String>(new EmployeeInfo("인턴"));    // Info를 부모로 가지는 Person 타입은 가능하지만 그렇지 않은 String 타입은 불가능!
  }
}
