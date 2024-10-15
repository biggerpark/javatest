package com.green.day06.ch07;

/*
❗❗❗❗❗❗이해 꼭 하고 넘어가기❗❗❗❗❗❗

일반변수(Primitive type)
참조변수(Reference type)
차이점을 설명하는 예제



핵심은 일반변수는 메소드를 호출해도 본체가 바뀌고
참조변수는 주소값을 부여받기 때문에, 그 주소값으로 접근해서 그 주소값 안에서 바꿀거 바꾸고 한다.
참조변수는 중간단계를 하나 더 거친다고 하면 알 수 있다.
 */
public class PrmitiveVsReferenceTest {
    public static void main(String[] args) {
        int num = 10; // 지역변수 num 초기화
        changeNum(num);//인자값이 int 이므로 매개변수가 int 인 메소드가 호출된다.
        System.out.println("num:" + num);/* num은 10이다.
       100이 아니라 10인 이유는 main 메소드에서 선언,대입한 num 변수(main-num)와 chageNum 메소드에 있는 num 매개변수(c-num)은 다른 공간이다.
       main-num이 가지고 있는 값을 복사하여 c-num에 저장했다. c-num값을 변경한다고 하여 main-num값이 변경되는 것이 아니다. 왜? 다른 공간이기 때문이다.
       */

        NumberBox nb = new NumberBox(); //nb 라는 참조변수 주소값 생성(메인메소드가 살아있는동안 살아있는 주소값(지역변수))
        nb.num = 10; // main 메소드에 있는 nb 참조 변수, nb 주소값(주소값 012(예를들어))을 통해 클래스 NumberBox의 num 멤버변수를 10으로 변경 처리
        changeNum(nb); // 1)nb의 타입은 NumberBox 라는 참조타입이기 때문에 매개변수로 참조타입을 가지고 있는 메소드 호출, nb 라는 주소값을 메소드 매개변수에 보냄
        System.out.println("nb.num:" + nb.num);//3) 100
        /*
        main 메소드에 있는 nb 변수(main-nb)와 changeNum 메소드에 있는 nb 매개변수(c-nb)는 다른 공간이다.
        다만 같은 값(주소값)를 가지고 있다. 그로 인해 같은 객체에 접근할 수 있다.
        c-nb를 통해 객체의 num 값을 변경을 했다면 main-nb를 통해 접근했을 때 변경된 값을 얻게 된다.
         */
    }

    public static void changeNum(int num) { // 매개변수가 다른 타입이면 똑같은 메소드명을 사용할 수 있다.
         num = 100;
    }

    public static void changeNum(NumberBox nb) { //❗17열에 있는 nb 변수와 다른 공간이다.하지만 19에서 nb 라는 주소값을 매개변수로 받기 때문에 같은 주소값을 접근한다.
        nb = new NumberBox(); //3)이게 추가되었을때 어떻게 출력될까 생각해보기, nb 라는 주소를 새로운 대입연산자를 만나서 새로운 주소값(013)을 부여받는다.
        nb.num = 100; // 2)같은 주소값(012)으로 접근했기 때문에 그 주소값(012)의 num 을 100으로 바꾼다.

    }
}


class NumberBox {
    int num; // 객체화 할때 기본적으로 int 는 0이 세팅된다.
}
