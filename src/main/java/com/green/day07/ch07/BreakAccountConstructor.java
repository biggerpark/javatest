package com.green.day07.ch07;

class BankAccount2{

    private String accNumber;//계좌번호
    private String ssNumber;//주민번호
    private int balance;


    void initAccount(String acc,String ss, int bal){ //3) 메소드로 만든 setter
        accNumber=acc;
        ssNumber=ss;
        balance=bal;
    }


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

    BankAccount2(String acc,String ss, int bal){//4)생성자, 3)의 메소드와 차이점을 알아야한다.
//        accNumber=acc;
//        ssNumber=ss;
//        balance=bal;
        this.accNumber=acc;
        this.ssNumber=ss;
        this.balance=bal;
    }

    BankAccount2(){ // 5) 기본생성자의 모습, 4)의 파라미터가 있는 생성자와 차이점을 알아야한다
        super();//super 는 생략가능
    }
}

public class BreakAccountConstructor {
    /*
    1)생성자 만드는 방법 배워보자

    2)생성자는 메소드의 한 종류라 볼 수 있다. 굳이 나누자면 class 는  멤버필드, 생성자, 멤버메소드 이렇게 이루어져잇다고 볼 수 있다.
    이번엔 파라미터가 있는 생성자를 만들거다.

    ❗❗❗메소드와 다른점은 2가지이다.❗❗❗
    아래 두가지를 반드시 지켜야 생성자가 만들어진다.
     1.이름이 클래스명과 같다
     2.반환형(리턴타입)을 작성하지 않는다.

    ❗❗생성자의 특징❗❗
    1. 오로지 객체 생성할때만 호출할 수 있다. 객체생성 이후에는 호출 불가, 그렇기 때문에 일반 메소드처럼 사용할 수 없다.

    2. 생성자를 작성하지 않으면 기본생성자가 자동으로 만들어진다.
       그치만 오버로딩된 생성자를 하나라도 작성을 하게 되면 기본 생성자를 자동으로 만들어주지 않는다. 그럴땐 기본 생성자를 만들어줘야 한다.
       파라미터가 있는 생성자 or 오버로딩된 생성자
       객체생성을 하는 동시에 멤버필드의 인스턴스 변수를 초기화 하고 싶을때 파리미터가 있는 생성자(오버로딩된 생성자)를 호출한다.

       오버로딩(Overloading): 같은 이름의 메소드를 여러개 만들 수 있는 기법(파라미터가 다르면 가능, 파라미터의 타입의 종류는 같아도 순서가 다르면 가능)

    ❗❗❗객체생성된 new 키워드 우측에 적는 것은 생성자 호출이다. 모든 객체지향 언어는 객체를 생성할 때 생성자를 호출해야 한다❗❗❗
     */
    public static void main(String[] args) {
        BankAccount2 ba1=new BankAccount2(); // 6) 만약 5)의 기본생성자를 작성하지 않았으면 생성자가 호출되지 않으므로 객체 생성이 되지 않고 빨간줄이 뜬다.
        ba1.checkMyBalance(); // 7)생성자 안에 아무런 변수를 넣지 않았으므로 기본값인 null 이 나올것이다


        BankAccount2 ba2=new BankAccount2("111-222","990909-178888",100000);
        /*
        파라미터가 있는 생성자(=오버로딩된 생성자)를 호출하여 객체 생성 한것
        멤버필드의 인스턴스변수를 초기화 한것
         */
        ba2.checkMyBalance(); //초기화 된 값이 나올것이다.
    }

}

