package com.green.day06.ch09;

public class UnsafeCircle {
    public static void main(String[] args) {
        Circle c=new Circle(); // 객체생성, 주소값은 c 하나만 생성
        c.setRad(1.5);
        System.out.println("원의 넓이(1):"+ c.getArea());


        c.setRad(2.5);
        System.out.println("원의 넓이(2)"+c.getArea());



        c.setRad(-3.3);
        System.out.println("원의 넓이(3)"+c.getArea());

        c.rad=-3.3;
        /* 멤버필드값을 외부에서 다이렉트로 대입시켜놓을수 있게 하면 잘못된 값이 입력될 수 있는 가능성이 있다. 그래서 외부에서 멤버필드값에 접근할 수 있도록 해놓지 않는다.
        이렇게 막는 행위를 "private" 이라는 접근지시어로 막는다. 이를 은닉화(캡슐화)라고 한다.
        */
        System.out.println("원의 넓이(4)"+c.getArea());
    }


}
class Circle{
    double rad=0; // 원의 반지름
    final double PI=3.14; // 상수 이므로 값 변경 안된다

    public void setRad(double r){ // 음수가 들어오면 값이 변경이 안됨, 그 예외는 rad를 r로 변경하는 메소드
        if(rad<0){
            rad=0;
            return;
        }
        rad=r;
    }

    public double getArea(){ //원의 넓이 구하는 메소드를 리턴
        return (rad*rad)*PI;
    }
}