package com.green.day08.ch11;

import com.green.day01.ch01.SystemOutPrintln;

public class BuildString {
    public static void main(String[] args) {
        //문자열 "123'이 저장된 인스턴스 생성
        //반복문에서 문자열을 합칠때 사용
        StringBuilder sb=new StringBuilder("123");
        sb.append(45678);//StringBuilder 라는 클래스의 객체 주소값 sb 참조변수의 append 매소드 사용하여 문자열 합치기
        System.out.println(sb);
        sb.delete(0,2);
        System.out.println(sb);
        //sb.delete(1);//인자 1개는 없다


        //미니 미션
        //모든 문자열을 지우는 방법
        sb.delete(0,sb.length());
        System.out.println(sb);


        sb.append(345678);
        System.out.println("sb:"+sb);

        sb.replace(0,3,"AB");//0자리에서 0,1,2 3개를 AB로 바꿈
        String str=sb.toString();//StringBuilder 에서 String 으로 바꾸고 싶을때 toString 메소드를 이용한다.
        System.out.println(str);//sb의 주소값이 그대로 str 로 대입했다.
//        str.replace(0,3,"CD");
        System.out.println("sb:"+sb);


        StringBuilder sb2=sb.reverse();//sb의 문자열을 반대로 뒤집고, 주소값을 그대로 리턴시켜서 StringBuilder 객체의 sb2의 주소값에 대입, 즉
        sb2.replace(0,2,"kk");//체이닝 기법, return this; 가 핵심이다

        System.out.println("sb:"+sb);
        System.out.println("sb==sb2:"+(sb==sb2));

        //마지막 인덱스를 구하는 방법
        sb.delete(0,sb.length()-1);
        System.out.println(sb);


//        String str3="abcdef";
//        str3.replace(0,2,"kk");

    }


}
