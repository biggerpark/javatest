package com.green.day06.ch07;

import com.green.day05.ch07.BankAccountPo;

public class BankAccount {

    int balance=0; // balance 라는 전역변수를 멤버필드에 선언 및 초기화



    void deposit(int amount){
        balance+=amount;
    }


    void withdraw(int amount){
        balance-=amount;
    }


    void checkMyBalance(){
        System.out.printf("balance: %d\n",balance);
    }

    void outPut(int i){
        System.out.println(i);
    }



    public static void main(String[] args) {
        BankAccount ba=new BankAccount();//같은 class 안에서도 클래스의 멤버 변수,메소드에 static 이 붙어 있지 않으면 객체화를 해주어야한다.
        ba.deposit(1000);
        System.out.println("ba.balance:"+ba.balance);

        BankAccount ba2=new BankAccount();
        ba2.outPut(4);
        System.out.println("ba2.balance"+ba2.balance);

    }
}
