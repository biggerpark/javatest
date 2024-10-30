package com.green.day16.ch26;

import java.util.function.BiPredicate;

public class BiPredicateDemo {
    public static void main(String[] args) {
        //문자열의 길이가 내가 정한 정수값 보다 크면 true, 아니면 false
        //BiPredicate 는 Predicate 와 다르게 제네릭을 두개 사용할 수 있다.
        BiPredicate<String,Integer> conv=(str,length)->str.length()>length;


        System.out.println(conv.test("Robot", 3)); //true
        System.out.println(conv.test("Box",5)); //false



        //문자열의 길이를 비교할 수 있는 BiPredicate 함수형 인터페이스의 람다식 표현 해보자.

        String str1="Hello";
        String str2="Halo";
        String str3="Halo";
        String str4="Hal00o";

        BiPredicate<String,String> conv2=(st1,st2)->st1.length()==st2.length();


        if(conv2.test(str1,str2)) {
            System.out.println("두 문자열의 길이는 같습니다");
        }else{
            System.out.println("두 문자열의 길이는 다릅니다");
        }





    }
}
