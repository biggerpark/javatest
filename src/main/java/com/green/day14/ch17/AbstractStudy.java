package com.green.day14.ch17;

public abstract class AbstractStudy {
    /*

   ❗❗❗추상클래스, 추상메소드❗❗❗
    1) class 키워드 앞에 abstract 키워드를 붙이면 추상클래스가 된다

    2) 추상클래스가 되면 객체화 불가능하다.>> 오로지 부모역할만 한다(단독으로 의미가 없다)
       그래서 추상클래스를 상속받는 클래스가 있기 마련이다.

    3) class 앞에 abstract 를 붙이는 것은 선택사항이나, 만약에 추상메소드를 가지게 된다면
       선택사항이 아니라 필수사항이 된다.

    4) 추상클래스를 사용하는 이유- 클래스 간의 공통적인 부분을 부모에 작성을 해서 상속받도록 하기 위한 것.

    5) 추상클래스를 사용하면 추상메소드를 구현해야하는 강제성이 존재한다.

    6) 추상클래스를 상속받은 자식클래스가 추상메소드를 구현하는 행위: implements 또는 구현한다 라고 표현한다.

     */
    //7) 추상 메소드 작성해보자(구현부가 없고 선언부만 있는 메소드를 추상 메소드라고 한다. 그리고 abstract 키워드를 붙여야한다.)
    public abstract void sum();


    public void multiply(int n, int n1){
        System.out.println(n*n1); // 13) 추상클래스도 구현부가 있는 메소드를 만들 수 있다.
    }
}

abstract class ImplementsStudy2 extends AbstractStudy{

}



class ImplementsStudy extends AbstractStudy{

    //8) 자식 클래스는 꼭 부모에 추상메소드가 있다면 자식 클래스에도 꼭 추상메소드를 구현해야 한다. abstract 은 없어야한다.
    @Override
    public void sum(){
        //9) 분명히 내용이 있을것이다(구현부가 무조건 있을 것이다)
        System.out.println("숫자 더했다.");
    }
}

class AbstractStudyTest{
    //10) 예제를 들어보자
    public static void main(String[] args) {
//        AbstractStudy as=new AbstractStudy(); // 11) 추상클래스는 객체화가 되지 않는다.
        AbstractStudy as2=new ImplementsStudy();
        as2.sum(); // 12) 오버라이딩 되어있으므로 ImplementsStudy 의 sum 메소드가 호출

    }
}