package com.green.day11.ch16;

import com.green.day01.ch01.SystemOutPrintln;

public class OverridingToString {
    public static void main(String[] args) {
        Cake c=new Cake();

        System.out.println(c);

        CheeseCake cheeseCake=new CheeseCake();
        System.out.println(cheeseCake);

        Cake c2=cheeseCake; // 2) Cake 타입의 c2에 cheeseCake 타입의 주소값이 들어갈수 있다.(상속 되어었으면 부모 주소값 변수에 자식의 주소값 변수가 들어갈 수 있다)
        System.out.println(c2); //3) 자식의 주소값의 return 값이 출력된다., 실행이 된다면 위의 cheeseCake 나 c2나 주소값이 동일하다.




    }
}
class Cake extends Object{
    @Override // 1) Object 클래스의 toString 메소드를 오버라이딩 한것. 이렇게 표시해야 오버라이딩 실수 방지, 오버라이딩이 아닐시 컴파일 에러가 뜬다.
    public String toString(){
        return "My birthday cake";
    }

    final void blowCandle(){ //4) 부모 클래스의 메소드에 final 을 붙이면 자식 클래스에서 오버라이딩 금지(오버라이딩이 안된다)
        System.out.println("초를 분다");
    }
}

class CheeseCake extends Cake{
    @Override
    public String toString(){
        return "My birthday cheese cake";
    }

//    void blowCandle(){
//        System.out.println("초를 분다");
//    } (부모 메소드에 final 이 붙어 있어서 오버라이딩이 안된다)

    // 5) class 앞에 final 키워드가 있으면 그 클래스가 상속이 안된다. 대표적으로 String 클래스는 상속이 불가능하다.

}
