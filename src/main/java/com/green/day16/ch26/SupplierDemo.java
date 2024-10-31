package com.green.day16.ch26;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

//Supplier 함수형 인터페이스는 파라미터가 없고 리턴만 존재한다. 그래서 파라미터가 없으므로 () 로 적어둔다
//리턴타입은 우리가 정할 수 있다.

public class SupplierDemo {
    public static void main(String[] args) {
        Supplier<Integer> supRandom=()->(int)(Math.random()*50.0);
        Supplier<Integer> supRandom2=()->(int)(Math.random()*31.0)+20;

        /*
        public interface Supplier<T>{
                void T get();
        }

         */


        System.out.println(supRandom.get());//Supplier 의 추상메소드는 get() 이구나 알 수 있다.


        List<Integer> list=makeIntList(supRandom,5);//Q1) 랜덤 정수값 5개를 가지고 있는 ArrayList 를 리턴해주세요
        System.out.println(list);

        List<Integer> list2=makeIntList(supRandom2,8);//Q2) 랜덤 정수값 (20~50) 중 8개를 가지고 있는 ArrayList 를 리턴
        System.out.println(list2);

    }


    public static List<Integer> makeIntList(Supplier<Integer> supRandom,int length){
        List<Integer> list=new ArrayList<>();

        for(int i=0;i<length;i++){
            list.add(supRandom.get());
        }
        return list;

    }
}
