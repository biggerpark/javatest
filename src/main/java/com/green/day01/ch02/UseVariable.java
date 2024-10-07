package com.green.day01.ch02;

public class UseVariable {
    public static void main(String[] args) {
        /*
        변수선언을 하는 이유는 여러곳에서 사용을 할때 참조할 수 있도록 한다.
        왜냐, 값이 변경되었을때 변수값만 수정을 하면 모두 변경이 되기 때문이다.

        궁극적인 목적은 변수에 데이터를 저장하기 위해서다.

        변수를 사용하기 위해서는 선언을 해야한다.
        선언을 할때 데이터 타입을 명시하는데
        해당 데이터 타입만 저장이 될 수 있도록 한다.

         */

        int num1=10;


        /*
        int -데이터타입: 이 변수에 들어갈 수 있는 데이터를 한정/제한
        num1- 변수명: 변수를 사용할 때 쓸 이름
         */

        int num2=20; //선언과 초기화를 동시에 할 수 있음

        int num3=num1+num2;

        String str1="안녕";
        String str2="하세요";

        System.out.println(num3);

        System.out.printf("num1:%d,num2:%d,num3:%d\n",num1,num2,num3);
        System.out.printf("%s+%s\n",str1,str2);
        System.out.println("--끝--");

        //printf 는 문자열 안에 값을 주입시키는것.





    }
}
