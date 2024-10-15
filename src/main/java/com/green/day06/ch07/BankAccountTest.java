package com.green.day06.ch07;

public class BankAccountTest {
    public static void main(String[] args) {
        //BankAccount.deposit(4000);
        BankAccount ba=new BankAccount();// 객체화를 해주는것,ba는 BankAccount 객체 주소값만 담을 수 있는 참조변수이다.
        ba.deposit(1000); // 참조변수 ba를 이용해 객체의 주소값을 불러와 deposit 이라는 메소드를 이용하는 것.
        ba.checkMyBalance();
        ba.deposit(2000);
        ba.checkMyBalance();

        BankAccount ba3=new BankAccount();
        ba3.checkMyBalance(); // balance 값이 0원이 나온다. 그 이유는 새로운 객체가 만들어져서 ba3라는 참조변수에 주소값을 새로 새긴다.
        ba3.deposit(40000);
        ba3.withdraw(1000);
        ba3.checkMyBalance(); //balance:39000


        ba.checkMyBalance();//balance: 3000

        //BankAccount ba2=new String("안녕"); // ba2는 String 객체 주소값을 저장할 수 없다. ba2는 BankAccount 의 객체 주소값만 담을 수 있다.


    }
}
