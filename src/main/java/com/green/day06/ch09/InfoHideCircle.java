package com.green.day06.ch09;

public class InfoHideCircle {
    public static void main(String[] args) {
        Circle2 c=new Circle2();
        c.setRad(1.5);
        System.out.println("원의 넓이(1.5):"+ c.getArea());

        //c.rad=-3.3;  <- 이렇게 써도 Circle2의 멤버필드에 접근할 수 없다.왜냐하면 class Circle2의 멤버필드가 private 으로 막혀있기 때문이다.
        c.setRad(-3.3);
        System.out.println("원의 넓이(2)"+c.getArea());

        System.out.println(c.PI); // 멤버필드에 있는 PI에는 private이 안붙어있으므로 불러올 수 있다.

    }

}
class Circle2{ // 같은 패키지에서는 같은 이름의 class 를  쓸 수 없다. // class 앞에 public 이 붙어 있지 않으므로 다른 package 에서는 이 클래스를 사용할 수 없다
    private double rad=0; // private 이라는 값을 사용하여 변수를 선언하면 같은 class 안에서만 변수를 사용하거나 변환할 수 있다.
    final double PI=3.14;

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