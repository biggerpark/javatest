package com.green.day15.ch18;

import java.util.Scanner;

public class MyExceptionClass {
        /*
        자바에서 일부러 예외를 던지려면 throw 문을 사용하여 예외 객체를 생성하고 던지면 됩니다. 예를 들어, 사용자 정의 예외를 던지는 코드는 다음과 같습니다:

        public class CustomException extends Exception {
         public CustomException(String message) {
        super(message);
         }
         }

        public class Main {
        public static void main(String[] args) {
        try {
            checkValue(0);
        } catch (CustomException e) {
            System.out.println("Caught exception: " + e.getMessage());
        }
        }

        public static void checkValue(int value) throws CustomException {
        if (value <= 0) {
            throw new CustomException("Value must be greater than zero.");
        }
        System.out.println("Value is valid: " + value);
        }
        }

        위 코드에서 checkValue 메서드는 값이 0 이하일 경우 CustomException 을 던집니다.
        main 메서드에서 이 예외를 처리하고, 적절한 메시지를 출력합니다.
         */
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
