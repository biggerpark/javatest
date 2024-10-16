package com.green.day07.ch010;

import java.io.PrintStream;

public class SystemPrintln {
    public static void main(String[] args) {
        /*
        System.abc.kkk().ggg

        System.abc 의 결과물을 "A"라 지칭하자
        A.kkk().ggg



        System:클래스
        abc:참조변수, 멤버필드
        kkk(): 메소드, 리턴타입은 참조타입이다.
        ggg: kkk()메소드가 리턴하는 객체의 멤버필드
         */





        System.out.println();


        //모르겟음
        //PrintStream out=new PrintStream();
        //


        PrintStream out=System.out;
        out.println();

        //System: 클래스
        //out: static final 의 멤버필드, PrintStream 객체의 주소값을 담을 수 있다.
        //println(): PrintStream 의 객체화를 통해 주소값이 저장된 out의 메소드

        /*
        PrintStream 은 println(int i), println(char c), println(String str) 등의 메소드를 가지고 있고 매개변수가 다르면 똑같은 이름의 메소드를 사용할 수 있다.
        이것이 오버로딩이다.
        만약 오버로딩이 없다면, printlnInt(int), printlnChar(char c), printlnString(String str) 이런식으로 메소드를 만들어야 한다.
         */
    }
}
