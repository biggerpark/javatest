package com.green.day13;

import java.util.ArrayList;
import java.util.List;

public class ListStudy2 {
    public static void main(String[] args) {
        //Generic 설명
        //(E)- 들어갈 수 있는 타입만 들어간다.
        //Generic 을 사용하면 실행할때 타입이 결정되는게 Generic 이다.

        //List< >  < >  이 안에는 기본타입은 못들어간다. 모든 기본타입은 참조타입이 있다. int 만 Integer 로 해주면 된다.
        List<Integer> list=new ArrayList(); // 정수형 값만 들어갈 수 있는 ArrayList 객체가 만들어 짐.
       // list.add("");//위에 Integer 즉 정수타입만 받을 수 있기 때문에 String 은 추가할 수 없다.


        list.add(10);
        list.add(20);
        list.add(30);


        int n1=list.get(0); //형변환 하지 않아도 된다. 만약 Generic 을 사용하지 않았으면 list.get(0)이 object 타입이기 때문에 형변환 해줬어야 한다.


        //특징1)
        list.add(1,60); // index 방에 element 값을 추가하고 한칸씩 밀려난다.

        //특징2)
        list.remove(2); // 2번째 방 값이 삭제

        System.out.println(list);


        //특징3)
        System.out.println(list.size()); // list 주소값에 저장된 배열의 길이를 알려주는 메소드

        //특징4)
        list.clear(); // 배열의 모든 값을 지워준다.
        System.out.println(list);


    }
}
