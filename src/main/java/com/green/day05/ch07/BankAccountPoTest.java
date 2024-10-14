package com.green.day05.ch07;

public class BankAccountPoTest {
    public static void main(String[] args) {
//        System.out.println("balance"+BankAccountPo.balance);//BankAccountPo 클래스 안의 속성인 balance 를 불러온것
//        BankAccountPo.deposit(1000);//같은 클래스 안이었으면 클래스명은 생략 가능,BankAccountPo의 deposit 메소드를 호출
//        int deposit=BankAccountPo.deposit(1000);//호출한 메소드 값을 deposit 값에 초기화, 비void 메소드 이기때문에 가능
//        System.out.println("deposit:"+ deposit);//선언된 deposit 값을 출력
//        System.out.println("balance"+BankAccountPo.balance);//deposit 이라는 메소드를 통해 정적변수의 값을 변환시킴
//
//        deposit=BankAccountPo.deposit(4000); // 메소드를 통해서 속성의 값을 변경할 수 있다.
//        deposit=BankAccountPo.deposit(4000);
//        System.out.println("deposit"+deposit);
//
//        deposit=BankAccountPo.withdraw(2000);
//        System.out.println("deposit:"+deposit);
//
//        deposit=BankAccountPo.checkMyBalance();
//        System.out.println("잔액2:"+deposit);

        System.out.println("balance:"+BankAccountPo.balance);
        BankAccountPo.deposit(1000);
        System.out.println("balance:"+BankAccountPo.balance);
        int deposit=BankAccountPo.deposit(4000);
        deposit=BankAccountPo.deposit(4000);
        System.out.println("balance:"+BankAccountPo.balance);
        System.out.println("deposit:"+deposit);
        deposit=BankAccountPo.withdraw(1000);
        System.out.println("balance:"+BankAccountPo.balance);
        System.out.println("deposit:"+deposit);
        BankAccountPo.checkMyBalance();
        System.out.println("balance:"+BankAccountPo.balance);

    }
}
