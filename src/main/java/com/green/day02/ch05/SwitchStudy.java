package com.green.day02.ch05;

import java.util.Scanner;

public class SwitchStudy {
    public static void main(String[] args) {
        String name=new String("홍길동");
        String name2=new String("홍길동");

        System.out.printf("name: %s\n",name);
        System.out.printf("name2: %s\n",name2);
        System.out.printf("name==name2 : %b\n",name.equals(name2));

        Scanner scan=new Scanner(System.in);
        System.out.println("문자열을 입력해주세요 >>");
        String input=scan.next();


        if("abc".equals(input)){
            System.out.println("def");
        }


        //문자열이 같냐 할때는 equals 함수를 쓰는 것 보다 switch를 사용하여 case를 나누어서 출력하는 것이 더 좋다.
        switch(input){
            case "abc":
                System.out.println("switch-def");
                break;
        }


        System.out.println("--끝--");
    }
}
