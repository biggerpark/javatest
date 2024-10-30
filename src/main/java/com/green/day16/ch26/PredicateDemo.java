package com.green.day16.ch26;

//p.674
/*
predicate: 서술어, 술부, 주어의 동작/상태/성질 따위를 서술하는 말

Predicate 함수형 인터페이스: 파라미터는 하나 ,타입은 제네릭(T), 추상메소드의 리턴 타입은 boolean

람다식으로 표현 가능한 인터페이스는 추상메소드가 하나밖에 못가지므로, "public test(T t)" 라는 추상메소드만 가진다. 이 추상메소드의 리턴타입이 boolean 타입이다.

❗❗public interface Predicate<T>{
        public boolean test(T t);
                (return ~) 가 나중에 Predicate 를 implements 한 객체를 생성할때 붙는다. 그래서 -> 다음엔 boolean 타입이 와야한다.
        }❗❗




 */

import java.util.function.Predicate;

public class PredicateDemo {
    public static void main(String[] args) {
        Predicate<Integer> preMore10=n->n>10;
        System.out.println(preMore10.test(9));
        System.out.println(preMore10.test(10));
        System.out.println(preMore10.test(11));


        //남자, 남, 여자, 여 이러한 값들만 허용(true), 나머지 false
        String gender="여자";
        Predicate<String> preCheckGender = s->"남".equals(s) || "남자".equals(s)||"여".equals(s)||"여자".equals(s);
        if(preCheckGender.test(gender)){ // gender 로 들어온 인자가 위의 s로 들어간다. 그리고 test 추상메소드의 리턴타입인 boolean 을 리턴하기 위해 -> 뒤에는 불린으로 나올 수 있는 식이 들어와야한다.
            System.out.println(gender);
            System.out.println("성별을 잘 입력하셨습니다");
        }else{
            System.out.println("성별을 확인해주세요");
        }
        System.out.println("---------------");

        examPredicate(preMore10,9);
        examPredicate(n->n>10,9);
        examPredicate(n->n>10,11);
    }

    public static void examPredicate(Predicate<Integer> p,int n){
        System.out.println(p.test(n));
    }




}
