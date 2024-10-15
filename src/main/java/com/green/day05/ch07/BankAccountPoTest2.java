package com.green.day05.ch07;

public class BankAccountPoTest2 {
    public static void main(String[] args) {
        BankAccountPo po1=new BankAccountPo();//객체화, po1이라는 주소값 생성
        po1.deposit(1000);
        po1.checkMyBalance();

        BankAccountPo po2=new BankAccountPo();//po2라는 새로운 주소값 생성
        po2.checkMyBalance();

        BankAccountPo.checkMyBalance(); // 클래스명에 . 을 붙여 불러올 수 있다.

    }
}
