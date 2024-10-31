package com.green.day16.ch26;

import java.util.function.Consumer;

public class ConsumerDemo {
    public static void main(String[] args) {
        //Consumer 인터페이스는 입력을 받아서 아무것도 반환하지 않는 추상메소드를 정의합니다.
        // 주로 람다 표현식과 함께 사용되어, 특정 동작을 수행하는 데 유용합니다.

        Consumer<Integer> cons=(n1)-> {if(n1<0){
            System.out.println(-n1);
        }else{
            System.out.println(n1);}};


        cons.accept(10); //콘솔에 10
        cons.accept(-20); //콘솔에 20
        cons.accept(-30); //콘솔에 30
        cons.accept(30); //콘솔에 30


        Consumer<String> cons2=(str)-> System.out.printf("%s는 %d글자입니다\n",str,str.length());

        cons2.accept("abc"); //콘솔에 "abc" 는 3글자입니다"
        cons2.accept("dddd"); //콘솔에 "dddd" 는 4글자입니다"
    }


}
