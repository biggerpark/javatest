package com.green.day15.ch18;

import java.util.Scanner;

public class MyExceptionClass {
    public static void main(String[] args) {
        System.out.print("나이 입력:");
        try {
            int age=readAge();
            System.out.printf("입력된 나이:%d \n",age);
        } catch (ReadAgeException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("---끝---");

    }

    public static int readAge() throws ReadAgeException{ // 2) 예외를 던질 수 있는 클래스를 throws 하는 메소드 정의
        Scanner scan = new Scanner(System.in);
        int age=scan.nextInt();
        if(age<0){
            scan.close();
            throw new ReadAgeException();
        }
        System.out.println(">>if 문 이후");
        scan.close();
        return age;
    }
}

class ReadAgeException extends Exception{ //❗❗1) Throwable 을 상속 받은 클래스들은 throws 할 수 있다(예외처리 할 수 있다)❗❗
    ReadAgeException() {
        super("유효하지 않은 나이가 입력되었습니다"); // Exception 클래스 생성자 안에 String 이 출력되도록 해놓았겟지?

    }
}
