package com.green.day01.ch01;

public class SystemOutPrintln {
    public static void main(String[] args) {
        System.out.print(7);
        System.out.println(6);
        System.out.println(3.15);
        System.out.println("3+5 ="+8); // 문자열 + 정수 type 만나면 정수가 자동형변환이 되어 문자열이 된다.
        System.out.println(3.15+"는 실수입니다"); // 실수+문자열 type 이 만나면 실수가 자동형변환이 되어 문자열이 된다.
        System.out.println("3+5"+"의 연산 결과는 8입니다");
        /*
        문자열과 더하기를 하면 어떤 type 이든 문자열로 자동형변환이 된다.
        연산에 우선순위를 주고 싶으면 소갈호()를 사용하여 묶어준다.
         */
        System.out.println(3+5);
    }
}
