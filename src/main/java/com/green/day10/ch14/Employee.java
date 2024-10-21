package com.green.day10.ch14;

public class Employee {
    /*
    챗지피티 문제
    문제 4: 직원 클래스
Employee라는 기본 클래스를 만들고, Manager와 Developer라는 두 개의 자식 클래스를 만드세요.

기능:
Employee 클래스에는 name과 salary 속성이 있습니다. getDetails() 메서드는 직원의 이름과 급여를 반환합니다.
Manager 클래스는 Employee를 상속받고, 추가로 bonus 속성을 가집니다. getDetails() 메서드를 오버라이드하여 보너스를 포함한 정보를 반환합니다.
Developer 클래스는 Employee를 상속받고, 추가로 programmingLanguage 속성을 가집니다. getDetails() 메서드를 오버라이드하여 프로그래밍 언어를 포함한 정보를 반환합니다.
출력: 각 클래스의 인스턴스를 생성하고, getDetails() 메서드를 호출하여 정보를 출력하세요.
     */
    private String name;
    private int salary;

    String getDetails(){
        return String.format("이름: %s, 급여: %d",name,salary);
    }

    String getName(){
        return name;
    }
    int getSalary(){
        return salary;
    }


    public static void main(String[] args) {

    }
}

class Manager extends Employee{
    private int bonus;

    String getDetails(){
        return String.format("이름: %s, 급여: %d, 보너스: %d",getName(),getSalary(),bonus);
    }


}
class Developer{


}