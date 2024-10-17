package com.green.day07.ch11;

import com.green.day01.ch01.SystemOutPrintln;

public class StringStudy {
    public static void main(String[] args) {
        String str1="Coffee";
        String str2="Bread";

        String str3=str1.concat(str2); // concat()은 str1의 문자열과 str2의 문자열을 합치는 메소드이다.
        System.out.println(str3);

        String str4=str1+str3;
        System.out.println(str4);

        String str5=str2.concat(str1);
        System.out.println("str1:" + str1);
        System.out.println("str2:"+str2);
        System.out.println(str5);

        System.out.println("----------");
        String str6="abcdefklkd";
        System.out.println("str6.substring(3):"+str6.substring(3));// substring 은 문자열 추출할때 사용한다. 이 메소드는 파일명에서 확장자 추출할때 많이 사용한다.
        System.out.println("str6.substring(3):"+str6.substring(4,7));// substring 메소드도 오버로딩 되어있으므로 인자 2개를 보내면 글자 처음 0 번에서 시작하여 4번부터 7번의 전인 6번 까지 나온다.

        String str7="LExi";
        String str8="Lexi";
        System.out.println(str7.equals(str8));//문자열이 같은지 비교할때 equals 를 사용한다. 주소값이 같은지 비교할때는 ==을 사용한다
        System.out.println(str7.compareTo(str8)); // 0이 나오면 같은 내용의 문자열이다
        System.out.println(str7.equalsIgnoreCase(str8));//대소문자 구분없이 같은 지 비교하는 메소드, 영어만 된다.

        String fileNm="nice_Very.Nice.jpg";
        System.out.println(".의 처음 위치값:"+fileNm.indexOf("."));//indexOf는 왼쪽에서부터 .을 찾다가 가장 먼저 나오는 .의 위치 값을 리턴
        System.out.println(".의 마지막 위치값:"+fileNm.lastIndexOf("."));//indexOf는 왼쪽에서부터 .을 찾다가 가장 나중에 나오는 .의 위치 값을 리턴



        int n=10;
        String str9=n+"";//이렇게 써도 되지만 밑에 처럼 쓰자.
        String str10=String.valueOf(n);//모든 타입 n 을 String 으로 변경하여 참조변수 str10에 넣을 수 있다.

        System.out.println("------------");

        String str11="abcdefgcd";
        String str11Result=str11.replace("cd","CD");
        System.out.println("str11Result"+str11Result);






    }
}
