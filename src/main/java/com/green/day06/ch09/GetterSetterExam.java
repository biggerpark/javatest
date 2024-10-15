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
    private String name;
    private int age;
    private float height;


    void setName(String name){
        this.name=name;
    }

    String getName(){
        return name;
    }

    void setAge(int age){
        this.age=age;
    }

    int getAge(){
        return age;
    }

    void setHeight(float height){
        this.height=height;
    }

    float getHeight(){
        return height;
    }
}





