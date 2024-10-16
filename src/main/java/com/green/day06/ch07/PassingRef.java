package com.green.day06.ch07;

public class PassingRef {
    public static void main(String[] args) {
        BankAccount ba=new BankAccount();//BankAccount 객체화, ba에 주소값을 새김
        ba.deposit(1000); // deposit 메소드 호출
        ba.deposit(2000); // deposit 메소드 호출

        BankAccount ba2=ba;   // 주소값 복사
        ba2.checkMyBalance(); // checkMyBalance 메소드 호출
        ba.checkMyBalance();  // checkMyBalance 메소드 호출, ba2와 같은 주소값이므로 똑같은 값이 출력될것이다.


        ba2=null; // null의 의미는 객체를 가르키지 않고 있다. 즉 ba2에 주어졌던 객체의 주소값을 없애는것.
        ba2=new BankAccount(); // 새롭게 주소값을 저장할 수 있다. ba2 앞에 BankAccount 붙이지 않는다. 왜냐하면 앞서서 이미 BankAccount ba2 로 선언을 하였기 때문이다.
        ba2.checkMyBalance();//ba2는 새로운 주소값을 받으므로 초기화된 balance 값인 0 이 나올것이다.
        if(ba2!=null){ // null인지 체크
            ba2.checkMyBalance();
        }


        check(ba); //  Q) 이렇게만 주어졌을 때 메소드를 만들어라.
                   /*  A)    1. void,return
                             2. static, non-static -> non-static 이었으면  두가지 체크해줘야한다.

                             -return 이었으면 = 이 있어야하는데 없으므로 void 이다

                             -non static 이었으면 객체의 주소값이 새겨진 참조변수를 이용했을 것이다. 즉 "참조변수.check(ba)" 였을 것이다.

                              ✨non-static 이었으면 밑의 코드가 추가되었어야한다.
                               PassingRef pf=new PassingRef();
                               pf.check(ba);

                             */

    }
    //
    static void check(BankAccount ba){
        ba.checkMyBalance();
        //만약 static 이 안붙었으면 ✨ 에 보이는 것처럼 check 메소드를 포함하고 있는 클래스를 객체화 해줬어야 한다.
        //check 메소드 안의 매개변수는 호출하는 인자 의 type 이 참조타입이기 때문에 BankAccount ba 라고 매개변수에 적어준다.
        //메인 메소드에서 만들어진 ba 참조변수(주소값)이 매개변수로 들어가고 이 매개변수의 주소값의 메소드가 호출된다.



    }
}
