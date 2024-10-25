package com.green.day14.ch17;


/*
[보편적인 인터페이스의 개념]
인터페이스(Interface): 이질적인 플랫폼 간에 통신을 할 수 있는 역할을 해주는 것을 인터페이스라 부른다.

사람이 컴퓨터를 다룰 때 키보드, 마우스 사용(키보드, 마우스, 모니터 인터페이스라 부른다)

게임에서 화면에 나오는 버튼이랑 hp,mp 등 보이는 부분을 인터페이스라고 한다.


[자바의 인터페이스]
추상 메소드와 static 멤버필드만 가질 수 있는 존재

❗❗❗추상메소드가 매우 중요하다.❗❗❗

인터페이스의 변수명은 보통 형용사(~할 수 있는 의 표현들)

 */


import com.green.day01.ch01.SystemOutPrintln;

public class PrintableInterface {
    public static void main(String[] args) {
        Printable p2=new PrintableImpl();
        p2.print("dddd");
        System.out.println(p2.NUM);
        System.out.println(Printable.NUM);

    }

}


//interface 를 만들때 생략해도 무조건 들어가는 키워드가 있다.
/*
interface Printable{
    public static final int NUM=0; //❗❗❗멤버필드 앞에는 생략해도 public static final 이 무조건 추가된다❗❗❗

    public abstract void print(String doc); // 메소드 앞에는 생략해도 public abstract 가 무조건 추가된다.
}
 */
interface Printable{

    public static final int NUM=0;
    void print(String doc);
}

class PrintableImpl implements Printable{

    @Override
    public void print(String doc){//인터페이스를 상속받은 클래스에서 메서드는 무조건 public 이어야 하는 이유는 자바의 접근 제어 원칙과 관련이 있습니다.
        System.out.println(doc);
    }

}