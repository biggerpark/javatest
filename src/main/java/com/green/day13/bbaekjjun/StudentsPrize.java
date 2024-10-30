package com.green.day13.bbaekjjun;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentsPrize {
    public static void main(String[] args) {
       /*
        사용자에게 학생의 이름과 점수를 입력받는 프로그램을 작성하세요.
        점수는 0부터 100 사이의 정수여야 하며, 이 범위를 벗어나면 IllegalArgumentException을 발생시킵니다.
        학생의 점수를 입력받은 후, 평균 점수를 계산하여 출력합니다.
        사용자가 입력한 학생 수는 제한이 없으며, "exit"를 입력하면 입력을 종료합니다.
        잘못된 입력(숫자가 아닌 점수, 유효하지 않은 범위 등)을 처리하여 적절한 메시지를 출력하세요.
        */
        Scanner scan = new Scanner(System.in);

        List<String> students = new ArrayList<>();
        List<Integer> prize = new ArrayList<>();


        try {
            while (true) {
                System.out.println("학생 이름을 입력하세요> (종료를 원하면 exit)");
                String str1 = scan.next();
                if (str1.equals("exit")) {
                    break;
                }
                students.add(str1);


                try {
                    System.out.println("국어점수 >");
                    int kor = scan.nextInt();
                    if (kor < 0 || kor > 100) {
                        throw new IllegalArgumentException();
                    }
                    System.out.println("영어점수 >");
                    int eng = scan.nextInt();
                    if (eng < 0 || eng > 100) {
                        throw new IllegalArgumentException();
                    }
                    System.out.println("수학점수 >");
                    int math = scan.nextInt();
                    if (math < 0 || math > 100) {
                        throw new IllegalArgumentException();
                    }
                    int sum = (kor + eng + math) / 3;
                    prize.add(sum);

                } catch (IllegalArgumentException e) {
                    System.out.println("범위내의 숫자가 아닙니다");
                    break;
                } catch (Exception e) {
                    System.out.println("숫자가 아닙니다");
                    break;
                }
            }

        } finally {
            scan.close();
            System.out.println("---------결과-----------");
        }


        for (int i = 0; i < students.size(); i++) {
            System.out.printf("학생이름: %s, 평균점수: %d\n", students.get(i), prize.get(i));
        }



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


    }
}
