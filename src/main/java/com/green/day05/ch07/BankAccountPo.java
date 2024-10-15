package com.green.day05.ch07;

import com.green.day06.ch07.BankAccount;

public class BankAccountPo {

    //전역변수를 메소드를 통해 변경할 수 있고, 전역변수의 값을 return 을 통해 메소드를 통해 호출을 할 수 있다.

    static int balance=0; // static 전역 변수, 선언된 이후 중괄호 안에서 모두 살아있는 변수(전역변수)

    // static 이 붙어있으면 다른 클래스에서 클래스.메소드로 해서 호출되어도 살아있다. static 이 붙으면 객체화가 필요가 없다. 정확히 객체안에 있는 전역변수는 아니다.
    // static 앞에 private 이 붙으면 해당 class 안에서만 변수를 이용할 수 있다.


    static int deposit(int amount){ // 입금을 담당하는 클래스 메소드
        //balance=balance+amount;
        balance+=amount; // 정적변수 balance 의 값 증가 및 대입
        return balance; // 정적변수 balance 의 값 반환
    }

    static int withdraw(int amount){ // 출금을 담당하는 메소드
        balance=balance-amount;
        return balance;
    }
    static int checkMyBalance(){ // 예금 조회를 담당하는 메소드
        System.out.println("잔액: "+ balance);//정적변수의 값을 출력
        return balance;
    }




}
