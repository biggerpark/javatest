package com.green.day02.ch05;

import java.util.Scanner;

public class MissionIf3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("숫자를 하나 입력하세요>>");
        int input = scan.nextInt();

        System.out.printf("input: %d\n", input);

        System.out.printf("%d는 %c 수 입니다", input, ((input % 2 == 0) ? '짝' : '홀'));

        System.out.println("---끝---");

        //대문자로 시작하는 변수는 레퍼런스 변수  ex) String, Scanner
        //레퍼런스 변수는 객체의 주소값을 알려주는것.
        //객체는 자리차지를 하고있고 주소값을 알려줌으로써 객체를 이용하는것.
        //원래 객체생성은 new 를 입력해야한다.String 은 워낙 자주 사용하므로 그냥 String 으로 입력
    }
}






