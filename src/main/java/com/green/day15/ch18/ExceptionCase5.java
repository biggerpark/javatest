package com.green.day15.ch18;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionCase5 {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);


        int n1=0; // ❗❗❗지역변수는 반드시 초기화를 해줘야한다.❗❗❗

        try{
            System.out.println("a/b...a?");
            n1= scan.nextInt();
            int n2= scan.nextInt();
            System.out.printf("%d / %d =%.1f\n",n1,n2,((float)n1)/n2);
        }catch (InputMismatchException e){// String 문으로 입력되었을때 예외 처리
            System.out.println(e.getMessage());
            e.printStackTrace();
        }catch (ArithmeticException e){ // 0으로 나누는 경우의 예외(에러) catch 문 처리
            System.out.println(e.getMessage());
            e.printStackTrace();
        }

        System.out.println("------1-------");


        try{
            System.out.println("a/b...a?");
            n1= scan.nextInt();
            int n2= scan.nextInt();
            System.out.printf("%d / %d =%f\n",n1,n2,((float)n1)/n2);
        }catch (InputMismatchException |ArithmeticException e){ //이런식으로 예외처리를 한 곳에 넣을 수 있다. 대신 내용은 똑같아야한다.
            System.out.println(e.getMessage());
            e.printStackTrace();
        }

        System.out.println("---------2--------");


        try{
            System.out.println("a/b...a?");
            n1= scan.nextInt();
            int n2= scan.nextInt();
            System.out.printf("%d / %d =%f\n",n1,n2,((float)n1)/n2);
        }catch (Exception e){ // 모든 예외를 다 잡을 수 있는 방법(예외의 최상위 class)
            //❗❗❗catch 문이 여러개가 있으면 "Exception e" 는 항상  가장 아래에 적어주자.❗❗❗
            System.out.println(e.getMessage());
            e.printStackTrace();
        }

        System.out.println("-------3--------");

    }
}
