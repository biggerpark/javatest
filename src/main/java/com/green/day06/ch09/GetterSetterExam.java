package com.green.day06.ch09;

import com.green.day01.ch01.SystemOutPrintln;

public class GetterSetterExam {
    public static void main(String[] args) {
        Student s1=new Student(); // 객체 생성 후 s1이라는 주소값 생성
        //s1.name; private 으로 멤버필드가 되어있어서 바꿀 수 없다.
        s1.setName("홍길동");
        System.out.println(s1.getName());
        s1.setAge(12);
        System.out.println(s1.getAge());
        s1.setHeight(182.2f);
        System.out.println(s1.getHeight());

        Student s2=new Student();
        s2.setName("신사임당"); //s2라는 객체화된 주소값(참조변수)의 인스턴스변수를 "신사임당"으로 초기화하는것.
        System.out.println(s2.getName());

    }

}

class Student{
    //멤버필드의 인스턴스변수 선언
    private String name;
    private int age;
    private float height;

//❗❗❗private 한 멤버필드가 있으면 getter method 는 무조건 있어야한다.❗❗❗

/*
class 멤버필드에서 private 으로 선언된 멤버변수들을 다른 class 에서도 불러오고싶다면 getter,setter 을 써야한다.

이런 getter, setter 는 아래의 메소드를 정의하여 나중에 메소드를 불러와서 private 으로 되어있는 멤버변수들을 바꿀 수 있다.

setter 는 값을 집어넣는것. 이렇게 집어넣는것은 두가지 방법이 있다. 아래처럼 하는 방법과 생성자를 이용하는 방법이다.

getter 는 값을  빼내는것 getter 하는 방법은 하나밖에 없다.
 */

    //name-setter
    public void setName(String name){ // 리턴할 필요가 없고 그냥 주소값의 멤버변수의 값을 입력된 값으로 대입시킬것이므로 void 가 붙는다.
        this.name=name; //this 는 상수이고, 나 자신의 주소값이 저장된 공간, 즉 호출될때의 주소값이 this 에 들어간다.
    }

    //name-getter
    public String getName(){
        return name; // 전역변수로 선언되어있는 name 값이 리턴된다.
    }

    //age-setter
    public void setAge(int age){
        this.age=age;
    }

    //age-getter
    public int getAge(){
        return age;
    }

    //height-setter
    public void setHeight(float height){
        this.height=height;
    }

    //height-getter
    public float getHeight(){
        return height;
    }

}




