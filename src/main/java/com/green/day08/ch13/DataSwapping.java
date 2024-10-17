package com.green.day08.ch13;

public class DataSwapping {
    public static void main(String[] args) {
        //❗변수의 값을 서로 저장하고 싶을때 Swap 을 해야한다.❗
        // 이때 변수 하나를 잠시 옮겨놓을수 있는 공간을 만들어놔야한다.

        int n1=10, n2=20;
        int temp;

        temp=n1;

//        n1=n2;
//        n2=n1; // 이렇게 하면 둘다 20이 나온다.

        n1=n2;
        n2=n1;


        System.out.printf("n1:%d, n2:%d\n",n1,n2);
        //n1:20, n2:10
    }
}
