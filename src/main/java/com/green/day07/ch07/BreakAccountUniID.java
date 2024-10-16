package com.green.day07.ch07;

class BankAccount{
    //1)멤버필드 인스턴스 변수 선언
    private String accNumber;//계좌번호
    private String ssNumber;//주민번호
    private int balance;

    //3)인스턴스 변수인 계좌번호와 주민번호를 변경할 수 있게 해주는 메소드를 만든것. 이건 생성자는 아니고 그냥 메소드이다.
    void initAccount(String acc,String ss, int bal){
        accNumber=acc; // 인스턴스 변수를 매개변수의 값으로 초기화
        ssNumber=ss;   // 인스턴스 변수를 매개변수의 값으로 초기화
        balance=bal;   // 인스턴스 변수를 매개변수의 값으로 초기화
    }

    //2)멤버메소드 인스턴스 메소드 정의
    void deposit(int amount){
        balance+=amount;
    }


    void withdraw(int amount){
        balance-=amount;
    }


    void checkMyBalance(){
        System.out.printf("계좌번호: %s\n",accNumber);
        System.out.printf("주민번호: %s\n",ssNumber);
        System.out.printf("잔   액:  %d\n",balance);
    }
}
public class BreakAccountUniID {
    public static void main(String[] args) {
       BankAccount ba1=new BankAccount(); //객체 생성 및 주소값 ba1 참조변수에 부여
       ba1.initAccount("12-34-89","990909-9090990",10000);

       BankAccount ba2=new BankAccount();//객체 생성 및 주소값 ba2 참조변수에 부여
       ba2.initAccount("33-55-09","770808-5959007",20000);

       ba1.checkMyBalance();
       ba2.checkMyBalance();
    }

}
