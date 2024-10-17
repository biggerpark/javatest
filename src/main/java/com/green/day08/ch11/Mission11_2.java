package com.green.day08.ch11;

public class Mission11_2 {
    /*
    다음 주민등록 번호의 중간에 삽입된 "-"을 지우고 공백으로 채워서 출력하는 프로그램을 작성해보자.
    단 StringBuilder 클래스를 활용하여 빈번한 문자열의 생성이 발생하지 않도록 해야한다
    990925-1012999

    콘솔에 990925 101299으로 나와야한다.
     */

    public static void main(String[] args) {
        StringBuilder str=new StringBuilder("990925-1012999");
        int dashIdx=str.indexOf("-");
        str.replace(dashIdx,dashIdx+1," ");
        System.out.println(str);
    }

}
