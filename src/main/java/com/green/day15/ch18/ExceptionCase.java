package com.green.day15.ch18;

public class ExceptionCase {
    /*
    예외처리 하기(에러나지 않게 처리하는 방법)
     */
    public static void main(String[] args) {
        int n1=10;
        int n2=0;

        System.out.printf("%d / %d = %d\n",n1,n2,(n1/n2));
        System.out.println("--종료--");
    }
}
