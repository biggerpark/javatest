package com.green.day07.ch07;

public class Car {
    private String color;
    private String gearType; // auto,manual
    private int door;

    public void introduce(){
        System.out.printf("%s의 컬러의 %s 기어를 가진 %d개의 문짝이 있는 자동차\n",color,gearType,door);
    }

    public Car(){ //2)생성자를 호출할때 멤버필드의 인스턴스 변수 값을 초기화해준다
//        this.color="white";
//        this.gearType="auto";
//        this.door=4;

        //위의 3가지 코드로 적어야 하는걸 this() 를 통해 생성자 호출을 해서 해결할 수 있다.

        /*
        생성자 안에서 다른 생성자를 호출할 수 있다

        ❗❗this 사용법은 2가지가 있다❗❗
        1. this.  - 멤버필드, 멤버메소드 사용하고 싶을때 this.을 사용할 수 있다. this 는 나 자신의 객체 주소값이 저장되어있는 상수이다.

        2. this() - 생성자에서 다른 생성자 호출 시 사용 가능

        this() 가 메소드 안에서는 쓸 수 없다. 그 이유는 this() 라는 것이 생성자 호출하는 것을 의미하는데, 생성자는 객체를 생성할때만 호출할 수 있기 때문에
        메소드를 호출했다는 것은 이미 객체생성이 끝난 이후다.

         */

        this("white","auto",4);

        //this.introduce();
        //introduce() -- this 가 생략가능하기도 하다

    }

    public Car(String color,String gearType, int door){ // 6) 오버로딩된 생성자를 매개변수의 타입을 신경써서 넣어준다.
        /*
        ❗❗매개변수의 이름과 멤버필드의 인스턴스 변수 이름이 같을때는 this 를 써서 구별해주면 구별하기 쉬워진다.
        "오버로딩 생성자로 들어온 매개변수"가 "생성된 객체"의 "주소값"이 있을때마다 "this 를 사용하여 그 주소값"의 인스턴스 변수를 초기화 해준다❗❗
        */
        this.color=color; // 변수의 이름이 서로 달랐으면 this 가 빠질 수 있다. 왜냐하면 전역변수와 지역변수인 매개변수의 이름이 다르기 때문에 구별이 가능해지기 때문이다.
        //color=co;
        this.gearType=gearType;
        this.door=door;
    }

    //😲😲 이해하고 넘어가기
    public Car(String gearType,int door){ // 9) 파리미터가 2개인 새로운 오버로딩 생성자를 만들어준다.
        this("white",gearType,door); // 10) 파라미터가 3개인 생성자 호출
    }




}
class CarTest{
    public static void main(String[] args) {
        //1) 메인메소드 내용을 수정하지 않고 "white 컬러의 auto 기어를 가진 4개의 문짝이 있는 자동차"이 출력되게 해보자
        Car c1=new Car(); // 3) 기본생성자 호출과 객체화를 해주고 참조변수 c1에 주소값 부여
        c1.introduce();//4) c1의 주소값의  introduce 메소드 호출


        Car c2=new Car("red","manual",4);
        //5) "red 컬러의 manual 기어를 가진 4개의 문짝이 있는 자동차" 가 출력되도록 생성자 만들어보자
        c2.introduce(); //7) "인스턴스 변수가 매개변수로 초기화된 객체"의 "주소값"의 "인스턴스 변수"가 호출된다.

        Car c4=new Car("auto",6);
        c4.introduce();
        //8) "white 컬러의 auto 기어를 가진 6개의 문짝이 있는 자동차"이 출력되게 해보자


    }
}