package com.green.day05.ch06;

public class LocalVariable {

    static int aaa=11; // 가장 큰 {}에서 선언되었기 때문에 모든 메소드에서 변수 aaa 의  scope 가 살아있다.

    public static void main(String[] args) {
        /*
        지역변수

        Scope(스코프): 변수가 살아있는 범위(변수의 접근 가능 영역, 변수가 소밀되지 않고 존재할 수 있는 영역)

        선언된 변수에서 나를 감싸고 있는  가장 가까이 있는 {}안에서만 살아있다.(물론 선언 이후)

        Scope 가 없다- 선언된 변수가 살아있는 {}을 벗어나면 Scope 가 없다고 한다. 즉 그 변수를 또 선언할 수 있다.
         */
        boolean ste=true;
        int num1=11;

        if(ste){
            //int num1=22;
            int num2=11; // num2 는 if {}안에서만 살아있고 if {} 을 나오면 변수는 죽는다.
            num1++;
            System.out.println(num1);
            System.out.println(num2);
        }
        {
        int num3=33;
        num3++;
        }
        // System.out.println(num3); // num3의 스코프는 사라졌다.

        for(int i=0;i<10;i++){

        }
        //System.out.println(i); // for 문 안에서 초기화되고 생성된 변수는 for 문 안에서만 사용가능하다.
    }

    public static void sum(int n1){
        int num1=11;//메인 메소드에서 사용한 변수였지만 메인 메소드 중괄호를 벗어나게 되면 num1은 scope 가 없기 때문에 num1을 sum 메소드에서 선언할 수 있다.
    }
}
