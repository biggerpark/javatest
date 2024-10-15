package com.green.day06.ch07;

public class DupRef {
    public static void main(String[] args) {
        BankAccount ba1=new BankAccount();
        // ❗❗❗ba1은 BankAccount 의 주소값만 저장할 수 있다.❗❗❗


        BankAccount ba2=ba1;//참조변수 ba2에 복사 되는 것은 위에서 생성된 객체의 주소값이 복사된다. 이러한 주소값 복사를 얕은 복사(shallow copy)라 한다.

        ba1.deposit(1000);//balace 값이 1000으로 됨

        ba2.checkMyBalance(); // 똑같은 주소값이 복사되어서 사용되었기 때문에 balance 값이 1000이 나온다.


    }
}
