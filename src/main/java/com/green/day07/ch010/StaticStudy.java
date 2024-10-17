package com.green.day07.ch010;

public class StaticStudy {
    public static void main(String[] args) {
        NonStaticNumBox nnb1=new NonStaticNumBox();
        nnb1.n1=10;
        nnb1.n2=30;


        NonStaticNumBox nnb2=new NonStaticNumBox();
        nnb2.n1=15;
        nnb2.n2=20;

        nnb1.sum();//40
        nnb2.sum();//35


        StaticNumBox snb1=new StaticNumBox();
        snb1.n1=10;
        snb1.n2=30;

        StaticNumBox snb2=new StaticNumBox();
        snb2.n1=15; // 클래스의 멤버필드에 static 이 붙어있기 때문에 위의 snb1과 snb1은 다 같은 공간이다. 그래서 마지막에 초기화된 값으로 계산되어 나온다.
        snb2.n2=30;

        snb1.sum();//45
        snb2.sum();//45

        StaticNumBox.n1=10;
        StaticNumBox.n2=20;
        StaticNumBox.sum();
        StaticNumBox.sum(6,9);//매개변수만 이용하여 계산하는 메소드이기때문에 static 으로 써서 바로 클래스. 으로 호출하여 사용하면 편하다.

        //클래스 멤버필드, 멤버 메소드는 위 처럼 사용할 수 있다.
        //매개변수만 이용하여 해결하는 메소드는 static method 로 만들면 좋다(매개변수 안의 값으로만 해결 가능하면 멤버필드 값이 크게 필요없기 때문)

        /*
        객체마다 멤버필드의 공간이 각각 생기길 원하면 non-static(인스턴스멤버필드) 으로 해야한다.

        static 을 사용할 수 있으면 (위 두줄의 내용과 반대되는 경우) 적극 사용하는걸 추천
        왜냐면 일단 실행속도가 빠르고 사용하기 편하다(객체 생성이 필요하지 않기 때문)

         */

       /*
       Math.random() -  Math 클래스 안에 있는 random() static 메소드 호출하는 것
       -Math ma=new Math();//빨간색 줄이 뜨는 이유는 Math 라는 생성자에 private 이 달려있어서 객체 생성을 할 수 없다.
       -ma.random();
       위의 두 줄을 통해서 메소드를 호출할 필요가 없기 때문에 static 메소드가 사용이 편하다.
       그리고 Math 클래스는 객체화를 할 수 없다
       이유는 기본 생성자 접근레벨을 private 으로 세팅했기 때문이다.
        */
    }
}

class StaticNumBox{ //멤버필드의 값을 static 으로 준것
    static int n1;
    static int n2;
    int n3;
    int n4;

    static void sum(){
        System.out.println(n1+n2);
        //System.out.println(n3+n4); ❗❗static 메소드에서 인스턴스 멤버필드 접근 불가❗❗
        //hello(); ❗❗static 메소드에서 인스턴스 메소드 호출 불가❗❗
    }


    void hello(){
        System.out.println("hello");
    }

    static void sum(int n1,int n2){
    /*
    매개변수로 받은 값을 static 메소드를 이용하여, 클래스.method 를 하면 바로 계산 되도록 하는 것.
    Math.random() 이것도 Math 라는 클래스의 random() 메소드가 static 이기 때문에 바로 Math. 으로 사용할 수 있는것. Math 의 멤버필드에 영향이 가는지 안가는지는 모른다.
     */
        System.out.println(n1+n2);
    }
}

class NonStaticNumBox{
    int n1;
    int n2;
    static int n3;
    static int n4;

    void sum(){
        System.out.println(n1+n2);
        System.out.println(n3+n4);//❗❗인스턴스 메소드에서 클래스 멤버필드 접근 가능하다.❗❗
        hello();//❗❗인스턴스 메소드에서 클래스 멤버메소드 호출 가능하다.❗❗

        /* 왜 클래스 메소드와 클래스 멤버필드는 인스턴스 멤버필드와 인스턴스 멤버메소드에서 사용 가능한가?
        sum()메소드가 호출이 된다는 것은  NonStaticNumBox 가 객체화가 되었다는 것이고
        ❗❗static 은 이미 메모리에 올라가 있기 때문에 사용이 가능하다❗❗
         */
    }

    static void hello(){
        System.out.println("hello");
    }
}