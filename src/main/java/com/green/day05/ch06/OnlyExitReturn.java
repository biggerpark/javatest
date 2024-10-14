package com.green.day05.ch06;

public class OnlyExitReturn {
    public static void main(String[] args) {
        divideOp(4,2);
        divideOp(6,2);
        divideOp(9,0);
        divideOp(3,1);
        /*
        모든 프로그램 언어는 0으로 나눌려고 하면 수학적 예외가 발생한다. 이런 오류를 피하고 싶을때 "예외처리"를 해야한다.
        예외처리하는 방법은 크게 2가지가 있다.
        1)예외가 발생되는 상황을 나오지 않게 한다.
        2)예외가 발생하는 상황을 try-catch 문으로 해결한다.
        */

    }
    static void divideOp(int n1,int n2){
        if(n2==0){
            return; // void 메소드에서 return 을 만나면 아무런 데이터를 가지지 않고 메소드를 호출한 곳으로 돌아간다.
        }
        System.out.printf("나눗셈 결과: %d\n",n1/n2);

    }
}
