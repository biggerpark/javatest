package com.green.day16.ch26;


//p.653
//익명 클래스
public class UseAnonymousInner {
    //❗❗❗익명클래스❗❗❗
    /*

    (요점)
    익명클래스는 interface 를 implements 한 클래스를 만들지 않고

    다이렉트로 interface 를 implements 한 클래스를 객체화 할때 사용할 수 있다.

    즉, 코드 작성을 많이 생략할 수 있다.

    익명클래스 작성보다 더 많이 생략할 수 있는게 람다식이다.

    익명클래스를 작성해서 사용하는 경우는 인터페이스가 추상메소드 몇개인지 상관없다.

    하지만, 람다식을 작성할 수 있는 인터페이스는 오로지 추상메소드 1개만 가지고 있는 경우만 가능하다.

     */

    public static void main(String[] args) {
        //1.익명클래스 사용한 경우
        Printable print=new Printable() { // 2) Printable 인터페이스를 객체화 한것이 아니다. Printable 인터페이스를 임플리먼츠 한 익명 클래스를 객체화 한것이다.
            //3) 원래는 유지어나니머스이너오리지널 클래스에 보이는것처럼 적어서 객체화 해줘야하는데 이런식으로 바로 익명클래스를 쓸 수 있다.
            @Override
            public void print() {
                System.out.println("익명클래스 print");
            }
        };


        //람다식은 적는걸 줄일려고 사용하는것, ❗❗람다식은 인터페이스가 추상메소드 오직 하나만 가진 인터페이스만 람다식 사용가능하다.❗❗
        // 중간에 ()는 파라미터 부분
        // -> 람다식 시작부분
        // {} 중괄호 생략 가능한 경우는 추상메소드의 구현부 명령이 한줄인 경우 생략가능하다.

        //2. 람다식 사용한 경우
        Printable p2=()->{
            System.out.println("람다 print"); //추상메소드 구현부의 부분이 들어간다.
        };

        print.print();
        p2.print();

    }
}

//1) 인터페이스는 객체화 불가능, 엥 근데 위에서 객체화가 됐네? 이게 익명클래스다.

@FunctionalInterface //람다식으로 사용하고 싶은 인터페이스는 이 문구를 붙여주자. 이 문구는 추상메소드 1개만 가질 수 있도록 해주는 것. 추상메소드가 한개 초과하면 빨간줄이 뜬다.
interface Printable {
    void print();
}
