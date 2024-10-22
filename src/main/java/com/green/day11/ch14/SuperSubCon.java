package com.green.day11.ch14;

public class SuperSubCon {
    public static void main(String[] args) {
        ClassC classC=new ClassC();//1) 이걸 호출하면 ClassA의 생성자가 제일 먼저 호출이 되고 ClassB, ClassC 가 호출이 된다
        //2) super 생성자 호출은 무조건 자식 생성자 코드에서 제일 최상위에 위치해야 한다.

    }
}
class ClassA{
    ClassA(){
        super();//3)부모 생성자 호출인 super(); 는 자동으로 붙는다.
        System.out.println("=====ClassA====");

    }

}

class ClassB extends ClassA{
    ClassB(){
        super();//3)부모 생성자 호출인 super(); 는 자동으로 붙는다.
        System.out.println("=====ClassB====");
    }
}

class ClassC extends ClassB{
    ClassC(){
        super();// 3)부모 생성자 호출인 super(); 는 자동으로 붙는다. ClassC 실행이 되면 부모 생성자 먼저 호출한다는 것을 알 수 있다.
        System.out.println("=====ClassC====");
    }
}