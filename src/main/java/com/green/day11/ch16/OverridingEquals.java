package com.green.day11.ch16;

public class OverridingEquals {
    public static void main(String[] args) {
        NumBox n1=new NumBox(10);
        NumBox n2=new NumBox(10);

        System.out.println("n1:"+n1);
        System.out.println("n2:"+n2);


        //레퍼런스 변수끼리의 "=="비교는  주소값 비교(동일성 비교)
        System.out.println("n1==n2:"+(n1==n2)); // false
        // n1,n2 는 각각 객체생성으로 만든 주소값을 가지고 있기 때문에 주소값이 다르다.

        System.out.println("n1.equals(n2): "+(n1.equals(n2))); // object 클래스로 부터 equals 메소드 상속받음, object 의 equals 메소드는 ==비교로 되어있다.
        System.out.println("n1.equals(n2): "+(n1.equals(n2))); // object 클래스로 부터 equals 메소드 상속받음, object 의 equals 메소드는 ==비교로 되어있다.



    }
}

class NumBox{
    private int num;

    NumBox(int num){
        this.num=num;
    }



    @Override
    public String toString(){
        return String.valueOf(num);
        // valueOf는 메소드: 옆에 () 가 붙었기 때문
        // valueOf는 static 메소드: 클래스명만 붙여서 썻기 때문
        // valueOf는 return 타입이 String 이다.
        // valueOf의 파라미터는 int 타입이다.
    }

//    public boolean equals(Object object){
//        NumBox other=(NumBox) object;
//
//
//    }


}


